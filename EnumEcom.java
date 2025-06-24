public class EnumEcom {
    protected enum orderStatus {
        DELIVERED,
        SHIPPED,
        PLACED,
        CANCELLED,
    }
    public static void main(String[] args) {
        orderStatus status = orderStatus.SHIPPED;

        if (status == orderStatus.SHIPPED) {
            System.out.println("DELIVERED!");
        } else {
            System.out.println("SHIPPED !");
        }

    }
}
