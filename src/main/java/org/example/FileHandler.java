package org.example;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileHandler {
    private String filename;

    public FileHandler() {
        String path = Paths.get(".").toAbsolutePath().normalize().toString();
        this.filename = path + "/data.txt";
    }

    public ArrayList<ClothingData> loadData() throws IOException {
        ArrayList<ClothingData> dataList = new ArrayList<>();
        File file = new File(filename);
        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            System.out.println("파일을 불러옵니다...");
            String line;
            while ((line = reader.readLine()) != null) {
                String[] dataParts = line.split(", ");

                if (dataParts.length != 5) {
                    System.out.println("잘못된 데이터 형식: " + line);
                    continue;
                }

                try {
                    int id = Integer.parseInt(dataParts[0].trim());
                    String type = dataParts[1].trim();
                    String name = dataParts[2].trim();
                    int price = Integer.parseInt(dataParts[3].trim());
                    String description = dataParts[4].trim();

                    dataList.add(new ClothingData(id, type, name, price, description));
                } catch (NumberFormatException e) {
                    System.out.println("데이터 파싱 중 숫자 형식 오류: " + line);
                } catch (Exception e) {
                    System.out.println("데이터 파싱 중 오류: " + line);
                }
            }

            reader.close();
            System.out.println("파일 불러오기 완료.\n");
        }else {
            System.out.println("파일이 없으므로 새 파일을 생성합니다.\n");
        }
        return dataList;
    }

    public void saveData(ArrayList<ClothingData> dataList) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(filename));
        System.out.println("파일에 데이터를 저장합니다...");
        for (ClothingData data : dataList) {
            printWriter.println(data.toFileString()); // 데이터를 문자열로 변환하는 메소드
        }
        printWriter.close();
        System.out.println("파일을 성공적으로 저장했습니다.\n");
    }

}
