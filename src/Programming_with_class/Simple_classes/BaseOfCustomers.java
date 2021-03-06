package Programming_with_class.Simple_classes;

import java.util.ArrayList;
import java.util.List;

class Shop {
    final String shopName;
    private final ArrayList<Customer> customersList = new ArrayList<>();

    Shop(String shopName) {
        this.shopName = shopName;
    }

    void addCustomerToShopList(Customer customer) {
        customersList.add(customer);
    }

    List<Customer> getListByName() {
        List<Customer> list = new ArrayList<>(customersList);
        list.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        return list;
    }

    List<Customer> getListByName2() {
        List<Customer> list = new ArrayList<>(customersList);
        list.sort((o1, o2) -> o1.getName2().compareToIgnoreCase(o2.getName2()));
        return list;
    }

    List<Customer> getListByDiapasonCreaditCard(int diapazonStart, int diapazonEnd) {
        List<Customer> list = new ArrayList<>();
        for (Customer c : customersList) {
            if (c.getCreditCardId() >= diapazonStart && c.getCreditCardId() <= diapazonEnd) {
                list.add(c);
            }
        }
        return list;
    }
}

class Customer {
    private static int idGenerator = 0;
    private final int id = idGenerator;
    private final String name;
    private final String name2;
    private final String name3;
    private final String address;
    private final int creditCardId;
    private final int bankNumberCard;

    {
        idGenerator++;
    }

    Customer(String name, String name2, String name3, String address, int creditCardId, int bankNumberCard) {
        this.name = name;
        this.name2 = name2;
        this.name3 = name3;
        this.address = address;
        this.creditCardId = creditCardId;
        this.bankNumberCard = bankNumberCard;
    }

    public String getName() {
        return name;
    }

    public String getName2() {
        return name2;
    }

    public String getAddress() {
        return address;
    }

    public int getCreditCardId() {
        return creditCardId;
    }

    public int getBankNumberCard() {
        return bankNumberCard;
    }

    public String toString() {
        return String.format("ID: %d\t name: %s\t name2: %s\t name3 %s \t from: %s\t credit card %d\t bank number %d",
                id, name, name2, name3, address, creditCardId, bankNumberCard);
    }

    public static class BaseOfCustomers {
        public static void main(String[] args) {
            Shop megamarket = new Shop("Megamarket");
            megamarket.addCustomerToShopList(new Customer("Иван", "Дроздов", "Михайлович", "Украина", 11_22_33_44, 12345));
            megamarket.addCustomerToShopList(new Customer("Андрей", "Фамильян", "Иванович", "Россия", 22_33_44_55, 23456));
            megamarket.addCustomerToShopList(new Customer("Богдан", "Мурахоедов", "Франкович", "Болгария", 33_44_55_66, 34567));
            megamarket.addCustomerToShopList(new Customer("Виктор", "Викторян", "Викторович", "Украина", 44_55_66_77, 45678));
            megamarket.addCustomerToShopList(new Customer("Франк", "Ибрагимов", "Ибрагимович", "Латвия", 55_66_77_88, 56789));
            megamarket.addCustomerToShopList(new Customer("Наташа", "Дроздова", "Алексеевна", "Россия", 66_77_88_99, 67890));
            megamarket.addCustomerToShopList(new Customer("Оксана", "Ростинова", "Ростиславовна", "Украина", 77_88_99_00, 78901));
            megamarket.addCustomerToShopList(new Customer("Степан", "Боруков", "Алексеевич", "Россия", 88_99_00_11, 89012));
            megamarket.addCustomerToShopList(new Customer("Steeve", "Jackson", "<noname>", "USA", 99_00_11_22, 90123));
            megamarket.addCustomerToShopList(new Customer("Александр", "Добрынин", "Станиславович", "Украина", 10_12_23_34, 10234));

            System.out.println("\nsort by name:");
            List<Customer> listSortByName = megamarket.getListByName();
            for (Customer c : listSortByName) {
                System.out.println(c);
            }

            System.out.println("\nsort by name2:");
            List<Customer> listSortByName2 = megamarket.getListByName2();
            for (Customer c : listSortByName2) {
                System.out.println(c);
            }

            System.out.println("\nprint customers by diapazon credit card:");
            List<Customer> listSortByDiapazonCreditCard = megamarket.getListByDiapasonCreaditCard(22_33_44_55, 66_77_88_99);
            for (Customer c : listSortByDiapazonCreditCard) {
                System.out.println(c);
            }
        }
    }
}