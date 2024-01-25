package BitManipulation;

public class GetithBit {
    public static int getIthBitI(int n, int i) {
        int bitMaks = 1 << i;
        if ((n & bitMaks) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getIthBitI(10, 2));
    }
}
