package seminars.sixth;

import seminars.sixth.controller.ListWorker;
import seminars.sixth.model.ListModel;
import seminars.sixth.view.DisplayMethods;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Сгенерировать списки, вычислить их средние значения и сравнить их");
            System.out.println("0. Выйти");
            System.out.print("Введите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    System.out.println("Введите количество элементов первого списка:");
                    int firstListSize = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введите количество элементов второго списка:");
                    int secondListSize = scanner.nextInt();
                    scanner.nextLine();

                    ListModel firstList = new ListModel(firstListSize);
                    DisplayMethods.printList(firstList.list);
                    System.out.println("Среднее значение первого списка: " + ListWorker.calculateAverage(firstList.list));

                    System.out.println();

                    ListModel secondList = new ListModel(secondListSize);
                    DisplayMethods.printList(secondList.list);
                    System.out.println("Среднее значение второго списка: " + ListWorker.calculateAverage(secondList.list));

                    System.out.println();

                    DisplayMethods.compareAverages(ListWorker.calculateAverage(firstList.list), ListWorker.calculateAverage(secondList.list));

                    break;
                case 0:
                    System.out.println("Завершение работы программы...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор, выберите еще раз");
                    break;
            }

            System.out.println();
        }
    }
}
