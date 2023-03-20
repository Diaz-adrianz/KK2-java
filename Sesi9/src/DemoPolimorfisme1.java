class Penyanyi {
    public void bernyanyi() {
        System.out.println("Katakteristik nadanya " + "belum terdefinisi");
    }
}

class PenyanyiJazz extends Penyanyi {
    public void bernyanyi() {
        System.out.println("Bernyanyi dengan irama jazz");
    }
}

class PenyanyiPop extends Penyanyi {
    public void bernyanyi() {
        System.out.println("Bernyanyi dengan irama pop");
    }
}
class PenyanyiDangdut extends Penyanyi {
    public void bernyanyi() {
        System.out.println("Bernyanyi dengan irama dangdut");
    }
}

public class DemoPolimorfisme1 {
    public static void main(String[] args) {
        Penyanyi p;

        PenyanyiJazz musmujiono = new PenyanyiJazz();
        PenyanyiPop audi = new PenyanyiPop();
        PenyanyiDangdut inul = new PenyanyiDangdut();

        p = musmujiono;
        p.bernyanyi();

        p = audi;
        p.bernyanyi();
        
        p = inul;
        p.bernyanyi();
    }
}
