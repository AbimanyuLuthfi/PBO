public class ClassAttributes2 {
    final int x = 10;
    final double PI = 3.14;

    public static void main (String[] args) {
        ClassAttributes2 myObj = new ClassAttributes2(); // Object 1 baru
        myObj.x = 50; // akan mengalami error karena nilai pada tipe data final tidak dapat diganti
        myObj.PI = 25; // akan mengalami error karena nilai pada tipe data final tidak dapat diganti

        System.out.println(myObj.x);
    }
}
