import java.util.Scanner;
class Soal1 {

    float BMI;
    float bb,tb;
    String info;
    // Membuat Scanner Baru
    Scanner baru = new Scanner(System.in);

    public void KalkulasiWaktu () {
        float jam;
        float menit;
        float detik;
        float h1,h2,h3,tarifpulsa,totalpulsa;
        
        Scanner inputan = new Scanner(System.in);
        System.out.print ("Masukan Jam Yang Ingin Anda Gunakan Dalam Percakapan = ");
        jam = inputan.nextFloat();
        System.out.print ("Masukan Menit Yang Ingin Anda Gunakan Dalam Percakapan = ");
        menit = inputan.nextFloat();
        System.out.print ("Masukan Detik Yang Ingin Anda Gunakan Dalam Percakapan = ");
        detik = inputan.nextFloat();
        
        h1 = (jam * 3600);
        h2 =  (menit * 60);
        h3 = (h1 + h2 + detik);
        totalpulsa = h3 / 5;
        tarifpulsa = totalpulsa * 150;
        System.out.print("\n");
        System.out.println ("Total Waktu " + jam + ":" + menit + ":"+ detik + " Dalam Detik = " + h3 );
        System.out.println ("Total Pulsa Yang Anda Gunakan Adalah = " + totalpulsa + " Pulsa");
        System.out.println ("Total Tarif Percakapan Anda Rp " + tarifpulsa);
    }

    public static void main (String[] args) {
        Soal1 jawaban = new Soal1();
        jawaban.KalkulasiWaktu();
    }
}
