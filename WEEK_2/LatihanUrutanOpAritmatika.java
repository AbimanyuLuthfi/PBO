import java.util.Scanner;

public class LatihanUrutanOpAritmatika {

    public static void main(String[] args){

        /* kesimpulannya adalah
           perkalian atau pembagian akan dilakukan terlebih
           dahulu*/

        /* jika dilakukan perkalian dan pembagian, maka
           akan dilakukan operasinya dari kiri ke kanan */

        int hasil = 5 * 10 / 2;
        System.out.println("===== HASIL KALKULASI 1 =====");
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
         System.out.println("===== HASIL KALKULASI 2 =====");
        System.out.println(hasil);

        // menggunakan pengelompokan operasi dengan ( )
        hasil = 60 / (2 + 10);
         System.out.println("===== HASIL KALKULASI 3 =====");
        System.out.println(hasil);

        Scanner Inputan = new Scanner(System.in);
        // perhitungan persamaan kuadrat
        System.out.println("===== MENGHITUNG PERSAMAAN KUADRAT =====");
        int var1,var2,var3;

        System.out.print("nilai variable 1 = ");
        var2 = Inputan.nextInt();
        System.out.print("gradient m = ");
        var1 = Inputan.nextInt();
        System.out.print("bias variable 2 = ");
        var3 = Inputan.nextInt();
        int y = (var1 * var2 * var2) + var3;

        System.out.println("nilai y = " + y);

    }
}
