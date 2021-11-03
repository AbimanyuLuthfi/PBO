public class JavaConstructor2 {
    int x;
    public JavaConstructor2(int y){
        x = y;
    }
    public static void main(String [] args){
        JavaConstructor2 myObj = new JavaConstructor2(5);
        System.out.println(myObj.x);
    }
}
