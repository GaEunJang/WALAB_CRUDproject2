package org.example;

import java.io.IOException;
import java.util.Scanner;

public class UIManager {
    private DataManager dataManager;
    private Scanner in;

    public UIManager(DataManager dataManager) {
        this.dataManager = dataManager;
        this.in = new Scanner(System.in);
    }

    public void showMenu() {
        int choice;
        while(true){
            System.out.println("=======================");
            System.out.println("       * 메뉴판 *       ");
            System.out.println("=======================");
            System.out.println("  1. 추가                       ");
            System.out.println("  2. 조회                       ");
            System.out.println("  3. 수정                       ");
            System.out.println("  4. 삭제                       ");
            System.out.println("  5. 검색                       ");
            System.out.println("  6. 정렬                       ");
            System.out.println("  7. 파일 저장하기                ");
            System.out.println("  0. 종료                       ");
            System.out.println("-------------------------");
            System.out.print("원하는 작업을 선택해주세요. : ");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    dataManager.createData();
                    break;
                case 2:
                    dataManager.readData();
                    break;
                case 3:
                    dataManager.updateData();
                    break;
                case 4:
                    dataManager.deleteData();
                    break;
                case 5:
                    dataManager.searchType();
                    break;
                case 6:
                    dataManager.sortData();
                    break;
                case 7:
                    dataManager.saveData();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다. 안녕히 가세요!");
                    return;
                default:
                    System.out.println("유효하지 않은 선택입니다. 올바른 옵션을 입력하세요.");
            }
        }
    }
}
