package bankaccusinginnerclasses;

public class AccuntHolder {
    private String accHoldder;
    private double balance;

    public AccuntHolder(String holder, double balance) {
        this.accHoldder = holder;
        this.balance = balance;
    }

    public void accDetails() {
        System.out.println("Account holder name: " + this.accHoldder);
        System.out.println("Account balance: " + this.balance);
    }

    class Transactions {
        private double amount;
        private String type; // deposit or withdraw

        public Transactions (double amount, String type) {
            this.amount = amount;
            this.type = type;
        }

        public void progress() {
            if (type.equalsIgnoreCase("deposit")) {
                balance += amount;
                System.out.println("Deposit: " + amount);
            } else if (type.equalsIgnoreCase("withdraw")) {
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdraw: " + amount);
                } else {
                    System.out.println("Insufficient balance");
                }
            } else {
                System.out.println("Invalid transaction");
            }
        }

    }
}
