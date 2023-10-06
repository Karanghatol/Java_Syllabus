// abstract class Sunstar{
//     abstract void printinfo(); 
//     abstract void printinfo(int i,String n,float s); 
// }

// class Emp extends Sunstar{
//     void printinfo(){
       
//        String name = "karan ghatol";
//        int id = 10;
//        float sal = 2000.0F; 
//     }
// }

// class Emps extends Emp{
//     void printinfo(int i,String n,float s){
//         n=name;
//         i=id;
//         s=sal;
       
//          System.out.println(name);
//          System.out.println(id);
//          System.out.println(sal);
//     }
// }

// public class AbstractEx{
//     public static void main(String[] args){
//         Sunstar s=new Emps();
//         s.printinfo();
//     }
// }






// abstract class Sunstar{
//     abstract void printinfo(); 
// }
// class Emp extends Sunstar{
//     void printinfo(){
//        String name = "karan ghatol";
//        int id = 10;
//        float sal = 2000.0F; 
//        System.out.println(name);
//        System.out.println(id);
//        System.out.println(sal);
//     }
// }
// public class AbstractEx{
//     public static void main(String[] args){
//         Sunstar s=new Emp();
//         s.printinfo();
//     }
// }






// abstract class A{
//     abstract void print();
// }
// class B extends A{
//    void print(){
//     String s = "karan ghatol";
//     System.out.println(s);
//    }
// }
// public class AbstractEx{
//     public static void main(String[] args){
//         A a = new B();
//         a.print();
//     }
// }


import java.util.Scanner;
abstract class A{
    abstract void print();
}
class B extends A{   
   void print(){
    Scanner c=new Scanner(System.in);
    System.out.println("enter name : ");
    String s = c.nextLine();
    System.out.println(s);
   }
}
public class AbstractEx{
    public static void main(String[] args){
        A a = new B();
        a.print();
    }
}