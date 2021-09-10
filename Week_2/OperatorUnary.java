public class OperatorUnary {

    public static void main(String[] args) {

        // unary = operasi yang dilakukan pada satu variable

        // unary + dan -
        int nilai = 1;
        System.out.printf("unary '+', %d menjadi %d\n",nilai, +nilai);
        System.out.printf("unary '-', %d menjadi %d\n",nilai, -nilai);

        // unary decrement dan increment
        int nilai2 = 10;
        nilai2++;
        System.out.println("nilai dengan '++' menjadi = " + nilai2);

        int nilai3 = 10;
        nilai3--;
        System.out.println("nilai dengan '--' menjadi = " + nilai3);

        int var1 = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++var1); // ditambah terlebih dahulu lalu dicetak
        int var2 = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", var2++); // dicetak terlebih dahulu lalu ditambah
        System.out.printf("nilai hasil dari postfix menjadi = %d \n", var2);

        // unary boolean dengan ! untuk negasi

        boolean abi = true;
        System.out.println("nilai boolean = " + abi);
        System.out.println("nilai boolean = " + !abi);
    }
}