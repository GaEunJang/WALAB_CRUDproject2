# 의류 관리 시스템 + FILE I/O

이 프로젝트는 [WALAB_CRUDproject1](https://github.com/GaEunJang/WALAB_CRUDproject1)에 파일 입출력 기능을 추가한 확장 버전입니다. 사용자는 콘솔 인터페이스를 통해 의류 항목을 추가, 조회, 수정, 삭제, 검색 및 정렬할 수 있으며, 이제 데이터를 파일로 저장하고 불러올 수 있는 기능이 포함되어 있습니다.

## 구현 기능
- **CRUD 작업**: 의류 데이터의 생성(Create), 읽기(Read), 업데이트(Update), 삭제(Delete).
- **검색 기능**: 특정 타입의 의류를 검색합니다.
- **정렬 기능**: 데이터를 이름 또는 가격 기준으로 정렬합니다.
- **파일 저장하기**: 의류 데이터를 `data.txt` 파일로 저장합니다.
- **파일 불러오기**: `data.txt` 파일에서 의류 데이터를 불러옵니다.

## 클래스 및 패키지
- **org.example.ClothingData**
  - 의류 데이터를 표현하는 클래스입니다.
  - 각 의류 항목은 고유 ID, 타입, 이름, 가격, 설명 속성을 가집니다.
  - `toString` 메소드를 통해 사용자 인터페이스에 데이터를 표시할 수 있도록합니다.
  - `toFileString` 메소드는 파일 저장 형식으로 데이터를 변환합니다.
- **org.example.DataManager**
  - 의류 데이터의 CRUD (생성, 읽기, 업데이트, 삭제) 작업을 관리합니다.
  - 파일에서 데이터를 로드하고, 사용자의 입력에 따라 데이터 리스트를 추가, 수정, 삭제합니다.
  - 데이터를 정렬하거나 특정 조건에 따라 검색하는 기능을 제공합니다.
- **org.example.UIManager**
  - 사용자 인터페이스를 관리하고 사용자 입력을 처리하는 클래스입니다.
  - 사용자에게 다양한 메뉴 옵션을 제공하고, 선택에 따라 DataManager의 메소드를 호출합니다.
- **org.example.FileHandler**
  - 파일 입출력을 담당하는 클래스입니다.
  - 의류 데이터를 파일로 저장하고 불러오는 기능을 수행합니다.
  - 파일 관련 예외 처리를 포함하여 안정적인 데이터 관리를 합니다.
- **org.example.Main**
  - 애플리케이션의 진입점입니다.
  - `DataManager` 및 `UIManager` 인스턴스를 생성하고 사용자 인터페이스를 초기화합니다.
  - 사용자에게 메뉴를 제공하고, 사용자의 선택에 따라 `DataManager` 클래스의 메소드를 호출합니다.

## 파일 입출력 과정 추가
### 데이터 로드
- 프로그램 시작 시, `DataManager` 클래스의 생성자에서 `fileHandler.loadData()` 메소드를 호출하여 `data.txt` 파일로부터 데이터를 로드합니다.
- `BufferedReader` 및 `FileReader`를 사용하여 파일을 읽습니다.
- 파일의 각 줄은 `String.split` 메소드를 이용하여 파싱되며, 결과는 `ClothingData` 객체로 변환되어 리스트에 추가됩니다.
- 이 과정에서 발생하는 예외는 적절하게 처리됩니다.
    
<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject2/assets/103119924/c78224c7-9533-48dd-a872-cc47d93a7a4a.png"><br>

<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject2/assets/103119924/35d0b15e-6de4-4af9-a36f-c27cda409e1c.png"><br>

<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject2/assets/103119924/3cb2b919-fa5a-4666-99d5-7c663952686a.png"><br>

### 데이터 저장
- 사용자가 '파일 저장하기' 옵션을 선택하면, `DataManager` 클래스의 `saveData()` 메소드가 호출됩니다.
- `PrintWriter` 및 `FileWriter`를 사용하여 데이터를 `data.txt` 파일에 저장합니다.
- 메모리에 있는 `ClothingData` 객체들은 `toFileString()` 메소드를 통해 파일 포맷으로 변환되어 저장됩니다.
- 이 과정에서 발생하는 예외는 적절하게 처리됩니다.

<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject2/assets/103119924/1c2a6f32-4d32-444d-88f6-021c4e8e276e.png"><br>
