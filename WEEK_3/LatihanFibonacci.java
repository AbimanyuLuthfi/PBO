import java.util.Scanner;

public class latihanFibonacci {
  public static void main(String[] args) {
  
    int f_n, f_n_1, f_n_2;

    Scanner ourInput = new Scanner(System.in);
    System.out.print("Mengambil nilai fibonacci ke - : ");
    int n = ourInput.nextInt();

    f_n_2 = 0;
    f_n_1 = 1;
    f_n = 1;

    for(int i = 1; i <= n; i++) {
      System.out.println("nilai  ke -" + i + " adalah " + f_n);
      f_n = f_n_1 + f_n_2;
      f_n_2 = f_n_1;
      f_n_1 = f_n;
    }
  }
}
