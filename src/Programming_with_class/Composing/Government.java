package Programming_with_class.Composing;
class Area {

    String string = "Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль\n" +
        "столицу, количество областей, площадь, областные центры. ";

    Double area;

    Area() { }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}

class District {

    private final String area;
    public String name;
    public String areaCenterTown;

    District(String name, String area, String areaCenterTown) {
        this.name = name;
        this.area = area;
        this.areaCenterTown = areaCenterTown;
    }

    public String getArea() {
        return area;
    }
}

public class Government {
    private String capitalCity;

    District[] districts = new District[6];
    Area area = new Area();

    Government(String name) {
        System.out.println(name);
    }
    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public static void main(String[] args) {
        Government belarus = new Government("Belarus");
        belarus.setCapitalCity("Minsk");

        belarus.districts[0] = new District("Mog", "Mogilev's", "Mogilev");
        belarus.districts[1] = new District("Vit", "Vitebsk's", "Vitebsk");
        belarus.districts[2] = new District("Brest", "Brest's", "Brest");
        belarus.districts[3] = new District("Gom", "Gomels's", "Gomel");
        belarus.districts[4] = new District("Grod", "Grodno's", "Grodno");
        belarus.districts[5] = new District("Minsk", "Minsk's", "Minsk");
        belarus.area.setArea(205.4);

        System.out.println(belarus.getCapitalCity() + " is the capital of the Great Belarusian");
        System.out.println("District items - " + belarus.districts.length);
        System.out.println("Area - " + belarus.area.getArea() + " km2");

        for (District dst : belarus.districts) {
            System.out.println("Center city of Area " + "'" + dst.name + "'" + " is " + dst.areaCenterTown);
        }

    }


}
