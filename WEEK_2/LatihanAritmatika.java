import java.util.Scanner;

public class LatihanAritmatika {

    public static void main(String[] args){

        Scanner inputan = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
        // Membuat perhitungan menghitung luas persegi panjang
        // luas = panjang * lebar

        System.out.println("===== MENGHITUNG LUAS PERSEGI PANJANG =====");
        System.out.print("Masukan Nilai Panjang = ");
        panjang = inputan.nextInt();
        System.out.print("Masukan Nilai lebar = ");
        lebar = inputan.nextInt();

        luas = panjang * lebar;
        System.out.println("Luasnya adalah = " + luas + " cm^2");

        System.out.println("===== MENGHITUNG VOLUME BALOK =====");
        System.out.print("Masukan Nilai Tinggi = ");
        tinggi = inputan.nextInt();
        volume = luas*tinggi;
        System.out.println("volumenya adalah = "+ volume + " cm^3");
    }
}
