package bankaccusinginnerclasses;
public class Withoutmainmethod {
    static {
        System.out.println("Hello from static block!");
//        System.exit(0); // prevent looking for main()
    }
    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}
