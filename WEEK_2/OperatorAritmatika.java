public class OperatorAritmatika {

    public static void main(String[] args) {

        // Operasi Aritmatika

        int v1 = 10;
        int v2 = 5;

        int hasil;

        // 1. penjumlahan

        hasil = v1 + v2;
        System.out.println(v1 + " + " + v2 + " = " + hasil);

        // 2. pengurangan
        hasil = v1 - v2;
        System.out.printf("%d - %d = %d \n",v1,v2,hasil);

        // 3. perkalian
        hasil = v1 * v2;
        System.out.printf("%d x %d = %d \n",v1,v2,hasil);

        // 4. pembagian
        hasil = v1 / v2;
        System.out.printf("%d / %d = %d \n",v1,v2,hasil);

        float a = 7;
        float b = 5;
        float hasilFloat = a/b;
        System.out.println(a + " / " + b + " = " + hasilFloat);

        // 5. modulus (sisa pembagian)
        hasil = v1 % v2;
        System.out.printf("%d %% %d = %d \n",v1,v2,hasil);

    }
}
