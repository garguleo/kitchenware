package ru.kitchenware.model;

public class ElectricStove extends Stove {
    protected float power;

    public ElectricStove(int inventoryNumber, Color color, float power) {
        super(inventoryNumber, color);
        this.power = power;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString()
            + "Мощность : " + power + "\n";
    }
}
