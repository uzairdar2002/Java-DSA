package StringsJava;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if (s1 == s2) {
            System.out.println("The Strings are equal.");
        } else {
            System.out.println("The Strings are not equal.");
        }

        if (s1 == s3) {
            System.out.println("The Strings are equal.");
        } else {
            System.out.println("The Strings are not equal.");
        }

        // .equals() ---- function compares the value.

        if (s1.equals(s3)) {
            System.out.println("The Strings are equal.");
        } else {
            System.out.println("The Strings are not equal.");
        }
    }
}
