package OOP;
import java.io.File;
import java.io.IOException;

public class Exp1 {
    String s = "Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,\n" +
            "вывести на консоль содержимое, дополнить, удалить.";
}

class TextFile {
    static File directory= new File("~/home");
    static File file1 = new File("file1.txt");


    public static void main(String[] args) throws IOException {
        //file1.createNewFile();
        //file1.renameTo(new File("editFile.txt"));
        file1.canWrite();
        file1.setWritable(true);
        file1.toString();

    }

}