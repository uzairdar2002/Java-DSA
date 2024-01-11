package PatternsAdvance;

public class SolidRhombus {
    public static void solidRhombus(int rows) {
        int spaces = rows - 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            spaces--;
            for (int j = 1; j <= rows; j++) {
                System.out.print("  * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solidRhombus(6);
    }
}
