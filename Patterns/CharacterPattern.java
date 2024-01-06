package Patterns;

public class CharacterPattern {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';

        for (int lines = 1; lines <= n; lines++) {
            for (int chars = 1; chars <= lines; chars++) {
                System.out.print(" " + ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
