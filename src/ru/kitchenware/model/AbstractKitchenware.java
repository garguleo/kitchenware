package ru.kitchenware.model;

public class AbstractKitchenware {
    protected int inventoryNumber;

    public AbstractKitchenware(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    @Override
    public String toString() {
        return "Инвентарный номер: " + inventoryNumber + "\n";
    }
}
