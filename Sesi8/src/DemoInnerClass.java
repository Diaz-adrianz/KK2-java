class Luar {
    private int a;

    public void setA(int nilai) {a = nilai;}
    public int getA() {return a;}

    class Dalam {
        private int x = 10;

        public void showData() {
            System.out.println("Nilai a dari class Luar \t:" + a);
            System.out.println("Nilai x dari class Dalam \t:" + x);
        }
    }

    public void showData() {
        Dalam obj = new Dalam();
        obj.showData();
    }
}

public class DemoInnerClass {
    public static void main(String[] args) {
        Luar obj = new Luar();

        obj.setA(5);
        obj.showData();
    }
}
