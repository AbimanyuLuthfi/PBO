import java.util.Scanner;
class Soal2 {

    float BMI;
    float bb,tb;
    String info;
    // Membuat Scanner Baru
    Scanner baru = new Scanner(System.in);

    public void Panggil () {
    System.out.println("Masukkan Berat Badan Anda = ");
    bb = baru.nextFloat();
    System.out.println("Masukkan Tinggi Badan Anda = ");
    tb = baru.nextFloat();
    BMI = (bb / (tb * tb));
    if((BMI >= 18.5) && (BMI <= 22.9)){
        info = "Berat Badan Anda Ideal, Jaga Terus Berat Badanmu Ya!!! :)";
    }
    else if (BMI > 22.9){
        info = "Berat Badan Anda OverWeight, Ayo Jaga Pola Makanmu dan Jangan Lupa Olahraga Ya!!!!! :)";
    }
    else if (BMI < 18.5){
        info = "Berat Badan Anda UnderWeight, Ayo Tingkatkan Berat Badanmu dan tingkatkan Nutrisi Makananmu Ya :)";
    }
    System.out.println("Informasi Berat Badan Anda = " + BMI + " " + info);
    }

    public static void main (String[] args) {
        Soal2 Obj1 = new Soal2();
        Obj1.Panggil();
    }
}
