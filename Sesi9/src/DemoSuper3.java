class X {
    protected int x;
}

class Y extends X {
    private int x;

    Y(int n1, int n2) {
        super.x = n1;
        x = n2;
    }

    public void tampilkanNilai () {
        System.out.println("Nilai x di dalam kelas X : " + super.x);
        System.out.println("Nilai x di dalam kelas B : " + x);
    }
}

public class DemoSuper3 {
    public static void main(String[] args) {
        Y obj = new Y(69, 96);
        obj.tampilkanNilai();
    }
}
