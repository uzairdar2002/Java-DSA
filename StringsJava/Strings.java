package StringsJava;

import java.util.*;

public class Strings {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name;
        name = scn.nextLine();
        scn.close();
        System.out.println("You entered : " + name);

    }
}
