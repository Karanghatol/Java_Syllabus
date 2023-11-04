public class Methodsec {

    public void meth2() {
        System.out.println("dog is barking");
    }

    public void meth3() {
        System.out.println("dog is eating");
    }

    public static void main(String[] args) {
        Methodsec d = new Methodsec();
        d.meth2();
        d.meth3();
    }
}