package StringsJava;

public class PrintLargestString {
    public static void main(String[] args) {
        // lexicographically.

        // we will use .compareTo() ---- function.

        String fruits[] = { "apple", "mango", "banana" };
        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
// There is another inbuilt in java called compareToIgnoreCase() ---- It inores
// uppercase or lowercase.
