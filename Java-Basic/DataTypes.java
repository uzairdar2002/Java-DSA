public class DataTypes {
    public static void main(String[] args) {

        // Premitive Data Types.

        byte B = 20; // Size = 1 byte and stores whole numbers from -128 to 127.
        short S = 30; // Size = 2 bytes and stores whole numbers from -32,768 to 32,767.
        int I = 40; // Size = 4 bytes and stores whole numbers from -2,147,438,648 to 2,147,438,647.
        long L = 5000000000L; // Size = 8 bytes and stores whole numbers from --9,223,372,036,854,775,808 to
        // 9,223,372,036,854,775,807.
        float F = 60.5f; // Size = 4 bytes and stores fractional numbers. Sufficient for storing 6 to 7
                         // decimal digits.
        double D = 70.556d; // Size = 8 bytes and Stores fractional numbers. Sufficient for storing 15
                            // decimal digits.
        boolean Bool = true;
        boolean Bool2 = false; // Size = 1 bit and stores true or false.
        char C = 'A'; // Size = 2 bytes and stores a single character / letter or ASCII values.

        System.out.println(B);
        System.out.println(S);
        System.out.println(I);
        System.out.println(L);
        System.out.println(F);
        System.out.println(D);
        System.out.println(Bool);
        System.out.println(Bool2);
        System.out.println(C);

    }
}
