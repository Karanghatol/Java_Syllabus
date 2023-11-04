class A {
    public String name /*"karan"*/;
}
class B extends A{
    public int age;
}
class C extends B{
    public void Call(String n, int a) {
        this.age = a;
        this.name = n;
    }
    public void print_data(){
        System.out.println("name : " + name + " \n age : " + age);
    }
}
public class Inharitance_demo {
    public static void main(String[] args) {
        C b = new C();
        b.Call("karan", 19);
        b.print_data();
    }
}
