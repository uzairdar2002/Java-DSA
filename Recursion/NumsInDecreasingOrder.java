package Recursion;

public class NumsInDecreasingOrder {

    public static void printDecreasing(int n) {

        if (n == 1) {
            System.out.println(n); // Base Case
            return;
        }
        System.out.print(n + " ");

        printDecreasing(n - 1); // Function calling itself
    }

    public static void main(String[] args) {
        int n = 10;
        printDecreasing(n);
    }
}
