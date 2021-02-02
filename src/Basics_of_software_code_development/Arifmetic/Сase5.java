package Basics_of_software_code_development.Arifmetic;

public class Сase5 {

    public static void main(String[] args) {

        int init = 2594;

        int hours = (init / 3600);
        int temp = init - (hours * 3600);
        int minutes = temp / 60;
        int seconds = temp - (minutes * 60);

        System.out.println("Исходная длительность в секундах: " + init);
        System.out.println(hours + " ч. " + minutes + " мин. " + seconds + " c.");

    }

}
