package org.example;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        DataManager dataManager = new DataManager(fileHandler);
        UIManager uiManager = new UIManager(dataManager);
        uiManager.showMenu();
    }
}
