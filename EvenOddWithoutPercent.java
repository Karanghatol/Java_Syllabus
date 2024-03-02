import java.util.Scanner;

public class EvenOddWithoutPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        float num = sc.nextFloat();
        EvenOddWithoutPercent ev = new EvenOddWithoutPercent();
        
        try {

            if (ev.isEven(num)) {
                System.out.println("________ EVEN Number ________");
            } else {
                System.out.println("________ ODD Number ________");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    public boolean isEven(float num) {
        return (num / 10) * 10 == num;
    };
}
