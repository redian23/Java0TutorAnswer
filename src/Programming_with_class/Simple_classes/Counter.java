package Programming_with_class.Simple_classes;

public class Counter {
    String s = ". Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение\n" +
            "на единицу в заданном диапазоне. " +
            "Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. " +
            "Счетчик имеет методы увеличения и уменьшения состояния, и метод\n" +
            "позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.";
    private int min, max, current;

    public Counter(int min_, int max_, int current_) {
        min = min_;
        max = max_;
        current = current_;
        if (max < min) {
            int tmp = max;
            max = min;
            min = tmp;
        }
        if (current < min)
            current = min;
        if (current > max)
            current = max;
    }

    public Counter(int min_, int max_) {
        this(min_, max_, min_);
        current = min;
    }

    public Counter() {
        this(0, 16, 0);
    }

    public static void main(String[] args) {
        Counter a = new Counter(5, 10, 6);
        Counter b = new Counter(6, 4, 7);
        Counter c = new Counter(5, 3);
        System.out.println("a: " + a.value());
        System.out.println("b: " + b.value());
        System.out.println("c: " + c.value());
        System.out.println("----------------------");
        for (int i = 0; i < 2; ++i) {
            a.inc();
            b.inc();
            c.inc();
        }
        System.out.println("a: " + a.value());
        System.out.println("b: " + b.value());
        System.out.println("c: " + c.value());
        System.out.println("----------------------");
        for (int i = 0; i < 20; ++i) {
            a.dec();
            b.dec();
            c.dec();
        }
        System.out.println("a: " + a.value());
        System.out.println("b: " + b.value());
        System.out.println("c: " + c.value());
        System.out.println("----------------------");
    }

    public void inc() {
        current++;
        if (current > max)
            current = min;
    }

    public void dec() {
        current--;
        if (current < min)
            current = max;
    }

    public int value() {
        return current;
    }
}
