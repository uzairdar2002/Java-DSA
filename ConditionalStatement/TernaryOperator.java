import java.util.Scanner;

// Another way of using If Else .
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any num: ");
        int a = scn.nextInt();
        scn.close();
        String greater = (a > 10) ? "Yes It Is Greater" : "No It Is Not.";
        System.out.println(greater);
    }
}
