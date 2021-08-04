package ru.kitchenware.model;

public class Stove extends AbstractKitchenware {
    protected Color color;

    public Stove(int inventoryNumber, Color color) {
        super(inventoryNumber);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Плита \n" + super.toString()
                + "Цвет: " + color.getName() + "\n";
    }
}
