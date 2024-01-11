package PatternsAdvance;

public class DiamondPattern {
    public static void diamondPattern(int rows) {
        int spaces = rows - 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            spaces--;
            System.out.println();
        }

        spaces = 1;

        for (int i = 1; i <= rows - 1; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * (rows - i) - 1; j++) {
                System.out.print("* ");
            }

            spaces++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamondPattern(4);
    }
}
