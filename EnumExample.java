public class EnumExample {
    public enum Days {
        SUN, MON, TUE, WED, THU, FRI, SAT
    }
    public static void main(String[] args) {
        Days d = Days.WED;
        if (d == Days.WED) {
            System.out.println("Today is Wednesday Ni**a!");
        }
    }
}
