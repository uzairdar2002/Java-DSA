import java.util.Scanner;


public class Q1 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the any number : ");
    int number = scn.nextInt();
    scn.close();

    if (number < 0) {
      System.out.println("Negative Number!.");
    }
    else if (number == 0)
    {
      System.out.println("Number is Zero!");
    }
    else{
      System.out.println("Positive Number!.");
    }
  }
}
