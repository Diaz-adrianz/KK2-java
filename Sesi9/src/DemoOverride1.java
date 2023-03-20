class Pertama {
    private int pertama;

    public void setPertama(int n) { pertama = n ;}
    public int getPertama() { return pertama ;}
    public void tampilkanNilai() {
        System.out.println("Nilai pertama : " + getPertama());
    }
}

class Kedua extends Pertama{
    private int kedua;

    public void setKedua(int n) { kedua = n ;}
    public int getKedua() { return kedua ;}
    public void tampilkanNilai() {
        System.out.println("Nilai kedua : " + getKedua());
    }
}

public class DemoOverride1 {
    public static void main(String[] args) {
        Kedua ob = new Kedua();

        ob.setPertama(111);
        ob.setKedua(222);

        ob.tampilkanNilai();
    }   
}
