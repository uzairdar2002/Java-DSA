public class UnaryOperators {
    public static void main(String[] args) {
        int A = 10;
        int B = 10;
        int C = 10;
        int D = 10;

        int e = A++; // Post Increment Unary +.
        int f = B--; // Post Decrement Unary -.
        int g = ++C; // Pre Increment Unary +.
        int h = --D; // Pre Decrement Unary -.

        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

    }
}
