import java.util.*;

public class TernaryOperator {

    public static void main (String[] args){


        // Ini merupakan program Ternary operator

        int input, var1;

        Scanner inputan = new Scanner(System.in);

        System.out.print("masukan nilai: ");
        input = inputan.nextInt();

        // variable x = ekspresi ? statement_true : statement_false

        var1 = (input == 10) ? (input*input) : (input/2); // Jika input = 10 maka akan dilakulasi (10 x 10) jika bukan maka (input/2)

//        jika memakai if
//        if (input==10){
//            x = input*input;
//        }else{
//            x = input/2;
//        }

        System.out.println("hasilnya " + var1);

    }
}