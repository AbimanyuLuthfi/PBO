// Abstract Class

public class AbstractClass {
    public String fname = "Abimanyu"
    public int age = 18;
    public abstract void study(); //abstract method
}

// Subclass (inherit from Person)
class Student extends Person {
    public int graduationYear = 2018;
    public void study() {
        System.out.println("Studying all day long");
    }
}
// End code from filename : Person.java

// Code from filename: Myclass.java
class MyClass {
    public static void main(String[] args){
        // create an object of the Student class (Which inherits attributes and method from Person)
        Student myObj = new Student();

        System.out.println("Name : " + myObj.fname);
        System.out.println("Age : " + myObj.age);
        System.out.println("Graduation Year : " + myObj.graduationYear);
        myObj.study(); //call abstract method
    }
}
