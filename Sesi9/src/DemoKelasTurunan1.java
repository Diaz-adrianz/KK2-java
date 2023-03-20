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

public class DemoKelasTurunan1 {
    public static void main(String[] args) {
        B obj = new B();
        
        obj.setA(100);
        obj.setB(200);

        System.out.println("Nilai a : " + obj.getA());
        System.out.println("Nilai b : " + obj.getB());
    }
}
