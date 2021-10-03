import java.util.*;

public class KalkulatorSederhana {

    public static void main (String[] args){

        // a operator b
        Scanner inputan;
        float x,y,hasil;
        char operator;

        inputan = new Scanner(System.in);

        System.out.print("nilai x= ");
        x = inputan.nextFloat();
        System.out.print("operator= ");
        operator = inputan.next().charAt(0);
        System.out.print("nilai y= ");
        y = inputan.nextFloat();

        System.out.println("input user: " + x + " " + operator + " " + y);

        // operator tersedia * / + -

        if (operator == '+'){
            // penjumlahan
            hasil = x + y;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-'){
            //pengurangan
            hasil = x - y;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*'){
            //perkalian
            hasil = x * y;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/'){
            //pembagian
            if (y == 0){
                System.out.println("pembagi nol menghasilkan tak hingga");
            } else{
                hasil = x / y;
                System.out.println("hasil = " + hasil);
            }
        } else {
            System.out.println("operator tidak ditemukan");
        }

    }
}
