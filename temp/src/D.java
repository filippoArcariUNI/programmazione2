public class D {
    static int x=3;
    public static void main(String[] args) {
        D a5=new D();   a5.f();
        a5=new D();     a5.f();
        System.gc();    System.runFinalization();
    }
    void f() {Pippo a = new Pippo2();
    }
    public void finalize() { System.out.print("X"); }
    class Pippo {
        int k;
        Pippo() {k=++x;}
        public void finalize() { System.out.print(k); }
    }
    class Pippo2 extends Pippo {
        Pippo2() {k=x++;}
    }}