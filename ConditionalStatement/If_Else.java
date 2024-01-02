import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        if (age >= 18) {
            System.out.println("You can apply for Driving License.");
        } else {
            System.out.println("No, you can't apply for Driving License. You are below the " + age);
        }
        scn.close();
    }
}

// If Statements
// It is a keyword. If is a control statement. If is a decision making
// statement.
// If by default hold/control one statement.
// If executes only once.
// If works on boolean values (0's, 1's).
