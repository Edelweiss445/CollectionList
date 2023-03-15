

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> operation = new ArrayList<>();
        operation.add(" 1. Добавить");
        operation.add(" 2. Показать");
        operation.add(" 3. Удалить");

        List<String> basketGoods = new ArrayList<>();


        System.out.println("Доступные операции: ");
        for (String s : operation) {
            System.out.println(s);
        }
        String sc = scanner.next();
        while (true) {

            switch (sc) {
                case "1": {
                    System.out.println("Какую покупку хотите добавить?");
                    basketGoods.add(sc.next);
                    break;
                }
                case "2": {
                    System.out.println("Список покупок:");
                    for (String s : basketGoods) {
                        System.out.println(s);
                    }
                }
                case "3":
            }
        }
        System.out.println("Выберите операцию: ");


    }
}
