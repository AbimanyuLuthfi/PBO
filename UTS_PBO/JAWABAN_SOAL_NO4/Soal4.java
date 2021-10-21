import java.util.Scanner;
public class Soal4 extends InputanSoal4 {
    private double keliling;
    private double luas;

    public void setkeliling (double kel) {
        this.keliling = kel;
    }
    public void setluas (double l) {
        this.luas = l;
    }

    public double getkeliling () {
        return this.keliling;
    }
    public double getluas () {
        return this.luas;
    }
    Scanner baru = new Scanner(System.in);

    public void viewHasil() {
        System.out.println("Anda Harus Memilih Pi terlebih dahulu");
        System.out.println("1. pi = 3.14");
        System.out.println("2. pi = 22/7");
        System.out.println("Silahkan Pilih Pi Yang Ingin Anda Gunakan Terlebih dahulu [1/2] = ");
        this.pi = baru.nextInt();
        switch(pi){
            case 1 : 
            System.out.println("Silahkan Masukkan Jari - Jari Lingkaran = ");
            this.r = baru.nextFloat();
            this.d = (this.r*2);
            System.out.println(" Jika jari jari nya = " + this.r + " Maka Diameternya adalah " + this.d);
            this.luas = (3.14 * this.r * this.r);
            System.out.println(" Maka Luas Lingkaran Anda Adalah = " + this.luas);
            this.keliling = ( 3.14 *this.d);
            System.out.println(" Maka Keliling Lingkaran Anda Adalah = " + this.keliling);
            break;

            case 2:
            System.out.println("Silahkan Masukkan Jari - Jari Lingkaran = ");
            this.r = baru.nextFloat();
            this.d = (this.r*2);
            System.out.println(" Jika jari jari nya = " + this.r + " Maka Diameternya adalah " + this.d);
            this.luas = ((22/7) * this.r * this.r);
            System.out.println(" Maka Luas Lingkaran Anda Adalah = " + this.luas);
            this.keliling = ((22/7) * this.d);
            System.out.println(" Maka Keliling Lingkaran Anda Adalah = " + this.keliling);
            break;
        }
        
    }
    public static void main (String [] args) {
        Soal4 jawaban = new Soal4();
    
        jawaban.viewHasil();
    }
}
