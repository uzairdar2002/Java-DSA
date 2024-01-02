public class Q2 {
  public static void main(String[] args) {
    int x = 200, y = 50, z = 100;

    if (x > y && y > z) {
      System.out.println("Compiler Error!: At line 34-(condition missing ! ?)");
    }

    if (z > y && z < x) {
      System.out.println("Compiler Error!: At line no 34 - (You are Gay!)");
    }

    if ((y + 200) < x && (y + 150) < z) {
      System.out.println("Hello Java");
    }
  }
}
