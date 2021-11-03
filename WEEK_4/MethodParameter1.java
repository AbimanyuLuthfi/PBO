public class MethodParameter1 {

  static void methodKu(String namaDepan, String namaBelakang) { // nama disini adalah parameter
    String nama = namaDepan + " " + namaBelakang;
    System.out.println("Selamat datang " + nama);
  }

  public static void main(String[] args) {
    // Pemanggilan method dengan argumen
    methodKu("Abimanyu", "Luthfi"); // Jamal adalah argumen
  }
}
