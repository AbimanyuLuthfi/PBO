public class OperatorKomparasi {

    public static void main(String[] args){

        // operator komparasi...ini akan menghasilkan nilai dalam bentuk boolean

        int var1,var2;
        boolean hasilKomparasi;

        // operator equal atau persamaan
        System.out.println("===== PERSAMAAN =====");
        var1 = 10;
        var2 = 10;
        hasilKomparasi = (var1 == var2);
        System.out.printf("%d == %d --> %s \n",var1,var2, hasilKomparasi);

        var1 = 15;
        var2 = 10;
        hasilKomparasi = (var1 == var2);
        System.out.printf("%d == %d --> %s \n",var1,var2, hasilKomparasi);

        // operator not equal atau pertidaksamaan
        System.out.println("===== PERTIDAKSAMAAN =====");
        var1 = 15;
        var2 = 15;
        hasilKomparasi = (var1 != var2);
        System.out.printf("%d != %d --> %s \n",var1,var2, hasilKomparasi);

        var1 = 15;
        var2 = 10;
        hasilKomparasi = (var1 != var2);
        System.out.printf("%d != %d --> %s \n",var1,var2, hasilKomparasi);

        // operator less than atau kurang dari
        System.out.println("===== KURANG dari =====");
        var1 = 8;
        var2 = 12;
        hasilKomparasi = (var1 < var2);
        System.out.printf("%d < %d --> %s \n",var1,var2, hasilKomparasi);

        var1 = 15;
        var2 = 10;
        hasilKomparasi = (var1 < var2);
        System.out.printf("%d < %d --> %s \n",var1,var2, hasilKomparasi);

        // operator greater than atau lebih dari
        System.out.println("===== LEBIH dari =====");
        var1 = 7;
        var2 = 10;
        hasilKomparasi = (var1 > var2);
        System.out.printf("%d > %d --> %s \n",var1,var2, hasilKomparasi);

        var1 = 20;
        var2 = 10;
        hasilKomparasi = (var1 > var2);
        System.out.printf("%d > %d --> %s \n",var1,var2, hasilKomparasi);

        // operator less than equal atau kurang dari sama dengan
        System.out.println("===== KURANG DARI SAMA DENGAN =====");
        var1 = 8;
        var2 = 10;
        hasilKomparasi = (var1 <= var2);
        System.out.printf("%d <= %d --> %s \n",var1,var2, hasilKomparasi);

        var1 = 15;
        var2 = 15;
        hasilKomparasi = (var1 <= var2);
        System.out.printf("%d <= %d --> %s \n",var1,var2, hasilKomparasi);

        var1 = 15;
        var2 = 10;
        hasilKomparasi = (var1 <= var2);
        System.out.printf("%d <= %d --> %s \n",var1,var2, hasilKomparasi);

        // operator greater than equal atau lebih dari sama dengan
        System.out.println("===== LEBIH DARI SAMA DENGAN =====");
        var1 = 8;
        var2 = 10;
        hasilKomparasi = (var1 >= var2);
        System.out.printf("%d >= %d --> %s \n",var1,var2, hasilKomparasi);

        var1 = 10;
        var2 = 10;
        hasilKomparasi = (var1 >= var2);
        System.out.printf("%d >= %d --> %s \n",var1,var2, hasilKomparasi);

        var1 = 12;
        var2 = 10;
        hasilKomparasi = (var1 >= var2);
        System.out.printf("%d >= %d --> %s \n",var1,var2, hasilKomparasi);


    }
}
