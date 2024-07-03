class A {
    A(){System.out.print("A");}
    A(int i) {System.out.print("A"+i);}
    public void finalize() {System.out.print("Z");}
}
class B extends A{
    B(){System.out.print("B");}
    B(int i) {System.out.print("B"+i);}
    public void finalize() {
        System.out.println("W");}
}
    public class Main {
    public static void main(String[] args) {
        new B(3);
        System.gc();

    }
}