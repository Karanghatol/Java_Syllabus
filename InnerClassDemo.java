class ClassFirst {
    int x = 30;
    class ClassSecond {
        int y = 10;
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        ClassFirst cf = new ClassFirst();
        ClassFirst.ClassSecond cs =  cf. new ClassSecond();
        System.out.println(cf.x + " " + cs.y);
    }
}