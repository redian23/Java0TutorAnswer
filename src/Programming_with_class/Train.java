package Programming_with_class;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Timer;

public class Train {
    String s = "Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.\n" +
            "Создайте данные в массив из пяти элементов типа Train, " +
            "добавьте возможность сортировки элементов массива по номерам поездов. " +
            "Добавьте возможность вывода информации о поезде, номер которого введен пользователем.\n" +
            "Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами\n" +
            "назначения должны быть упорядочены по времени отправления.";

    String destination;
    int trainNumber;
    String timeOfDeparture;

    Train(int trainNumber, String destination, String timeOfDeparture){
        this.trainNumber = trainNumber;
        this.destination = destination;
        this.timeOfDeparture = timeOfDeparture;
    }

    static class sortTrainList implements Comparator<Train> {
        @Override
        public int compare(Train left, Train right) {
            return left.trainNumber - right.trainNumber;
        }
    }

    public static class ByDestinationAndTimeComparator implements Comparator <Train> {
        @Override
        public int compare(Train left, Train right) {
            if (left.destination.equals(right.destination))
                return left.timeOfDeparture.compareTo(right.timeOfDeparture);
            return left.destination.compareTo(right.destination);
        }
    }

    public void printInformationAboutTrain() {
        System.out.println(trainNumber + " -> " + destination + " : " + timeOfDeparture);
    }

    public static void main(String[] args) {
        Train[] listTrains = new Train[5];
        listTrains[0] = new Train(1,"N.Y.","11.30");
        listTrains[1] = new Train(22,"L.A.","10.20");
        listTrains[2] = new Train(31,"Alabama","11.10");
        listTrains[3] = new Train(36,"Boston","9.30");
        listTrains[4] = new Train(378,"Wisconsin","8.30");
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        while (true) {
            System.out.println(
                            "1. сортировка по номерам поездов" + "\n" +
                            "2. вывод информации о поезде по номеру" + "\n" +
                            "3. сортировка по пункту назначения" + "\n" +
                            "4. вывод всех поездов" + "\n" +
                                    "Выберете пункт меню: ");

            int choice = scanner.nextInt();

            if (choice < 1 || choice >= 5) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            switch (choice) {
                case 1:
                    Arrays.sort(listTrains, new Train.sortTrainList());
                    break;
                case 2:
                    System.out.println("введи индекс поезда: ");


                    int pos = scanner.nextInt();
                    if (pos < 0 || pos >= listTrains.length)
                        System.out.println("выбран неправильный номер элемента массива");
                    else
                        listTrains[pos].printInformationAboutTrain();
                    break;
                case 3:
                    Arrays.sort(listTrains, new Train.ByDestinationAndTimeComparator());
                    break;
                case 4:
                    for (int i = 0; i < listTrains.length; ++i) {
                        System.out.print(i + " ");
                        listTrains[i].printInformationAboutTrain();
                    }
                    System.out.println(" ");
                    break;
            }
        }
    }
}
