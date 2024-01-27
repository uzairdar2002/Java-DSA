package ObjectOrientedProgramming;

/**
 * OOPS
 */
public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Constructor. -- Created a pen object p1. -- Objects are created in heap.
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }

}

// Make other classes below Public Class.
class Pen {
    // properties and functions

    private String color;
    private int tip;

    String getColor() {
        return this.color; // Getter
    }

    void setColor(String newColor) {
        this.color = newColor; // Setter
    }

    int getTip() {
        return this.tip; // Getter
    }

    void setTip(int newTip) {
        this.tip = newTip; // Setter
    }
}
