package Programming_with_class;

public class Student {
    String task = "Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив\n" +
            "из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и\n" +
            "номеров групп студентов, имеющих оценки, равные только 9 или 10.";

    String lastName;
    String initials;
    int groupNumber;
    int[] progress = {0,0,0,0,0};

    Student(String lastName,String initials, int groupNumber, int[] progress) {
        this.lastName = lastName;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }

    private static void showBest(Student[] listStudents) {
        for (Student student : listStudents) {
            var flag = 0;
            int[] ints = student.progress;
            for (int a : ints) {
                if (a < 9) {
                    flag++;
                }
            }
            if (flag == 0)
                System.out.println(student.lastName + "  " + student.groupNumber);
        }
    }

    public static void main(String[] args) {
        Student[] listStudent = new Student[7];
        listStudent[0] = new Student("Ivanov", "K.P",11, new int[]{5, 6, 7, 3, 9});
        listStudent[1] = new Student("Petrov","A.M", 11, new int[]{9, 10, 9, 9, 9});
        listStudent[2] = new Student("Ekols","L.A", 12, new int[]{8, 6, 7, 3, 10});
        listStudent[3] = new Student("Tarantin"," R.C", 13, new int[]{5, 10, 7, 6, 9});
        listStudent[4] = new Student("Loiko","E.C", 11, new int[]{9, 10, 9, 9, 9});
        listStudent[5] = new Student("Izov","T.A", 12, new int[]{8, 6, 7, 7, 10});
        listStudent[6] = new Student("Kovolev","D.G", 13, new int[]{10, 10, 9, 9, 9});
        showBest(listStudent);
    }
}
