abstract class ATM {

    abstract void withdraw();

    void checkBalance() {
        System.out.println("Checking balance");
    }
}

class Bank extends ATM {

    void withdraw() {
        System.out.println("Money withdrawn");
    }

    public static void main(String[] args) {

        Bank b = new Bank();

        b.withdraw();
        b.checkBalance();
    }
}
