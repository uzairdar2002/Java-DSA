import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scn.nextInt();
        scn.close();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = (year % 100 == 0) && (year % 400 == 0);

        if (x && (y || z)) {
            System.out.println(year + " Is a leap year.");
        } else {
            System.out.println(year + " Is not a leap year.");
        }
    }
}
