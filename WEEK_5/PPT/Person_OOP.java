public class Person_OOP {
    String fname = "Abimanyu";
    String lname = "Luthfi";
    int age = 18;

    public static void main (String[] args) {
        Person myObj = new Person();
        System.out.println("Name : " + myObj.fname + " " + myObj.lname);
        System.out.println("Age  : " + myObj.age);
    }
}
