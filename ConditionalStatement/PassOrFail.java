import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your marks 0 to 100: ");
        int marks = scn.nextInt();
        scn.close();
        String result = (marks >= 35) ? "Pass." : "Fail";
        System.out.println(result);
    }
}
