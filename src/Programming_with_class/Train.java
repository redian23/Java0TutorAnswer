package Programming_with_class;

import java.util.Arrays;
import java.util.Comparator;

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
        listTrains[0] = new Train(1,"N.Y.","11.30 AM");
        listTrains[1] = new Train(2,"L.A.","12.30 AM");
        listTrains[2] = new Train(3,"Alabama","11.30 PM");

    }
}
