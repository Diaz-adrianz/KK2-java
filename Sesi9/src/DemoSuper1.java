class Kotaxx {
    protected double panjang, lebar, tinggi;

    Kotaxx() {
        panjang = lebar = tinggi = 0;
    }

    Kotaxx(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public double hitungVolume() { return panjang * lebar * tinggi ;}
}

class KotakPejal extends Kotaxx {
    private double berat;

    KotakPejal(int p, int l, int t, int b) {
        super(p, l, t);
        berat = b;
    }

    public double getBerat() { return berat ;}
}

public class DemoSuper1 {
    public static void main(String[] args) {

        KotakPejal k = new KotakPejal(6, 5, 4, 2);

        System.out.println("Volume k : " + k.hitungVolume());
        System.out.println("Berat k : " + k.getBerat());
        
    }
    
}
