import java.util.*;

public class LatihanOperatorLogika {

    public static void main(String[] args){

        // membuat sebuah objek untuk menangkap input dari user
        Scanner inputan = new Scanner(System.in);

        // sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 7;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Silahkan masukan nilai tebakan anda: ");
        nilaiTebakan = inputan.nextInt();
        System.out.println("nilai tebakan anda adalah: " + nilaiTebakan);

        // operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda: " + statusTebakan);

        // operasi aljabar boolean (and / or)

        System.out.print("Clue nya 'Silahkan masukan nilai diantara 4 dan 9': ");
        nilaiTebakan = inputan.nextInt();

        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);

        /*
            a | b | c
            0   0   0
            0   1   0
            1   0   0
            1   1   1
         */

        System.out.println("tebakan anda: " + statusTebakan);


    }
}
