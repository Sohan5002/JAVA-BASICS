package ExceptionHandling;

import java.math.MathContext;
import java.util.Scanner;

public class TrowPractice {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        math.performDivison();
    }
}
class  MathOperations {
    public  void performDivison() {
       try {
        int result = 10/0;
        System.out.println("Result: " + result);
    } catch ( ArithmeticException e) {
           System.out.println("you can't divivde by zero");
       }
}
}