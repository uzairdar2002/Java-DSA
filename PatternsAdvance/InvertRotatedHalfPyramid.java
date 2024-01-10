package PatternsAdvance;

public class InvertRotatedHalfPyramid {

    public static void invertedHalfPyramid(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedHalfPyramid(8, 8);
    }
}
