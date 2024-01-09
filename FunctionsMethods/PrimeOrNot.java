package FunctionsMethods;

// import java.util.Scanner;

public class PrimeOrNot {
    public static boolean isPrime(int p) {
        if (p == 2) {
            return true;
        }

        for (int i = 2; i <= p - 1; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(15));
    }
}
