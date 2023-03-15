

class Pembagian {
    int bagi(int a, int b) {
        return a/b;
    }
    double bagi(double a, double b ) {
        return a/b;
    }
}

public class DemoOverload1 {
    public static void main(String[] args) {

        Pembagian bagi = new Pembagian();

        int x = bagi.bagi(14, 4);
        double y = bagi.bagi(14.0, 4.0);

        System.out.println("Hasil bagi tipe int\t: " + x);
        System.out.println("Hasil bagi tipe double\t: " + y);
        
    }
}
