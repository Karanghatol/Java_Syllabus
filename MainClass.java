package bankaccusinginnerclasses;

public class MainClass {
    public static void main(String[] args) {
       AccuntHolder accuntHolder = new AccuntHolder("Karan", 200000.2);
       accuntHolder.accDetails();

       AccuntHolder.Transactions t1 = accuntHolder.new Transactions(100000, "deposit");
       t1.progress();

       AccuntHolder.Transactions t2 = accuntHolder.new Transactions(1000.3, "withdraw");
       t2.progress();
        System.out.println("\n\n");
        accuntHolder.accDetails();
    }
}
