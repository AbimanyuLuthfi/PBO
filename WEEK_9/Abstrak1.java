abstract class Hewan2 {
    // Abstract Method (tidak memiliki body)
    public abstract void suara ();

    // Regular Method (tidak memiliki body)
    public void tidur () {
        System.out.println("ZZZ........");
    }
}
class Ayam2 extends Hewan2 {
    public void suara() {
        System.out.println("Suara ayam : kukuruyukkk");
    }
}
public class Abstrak1 {
        public static void main (String[] args) {
            // membuat object ayam
            Ayam2 ayam = new Ayam2 ();
            ayam.suara();
            ayam.tidur();
        }
    }
