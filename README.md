# 의류 관리 시스템 + FILE I/O

이 프로젝트는 [WALAB_CRUDproject1](https://github.com/GaEunJang/WALAB_CRUDproject1)에 파일 입출력 기능을 추가한 확장 버전입니다. 사용자는 콘솔 인터페이스를 통해 의류 항목을 추가, 조회, 수정, 삭제, 검색 및 정렬할 수 있으며, 이제 데이터를 파일로 저장하고 불러올 수 있는 기능이 포함되어 있습니다.

## 주요 기능
- **CRUD 작업**: 의류 데이터의 생성(Create), 읽기(Read), 업데이트(Update), 삭제(Delete).
- **검색 기능**: 특정 타입의 의류를 검색합니다.
- **정렬 기능**: 데이터를 이름 또는 가격 기준으로 정렬합니다.
- **파일 저장하기**: 의류 데이터를 `data.txt` 파일로 저장합니다.
- **파일 불러오기**: `data.txt` 파일에서 의류 데이터를 불러옵니다.

## 파일 입출력 과정 추가
### 데이터 로드
- 프로그램 시작 시, `DataManager.loadDataFromFile()` 메소드가 `data.txt` 파일을 찾아 읽어 데이터를 로드합니다.
- `BufferedReader` 및 `FileReader`를 사용하여 파일을 읽습니다.
- 파일의 각 줄은 `String.split` 메소드를 이용하여 파싱되며, 결과는 `ClothingData` 객체로 변환되어 리스트에 추가됩니다.
- 이 과정에서 발생하는 예외는 적절하게 처리됩니다.
    
<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject2/assets/103119924/c78224c7-9533-48dd-a872-cc47d93a7a4a.png"><br>

<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject2/assets/103119924/35d0b15e-6de4-4af9-a36f-c27cda409e1c.png"><br>

<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject2/assets/103119924/3cb2b919-fa5a-4666-99d5-7c663952686a.png"><br>

### 데이터 저장
- 사용자가 '파일 저장하기' 옵션을 선택하면, `DataManager.saveDataToFile()` 메소드가 호출됩니다.
- `BufferedWriter` 및 `FileWriter`를 사용하여 데이터를 `data.txt` 파일에 저장합니다.
- 메모리에 있는 `ClothingData` 객체들은 파일 포맷으로 변환되어 저장됩니다.
- 이 과정에서 발생하는 예외는 적절하게 처리됩니다.

<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject2/assets/103119924/1c2a6f32-4d32-444d-88f6-021c4e8e276e.png"><br>
