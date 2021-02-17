package Programming_with_class.Simple_classes;

public class Test2 {

    static int tvCanals;
    static int payedCanals;

    Test2(int tvCanals, int payedCanals) {
        System.out.println("All Tv canals = " + tvCanals);
        System.out.println("Payed Tv canals = " + payedCanals);
    }

    public static int getTvCanals() {
        return tvCanals;
    }

    public static void setTvCanals(int tvCanals) {
        Test2.tvCanals = tvCanals;
    }

    public static int getPayedCanals() {
        return payedCanals;
    }

    public static void setPayedCanals(int payedCanals) {
        Test2.payedCanals = payedCanals;
    }

    public static void main(String[] args) {

        setTvCanals(15);
        setPayedCanals(5);
        System.out.println(getTvCanals());
        System.out.println(getPayedCanals());

    }
}
