package ru.kitchenware.model;

public class GasStove extends Stove {
    private float gasWaste;

    public GasStove(int inventoryNumber, Color color, float gasWaste) {
        super(inventoryNumber, color);
        this.gasWaste = gasWaste;
    }

    public float getGasWaste() {
        return gasWaste;
    }

    public void setGasWaste(float gasWaste) {
        this.gasWaste = gasWaste;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Расход газа: " + gasWaste + "\n";
    }
}
