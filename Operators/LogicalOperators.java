package Operators;

public class LogicalOperators {
   public static void main(String[] args) {

      /*
       * Logical Operators
       *
       * && - Logical And.
       *
       * || - Logical Or.
       *
       * ! - Logical Not.
       */
      /*
       * Logical And &&. --> The && operator doesn't check the second condition if
       * first condition is false. It checks the second condition only if the first
       * one is true.
       * 
       * A B A && B
       * True True True
       * False True False
       * True False False
       * False False False
       * 
       * 
       * Logical Or ||. --> It works opposite to the logical AND operator, as it only
       * gives false when both statements of the expression are not true. Otherwise,
       * it returns true.
       * 
       * A B A || B
       * True True True
       * False True True
       * True False True
       * False False False
       * 
       * 
       * Logical Not !. --> This operator accepts a single argument and returns the
       * inverse value of the corresponding argument.
       * 
       * A !A
       * True False
       * False True
       */

      System.out.println("Hello Visitors!");
   }

}
