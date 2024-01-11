package PatternsAdvance;

public class ButterFly {

    public static void butterFly(int lines) {

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            for (int j = 1; j <= 2 * (lines - i); j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = lines; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            for (int j = 1; j <= 2 * (lines - i); j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        butterFly(4);
    }
}
