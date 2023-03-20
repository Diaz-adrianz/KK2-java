class Bentuk {
    public double luas() {
        System.out.println("Tidak didefinikan");
        return 0;
    }
}

class PersegiPanjang extends Bentuk {
    private double panjang, lebar;

    PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }
    public double luas() {
        System.out.println("Dalam objek Persegi panjang");
        return panjang * lebar;
    }
}

class BujurSangkar extends Bentuk {
    private double sisi;

    BujurSangkar(int s) { sisi = s ;}
    public double luas() {
        System.out.println("Dalam objek Bujur Sangkar");
        return sisi * sisi;
    }
}
class Segitiga extends Bentuk {
    private double alas, tinggi;

    Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }
    public double luas() {
        System.out.println("Dalam objek Segitiga");
        return (alas * tinggi) / 2;
    }
}
class Lingkaran extends Bentuk {
    private double jari;
    private final double PI = 3.1416;

    Lingkaran(int r) { jari = r ;}

    public double luas() {
        System.out.println("Dalam objek Lingkaran");
        return PI * jari * jari;
    }
}
public class DemoPolimorfisme2 {
    public static void main(String[] args) {
    
        Bentuk bentuk;

        PersegiPanjang pp = new PersegiPanjang(5, 3);
        BujurSangkar bs = new BujurSangkar(4);
        Segitiga st = new Segitiga(4, 3);
        Lingkaran l = new Lingkaran(2);

        bentuk = pp;
        System.out.println("Luas : " + bentuk.luas() + "\n");

        bentuk = bs;
        System.out.println("Luas : " + bentuk.luas() + "\n");

        bentuk = st;
        System.out.println("Luas : " + bentuk.luas() + "\n");

        bentuk = l;
        System.out.println("Luas : " + bentuk.luas() + "\n");
    }
}
