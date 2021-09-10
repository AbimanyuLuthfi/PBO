import java.util.*;

public class SwitchCase {

    // switch case

    public static void main(String[] args){

        String input;
        Scanner inputan = new Scanner(System.in);

        System.out.print("panggil nama: ");
        input = inputan.next();

        // ekspresinya berupa satuan (int,long,byte,short), String, atau enum
        switch(input){
            case "Raihan":
                System.out.println("saya Raihan dan hadir Cuyy!!!");
                break;
            case "Wildan":
                System.out.println("saya Wildan dan hadir Cuyy!!!!");
                break;
            case "Januar":
                System.out.println("saya Januar dan hadir Cuyy!!!!");
                break;
            default:
                System.out.println(input + " tidak hadir Cuyy!!!");
        }

        System.out.println("selesai program");

    }

}