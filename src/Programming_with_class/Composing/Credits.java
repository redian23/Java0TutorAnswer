package Programming_with_class.Composing;
import static Programming_with_class.Composing.ClientAccount.*;

class Account {
    String accountName;
    String bankName;
    int accountNumber;
    int money;
    boolean accountStatus;

    Account(String accountName, String bankName, int money, int accountNumber, boolean accountStatus) {
        this.accountName = accountName;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.money = money;
        this.accountStatus = accountStatus;
    }

    public void lockAccount() {
        this.accountStatus = false;
    }

    public void unlockAccount() {
        this.accountStatus = true;
    }
}

class ClientAccount {
    static Account[] accountsClient1 = new Account[4];
    private boolean accountStatus;
    private Client client;

    void accountStatus(Account[] accountsClient1) {
        for (Account account : accountsClient1) {
            if (account.accountStatus == false) {
                System.out.println(account.accountName + " is lock");
            } else
                System.out.println(account.accountName + "  working");
        }
    }

    void lockAccount(Account accountsClient1) {
        accountsClient1.lockAccount();
        System.out.println(accountsClient1.accountName + " was been lock");
    }

    void unlockAccount(Account accountsClient1) {
        accountsClient1.unlockAccount();
        System.out.println(accountsClient1.accountName + " was been unlock");
    }

    void getMoneyOfAccount(Account[] accountsClient1) {
        for (Account account : accountsClient1) {
            if (account.money < 0) {
                System.out.println("You are dept to bank " + account.money + " $ of " + account.accountName);
            } else
                System.out.println("You are have a - " + account.money + " $ of " + account.accountName);
        }
    }

    void getSumAllAccounts() {
        int postSum = 0;
        int negaSum = 0;
        for (Account account : accountsClient1) {
            if (account.money < 0) {
                negaSum += account.money;
            } else {
                postSum += account.money;
            }
        }
        System.out.println("Positive money sum value " + postSum + " $");
        System.out.println("and");
        System.out.println("Negative money sum value " + negaSum + " $");
    }

    void searchNeedAccount(String accountName){
        for (Account account: accountsClient1) {
            if (account.accountName.equals(accountName)){
                System.out.println( "Account Name - " + account.accountName +
                        "\n Bank - " + account.bankName +
                        "\n Money - "+ account.money +" $"+
                        "\n Number - " + account.accountNumber +
                        "\n Status - " + account.accountStatus);
            }
        }
    }

    void sortAccounts(){


        for (Account account : accountsClient1) {
            System.out.println(account.accountName + " " +
                    account.bankName + " " +
                    account.money + " " +
                    account.accountNumber + " " +
                    account.accountStatus);
        }

    }
}
class Client{
    ClientAccount cl = new ClientAccount();

    public static void main(String[] args) {
    Client client1 = new Client();

    accountsClient1[0]= new Account("Card1","HomeBank",200,177013,true);
    accountsClient1[1]= new Account("Card2","HomeBank",-355,152417,true);
    accountsClient1[2]= new Account("Card3","HomeBank",-155,102499,true);
    accountsClient1[3]= new Account("Card4","SberBank",285,120547,true);

    client1.cl.getSumAllAccounts();
        System.out.println(" ");
    client1.cl.accountStatus(accountsClient1);
        System.out.println(" ");
    client1.cl.lockAccount(accountsClient1[1]);
        System.out.println(" ");
    client1.cl.getMoneyOfAccount(accountsClient1);
        System.out.println(" ");
    client1.cl.searchNeedAccount("Card2");
        System.out.println(" ");
    client1.cl.sortAccounts();

    }


    String s = "Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки\n" +
            "счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по\n" +
            "всем счетам, имеющим положительный и отрицательный балансы отдельно.";
}
