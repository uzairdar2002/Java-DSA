import java.util.Scanner;

public class CostOfItems {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the cost of a pencil: ");
        float pencil = scn.nextFloat();
        System.out.println("Enter the cost of a pen: ");
        float pen = scn.nextFloat();
        System.out.println("Enter the cost of an eraser: ");
        float eraser = scn.nextFloat();
        scn.close();

        float total = pencil + pen + eraser;
        System.out.println("The total cost is : " + total);
        // Now with 18% gst tax.

        float newTotal = total + (0.18f * total);

        System.out.println("The new total with 18% gst is : " + newTotal);

    }
}
