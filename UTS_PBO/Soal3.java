import java.util.Scanner;
class Soal3 {

    private static int Bulat;
    private static int a;
    private static int total;
    private static int jml;
    private static int angka;

    Scanner angka = new Scanner(System.in);

    public int loop1() {
    for (int a = 0; a < 10; a++) {
    System.out.printf ("Masukkan Bilangan Yang akan dikalkulasi " + a + " = " );
    Bulat = angka.nextInt();
     }
     return i;
    }

    public int Kalkulasi() {
        total = Bulat + jml;
        if (total == total) {
            System.out.printf ("Total " + total);
            return total;
        }
        return total;
    }

    public static void main(String[] args) {
        Soal3 jawaban = new Soal3();
        jawaban.loop1();
        jawaban.Kalkulasi();
    }
}
