class Kotax {
    double panjang, lebar, tinggi;

    Kotax(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    Kotax perbesar(int M) {
        Kotax temp = new Kotax(panjang*M, lebar*M, lebar*M);
        return temp;
    }
}
public class DemoKembalianObjek {
    public static void main(String[] args) {
        Kotax kOri, kNew;

        kOri = new Kotax(4, 3, 2);
        kNew = kOri.perbesar(2);

        System.out.println("Nilai pada objek kotak Ori");
        System.out.println("Panjang\t: " + kOri.panjang);
        System.out.println("Lebar\t: " + kOri.lebar);
        System.out.println("Tinggi\t: " + kOri.tinggi);
        System.out.println("Volume\t: " + kOri.hitungVolume());

        System.out.println("\nNilai pada objek kotak Baru");
        System.out.println("Panjang\t: " + kNew.panjang);
        System.out.println("Lebar\t: " + kNew.lebar);
        System.out.println("Tinggi\t: " + kNew.tinggi);
        System.out.println("Volume\t: " + kNew.hitungVolume());
    }
}
