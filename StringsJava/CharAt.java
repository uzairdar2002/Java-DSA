package StringsJava;

public class CharAt {

    public static void printChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String name = "Uzair Manzoor";
        printChars(name);
    }
}
