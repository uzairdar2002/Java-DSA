import java.util.Scanner;

public class Else_If {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        scn.close();

        if (age >= 18 && age < 60) {
            System.out.println("You can apply for driving license.");
        } else if (age >= 60) {
            System.out.println("You are too old for driving. You should now stay at home.");
        } else {
            System.out.println("You are a fuckin child. Go watch some cartoon.");
        }
    }
}
