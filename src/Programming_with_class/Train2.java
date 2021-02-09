package Programming_with_class;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Train2 {

    private final String destination;
    private final int number;
    private final String departure_time;

    public Train2(String destination_, int number_, String departure_time_) {
        destination = destination_;
        number = number_;
        departure_time = departure_time_;
    }
    public static class ByNumberComparator implements Comparator< Train2 > {
        @Override
        public int compare(Train2 left, Train2 right) {
            return left.number - right.number;
        }
    }
    public static class ByDestinationAndTimeComparator implements Comparator < Train2 > {
        @Override
        public int compare(Train2 left, Train2 right) {
            if (left.destination.equals(right.destination))
                return left.departure_time.compareTo(right.departure_time);
            return left.destination.compareTo(right.destination);
        }
    }
    public void print() {
        System.out.println(number + " -> " + destination + " : " + departure_time);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        Train2[] trains = new Train2[n];
        trains[0] = new Train2("Msk", 122, "12:42");
        trains[1] = new Train2("Msk", 123, "12:45");
        trains[2] = new Train2("Spb", 34, "23:08");
        trains[3] = new Train2("Msk", 33, "12:42");
        trains[4] = new Train2("Spb", 156, "05:44");
        while (true) {
            System.out.println(
                    "Выберете пункт меню:" + "\n" +
                            "1. сортировка по номерам поездов" + "\n" +
                            "2. вывод информации о поезде по номеру" + "\n" +
                            "3. сортировка по пункту назначения" + "\n" +
                            "4. вывод всех поездов" + "\n" +
                            "5. выход" + "\n"
            );
            int choice = scanner.nextInt();
            if (choice == 5)
                break;
            if (choice < 1 || choice > 5) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            switch (choice) {
                case 1:
                    Arrays.sort(trains, new Train2.ByNumberComparator());
                    break;
                case 2:
                    System.out.println("введи индекс поезда: ");
                    int pos = scanner.nextInt();
                    if (pos < 0 || pos >= trains.length)
                        System.out.println("выбран неправильный номер элемента массива");
                    else
                        trains[pos].print();
                    break;
                case 3:
                    Arrays.sort(trains, new Train2.ByDestinationAndTimeComparator());
                    break;
                case 4:
                    for (int i = 0; i < trains.length; ++i) {
                        System.out.print(i + " ");
                        trains[i].print();
                    }
                    break;
            }
        }
    }
}
