package FunctionsMethods;

public class FunctionsBasic {

    public static void HelloFunction() {
        System.out.println("Hello World!."); // Function Definition.
    }

    public static void main(String[] args) {
        System.out.println("Before Function.");
        HelloFunction();
        System.out.println("After Function.");
        HelloFunction();
        HelloFunction();
        HelloFunction(); // Function Calling.
    }
}
