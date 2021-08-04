package ru.kitchenware.model;

public enum Color {
    BLUE("Синий"),
    RED("Красный"),
    BLACK("Чёрный"),
    WHITE("Белый");

    private final String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
