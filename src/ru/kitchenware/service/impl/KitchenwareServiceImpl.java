package ru.kitchenware.service.impl;

import ru.kitchenware.dao.KitchenwareDao;
import ru.kitchenware.model.*;
import ru.kitchenware.service.KitchenwareService;

import java.util.Scanner;

public class KitchenwareServiceImpl implements KitchenwareService {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {

        System.out.println("1. Плита ");
        System.out.println("2. Плита газовая ");
        System.out.println("3. Плита электрическая");
        System.out.println("4. Кастрюля ");
        System.out.println("5. Мультиварка ");
        System.out.print("Выберете тип утвари: ");

        int n = scanner.nextInt();

        switch (n) {
            case 1: addStove();
            break;
            case 2: addGasStove();
            break;
            case 3: addElerctricStove();
            break;
            case 4: addSaucepan();
            break;
            case 5:
            default:
                System.out.println("Остальные типы пока не поддерживаются...");
                break;
        }
    }

    private void addSaucepan() {
        System.out.print("Введите инвентарный номер: ");
        int in = scanner.nextInt();
        System.out.print("Введите объём: ");
        float v = scanner.nextFloat();
        KitchenwareDao.addToList(new Saucepan (in, v));
    }

    private void addStove() {
        System.out.print("Введите инвентарный номер: ");
        int in = scanner.nextInt();
        Stove stove = new Stove(in, Color.BLUE);
        KitchenwareDao.addToList(stove);

    }

    private void addGasStove() {
        System.out.print("Введите инвентарный номер: ");
        int in = scanner.nextInt();
        System.out.print("Введите расход газа: ");
        float v = scanner.nextFloat();
        GasStove gasstove = new GasStove(in, Color.BLUE, v);
        KitchenwareDao.addToList(gasstove);

    }
    private void addElerctricStove() {
        System.out.print("Введите инвентарный номер: ");
        int in = scanner.nextInt();
        System.out.print("Введите мощность: ");
        float v = scanner.nextFloat();
        ElectricStove electricStove = new ElectricStove(in, Color.BLUE, v);
        KitchenwareDao.addToList(electricStove);

    }

    @Override
    public void remove() {
        System.out.print("Введите инвентарный номер: ");
        int in = scanner.nextInt();
        KitchenwareDao.removeToList(in);

    }

    @Override
    public void list() {
        for (AbstractKitchenware kitchenware : KitchenwareDao.getKitchenware()) {
            System.out.println(kitchenware);
        }

    }
    @Override
    public void list1(int in) {
        System.out.println(KitchenwareDao.ToList(in));

        }

    }
}
