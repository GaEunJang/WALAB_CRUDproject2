package org.example;

public class ClothingData {
    private int id;
    private String type;
    private String name;
    private int price;
    private String description;

    public ClothingData(int id, String type, String name, int price, String description) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("%-7s %-10s %-10s %-10s %-21s",
                id,
                name,
                type,
                price + "원",
                " "+description);
    }

    public String toFileString() {
        return id + ", " + type + ", " + name + ", " + price + ", " + description;
    }
}

