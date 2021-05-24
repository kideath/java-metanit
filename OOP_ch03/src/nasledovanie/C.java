package nasledovanie;

public class C extends A2 {
    @Override
    public void printA2() {
        super.a = this.a;
        super.printA2();
    }    
    
    public int a = 100;
    public int c = 300;
    
    {
        a = 500;
    }
    
    public void printC() {
        System.out.println("c = " + c);
    }    
    
    public static void main(String args[]) {
        C c = new C();
        c.printC();
        c.printA2();
        c.a = 600;
        c.printA2();
        System.out.println("c.a = " + c.a);
    }
}

class A2 {
    public int a = 1;
    public void printA2() {
        System.out.println("a = " + a);
    }
}
