import java.util.Scanner;
public class MethodLuasSegitiga{
    static float Lsegitiga (int tinggi, int alas){

        float luas = alas * tinggi /2;
        System.out.println ("Luas Segitiganya adalah = " + luas + " cm^2");
        return luas;
    }
    public static void main(String[] args){
        int tinggi,alas;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai alasnya : ");
        alas = input.nextInt();
        System.out.println("Masukan nilai tingginya : ");
        tinggi = input.nextInt();
        System.out.println(Lsegitiga(alas,tinggi));
    }
}
