package PatternsAdvance;

public class HollowRhombus {
    public static void hollowRhombus(int rows) {
        int spaces = rows - 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("   ");
            }
            spaces--;
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRhombus(5);
    }
}
