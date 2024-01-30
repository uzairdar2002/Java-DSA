package Recursion;

public class NumsInIncreasingOrder {

    public static void increasingOrder(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        increasingOrder(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        increasingOrder(n);
    }
}
