class A {
    private int a;
    public void setA(int n ) { a = n ;}
    public int getA() { return a ;}
}

class B extends A {
    private int b;
    public void setB(int n ) { b = n ;}
    public int getB() { return b ;}
}

class C extends B {
    private int c;
    public void setC(int n ) { c = n ;}
    public int getC() { return c ;}
}

public class DemoKelasTurunan2 {
    public static void main(String[] args) {
        C obj = new C();
        
        obj.setA(100);
        obj.setB(200);
        obj.setC(300);

        System.out.println("Nilai a : " + obj.getA());
        System.out.println("Nilai b : " + obj.getB());
        System.out.println("Nilai c : " + obj.getC());
    }
}
