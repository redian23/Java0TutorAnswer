package Programming_with_class.Composing;
import static Programming_with_class.Composing.Voucher.*;

class Voucher{

    Transport transport;
    Type type;
    Meals meals;
    int days;

    enum Transport{
        CAR,
        BUS,
        TRAIN,
        PLANE,
        SHIP
    }
    enum Meals{
        RO,
        BB,
        HB,
        FB,
        AI
    }
    enum Type{
        REST,
        TOUR,
        HEALING,
        SHOPPING,
        CRUISE
    }

    Voucher(Type type, Transport transport, Meals meals,int days ){
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
}

public class Tourism {

    public static void main(String[] args) {
        Voucher cruise = new Voucher(Type.CRUISE,Transport.BUS,Meals.AI,15);
        Voucher tour = new Voucher(Type.TOUR,Transport.PLANE,Meals.FB,21);
        Voucher shopping = new Voucher(Type.SHOPPING,Transport.CAR,Meals.HB,7);

        int i = 2; //выбор путевки

        switch (i){
            case 1:
                System.out.println(cruise.toString());
                break;
            case 2:
                System.out.println(tour.toString());
                break;
            case 3:
                System.out.println(shopping.toString());
                break;
        }
    }

String s = " Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки\n" +
        "различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать\n" +
        "возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.";

}
