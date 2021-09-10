public class OperatorLogika {

    public static void main(String[] args){

        // Operator Logika --> operasi yang bisa kita lakukan kepada tipe data boolean
        // AND, OR, XOR, negasi

        boolean var1,var2,var3;

        // OR / atau (||)

        System.out.println("==== OR (||) =====");
        var1 = false;
        var2 = false;
        var3 = (var1||var2);
        System.out.println(var1 + " || " + var2 + " = " + var3);
        var1 = false;
        var2 = true;
        var3 = (var1||var2);
        System.out.println(var1 + " || " + var2 + " = " + var3);
        var1 = true;
        var2 = false;
        var3 = (var1||var2);
        System.out.println(var1 + " || " + var2 + " = " + var3);
        var1 = true;
        var2 = true;
        var3 = (var1||var2);
        System.out.println(var1 + " || " + var2 + " = " + var3);

        // AND / dan (&&)

        System.out.println("==== AND (&&) =====");
        var1 = false;
        var2 = false;
        var3 = (var1 && var2);
        System.out.println(var1 + " && " + var2 + " = " + var3);
        var1 = false;
        var2 = true;
        var3 = (var1&&var2);
        System.out.println(var1 + " && " + var2 + " = " + var3);
        var1 = true;
        var2 = false;
        var3 = (var1&&var2);
        System.out.println(var1 + " && " + var2 + " = " + var3);
        var1 = true;
        var2 = true;
        var3 = (var1&&var2);
        System.out.println(var1 + " && " + var2 + " = " + var3);


        // XOR / exlusive or (^)

        System.out.println("==== XOR (^) =====");
        var1 = false;
        var2 = false;
        var3 = (var1 ^ var2);
        System.out.println(var1 + " ^ " + var2 + " = " + var3);
        var1 = false;
        var2 = true;
        var3 = (var1^var2);
        System.out.println(var1 + " ^ " + var2 + " = " + var3);
        var1 = true;
        var2 = false;
        var3 = (var1^var2);
        System.out.println(var1 + " ^ " + var2 + " = " + var3);
        var1 = true;
        var2 = true;
        var3 = (var1^var2);
        System.out.println(var1 + " ^ " + var2 + " = " + var3);

        // NOT / negasi --> flipping (!)
        System.out.println("==== NEGASI (!) ====");
        var1 = true;
        var3 = !var1;
        System.out.println(var1 + " --> (!) = " + var3);

        var1 = false;
        var3 = !var1;
        System.out.println(var1 + " --> (!) = " + var3);

    }
}