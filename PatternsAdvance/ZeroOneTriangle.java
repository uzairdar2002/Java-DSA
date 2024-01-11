package PatternsAdvance;

public class ZeroOneTriangle {
    public static void zeroOne(int num) {
        int one = 1;
        int zero = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(zero + " ");
                } else {
                    System.out.print(one + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zeroOne(5);
    }
}
