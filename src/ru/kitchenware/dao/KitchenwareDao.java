package ru.kitchenware.dao;

import ru.kitchenware.model.AbstractKitchenware;

import java.util.ArrayList;
import java.util.List;

public class KitchenwareDao {

    private static List<AbstractKitchenware> kitchenware;

    public static void addToList(AbstractKitchenware abstractKitchenware){
        if(kitchenware == null) {
            kitchenware = new ArrayList<>();
        }
        kitchenware.add(abstractKitchenware);
    }
    public static void removeToList (int in){
        kitchenware.remove(in);
    }
    public static AbstractKitchenware ToList (int in1){
        return getKitchenware().get(in1);
    }

    public static List<AbstractKitchenware> getKitchenware() {
        return kitchenware;
    }
}
