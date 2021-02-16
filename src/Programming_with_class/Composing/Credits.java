package Programming_with_class.Composing;

class Account{
    String bankName;
    int accountNumber;
    final int money;
    private boolean accountStatus = true;

    Account (String bankName,int money, int accountNumber){
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.money = money;
    }
    void accountStatus(){
        if(accountStatus == false) {
            System.out.println("Account is lock");
        }else
            System.out.println("Account working");
    }
    void lockAccount(){
        this.accountStatus = false;
        System.out.println("Account was been lock");
    }

    void unlockAccount(){
        this.accountStatus = true;
        System.out.println("Account was been unlock");
    }

    void getMoneyOfAccount(){
        if(money<0){
            System.out.println("Account have a negative money value");
            System.out.println("You are dept to bank " + money);
        }
    }
}

class Client {
    Account account1 = new Account("HomeBank",200,177013);
    Account account2 = new Account("HomeBank",-415,152417);

    public static void main(String[] args) {
    Client client1 = new Client();
    client1.account1.accountStatus();
    client1.account1.lockAccount();
    client1.account1.accountStatus();
    client1.account1.unlockAccount();
    client1.account1.accountStatus();

    client1.account1.getMoneyOfAccount();
    }


    String s = "Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки\n" +
            "счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по\n" +
            "всем счетам, имеющим положительный и отрицательный балансы отдельно.";
}
