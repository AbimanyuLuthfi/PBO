import java.util.Scanner;
abstract class Manusia {
    // Abstract Method (tidak memiliki body)
    public abstract void data ();

    // Regular Method (tidak memiliki body)
//     public void tidur () {
//         System.out.println("ZZZ........");
//     }
    }
class pegawai extends Manusia {
    public void data() {
        String nama;
        int umur,NIP;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama Anda : ");
        nama = input.nextLine();
        System.out.println("Berapakah Umur Anda Saat ini : ");
        umur = input.nextInt();
        System.out.println("Masukkan NIP Anda : ");
        NIP = input.nextInt();
        System.out.println("");
        System.out.println("Nama Anda : " + nama);
        System.out.println("Umur Anda : " + umur);
        System.out.println("NIP Anda  : " + NIP);


    }
}
public class Abstrak2 {
        public static void main (String[] args) {
            // membuat object ayam
            pegawai Obj1 = new pegawai ();
            Obj1.data();
        }
    }
