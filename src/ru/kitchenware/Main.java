package ru.kitchenware;

import ru.kitchenware.model.Color;
import ru.kitchenware.service.KitchenwareService;
import ru.kitchenware.service.impl.KitchenwareServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KitchenwareService service = new KitchenwareServiceImpl();

        while (true) {
            System.out.println("1. Добавить кухонную утварь");
            System.out.println("2. Удалить кухонную утварь");
            System.out.println("3. Посмотреть информацию о кухонной утвари по инвентарному номеру");
            System.out.println("4. Посмотреть полный список кухонной утвари");
            System.out.println("5. Закрыть программу");
            System.out.print("Выберете команду: ");

            int n = scanner.nextInt();

            switch (n){
                case 1: service.add();
                    break;
                case 2: service.remove();
                    break;
                case 3:
                    break;
                case 4: service.list();
                    break;
                case 5: return;
                default:
                    System.out.println("Вы ввели не верную команду! \n Пожалуйста повторите!");
                break;
            }
        }
    }

}
