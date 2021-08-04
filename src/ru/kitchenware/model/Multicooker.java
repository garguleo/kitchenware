package ru.kitchenware.model;

public class Multicooker extends ElectricStove {
    private Saucepan saucepan;
    private boolean isPressureCooker;

    public Multicooker(int inventoryNumber, Color color, float power, Saucepan saucepan) {
        super(inventoryNumber, color, power);
        this.saucepan = saucepan;
    }

    public Multicooker(int inventoryNumber, Color color, float power, boolean isPressureCooker) {
        super(inventoryNumber, color, power);
        this.isPressureCooker = isPressureCooker;
    }

    public Saucepan getSaucepan() {
        return saucepan;
    }

    public void setSaucepan(Saucepan saucepan) {
        this.saucepan = saucepan;
    }

    public boolean isPressureCooker() {
        return isPressureCooker;
    }

    public void setPressureCooker(boolean pressureCooker) {
        isPressureCooker = pressureCooker;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Кастрюля: " + saucepan.getInventoryNumber() + "\n"
                + "Имеет ли функцию скороварки: " + (isPressureCooker ? "Да" : "Нет") ;
    }
}
