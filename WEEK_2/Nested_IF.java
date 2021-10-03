public class Nested_IF {

    public static void main(String[] args){

        // Ini merupakan program nested if atau if bersarang

        int a = 2;
        int b = 10;

        System.out.println("ini adalah awal dari program");
        // Jika a = 5 dan b = 10 maka akan mencetak ini
        if (a == 5){

            if (b == 10){

                System.out.println("ini adalah dimana a = 5 dan b = 10"); // Jika a = 5 dan b = 10 maka akan mencetak ini

            } else {

                System.out.println("ini adalah dimana a = 5 dan b bukan 10"); // Jika a = 5 dan b bukan 10 maka akan mencetak ini

            }

        } else {

            System.out.println("ini adalah dimana a salah"); // Jika a bukan 5 maka akan mencetak ini

        }

        System.out.println("ini adalah akhir dari program");
    }
}
