import java.util.*;

public class latihanLoopSederhana {
  public static void main(String[] args) {
    
    Scanner ourInput = new Scanner(System.in);
    System.out.print("Masukkan nilai awal = ");
    firstValue = ourInput.nextInt();
    System.out.print("Masukkan nilai akhir = ");
    lastValue = ourInput.nextInt();

    total = 0;

    while (lastValue >= firstValue) {
      total += firstValue;
      System.out.println("ditambah " + firstValue + " menjadi " + total );
      firstValue++;
    }
  }
}
