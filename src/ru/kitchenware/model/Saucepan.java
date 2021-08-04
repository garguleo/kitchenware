package ru.kitchenware.model;

public class Saucepan extends AbstractKitchenware {
    private float volume;

    public Saucepan(int inventoryNumber, float volume) {
        super(inventoryNumber);
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Кастрюля\n" + super.toString()
                + "Мощность: " + volume + "\n";
    }
}
