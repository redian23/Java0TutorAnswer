package Programming_with_class.Composing;

class Task {
    String s = "Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,\n" +
            "менять колесо, вывести на консоль марку автомобиля. ";
}

class Engine {
    public void gassing(int gas) {
        if (gas == 0) {
            System.out.println("Empty gas tankin car " + Car.markName);
        } else System.out.println("Tank have a - " + gas + "litres in car " + Car.markName);
    }
}

class Wheel {
    public void switchWheel(int e) {
        if (e >= 5) {
            System.out.println("NOT Found Wheel #" + e + "; Car have a 4 wheels");
        } else
            System.out.println("Wheel #" + e + " switched in car " + Car.markName);
    }
}

class Car {
    void start() {
    }

    void setMark(String markName) {
        Car.markName = markName;
    }

    void getMark() {
        System.out.println(markName);
    }

    static String markName;
    Engine eng = new Engine();
    Wheel wheels = new Wheel();

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.start();
        car1.setMark("Tesla");
        car1.getMark();

        car2.setMark("BMW");
        car2.getMark();
        car2.start();
        car2.eng.gassing(0);
        car2.wheels.switchWheel(5);
    }
}
