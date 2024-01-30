package Recursion;

public class SUmOfNatural {
    public static int sumOfNNaturalNums(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = sumOfNNaturalNums(n - 1);
        int Sn = n + Snm1;
        return Sn;

    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(sumOfNNaturalNums(num));
    }
}
