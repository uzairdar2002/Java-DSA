package BitManipulation;

public class OddEven {

    public static void oddOrEven(int num) {
        int bitMask = 1;
        if ((num & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(17);
        oddOrEven(14);
        oddOrEven(2);
    }
}
