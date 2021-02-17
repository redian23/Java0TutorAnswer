package Programming_with_class.Composing;

import static Programming_with_class.Composing.Voucher.*;

class Voucher {

    Transport transport;
    Type type;
    Meals meals;
    int days;

    Voucher(Type type, Transport transport, Meals meals, int days) {
        this.transport = transport;
        this.type = type;
        this.meals = meals;
        this.days = days;
    }

    @Override
    public String toString() {
        return "Voucher {" +
                "transport=" + transport +
                ", type=" + type +
                ", meals=" + meals +
                ", days=" + days +
                '}';
    }

    enum Transport {
        CAR,
        BUS,
        TRAIN,
        PLANE,
        SHIP
    }

    enum Meals {
        RO,
        BB,
        HB,
        FB,
        AI
    }

    enum Type {
        REST,
        TOUR,
        HEALING,
        SHOPPING,
        CRUISE
    }
}

public class Tourism {

    String s = " Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки\n" +
            "различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать\n" +
            "возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.";

    public static void main(String[] args) {
        Voucher cruise = new Voucher(Type.CRUISE, Transport.BUS, Meals.AI, 15);
        Voucher tour = new Voucher(Type.TOUR, Transport.PLANE, Meals.FB, 21);
        Voucher shopping = new Voucher(Type.SHOPPING, Transport.CAR, Meals.HB, 7);

        Type type = Type.CRUISE;

        switch (type) {
            case CRUISE:
                System.out.println(cruise.toString());
                break;
            case TOUR:
                System.out.println(tour.toString());
                break;
            case SHOPPING:
                System.out.println(shopping.toString());
                break;
        }
    }

}
