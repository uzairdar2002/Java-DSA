import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // scn is the object of Scanner Class.
        Scanner scn = new Scanner(System.in);
        // The line below will take input from user of type int.
        System.out.println("Enter the integer number: ");
        int a = scn.nextInt();
        // Now we will print that variable a which got input from the user.
        System.out.println("You typed " + a);
        scn.close();
    }
}
