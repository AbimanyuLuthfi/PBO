import java.util.*;

public class Kalkulator_SwitchCase {

    public static void main (String[] args){

        Scanner inputan;
        float x,y,hasil;
        String operator;

        inputan = new Scanner(System.in);

        System.out.print("nilai x = ");
        x = inputan.nextFloat();
        System.out.print("operator = ");
        operator = inputan.next();
        System.out.print("nilai y = ");
        y = inputan.nextFloat();

        switch(operator){
            case "+":
                //penjumlahan
                hasil = x + y;
                System.out.println("Hasil = " + hasil);
                break;
            case "-":
                //pengurangan
                hasil = x - y;
                System.out.println("Hasil = " + hasil);
                break;
            case "*":
                //perkalian
                hasil = x * y;
                System.out.println("Hasil = " + hasil);
                break;
            case "/":
                //pembagian
                hasil = x / y;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("operator" + operator + "tidak ditemukan");
        }

    }
}