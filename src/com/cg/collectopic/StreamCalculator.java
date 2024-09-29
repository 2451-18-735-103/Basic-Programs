package com.cg.collectopic;
@FunctionalInterface
interface ArithmeticOperation {
    double performOperation(double operand1, double operand2);
}
public class StreamCalculator {
       public static void main(String args[]) {
    	   
       
    	   performOperation(10, 5, (a, b) -> a + b, "Addition");
 
           // Subtraction
           performOperation(10, 5, (a, b) -> a - b, "Subtraction");

           // Multiplication
           performOperation(10, 5, (a, b) -> a * b, "Multiplication");

           // Division
           performOperation(10, 5, (a, b) -> a / b, "Division");
       }

       private static void performOperation(double operand1, double operand2, ArithmeticOperation operation, String operationName) {
           double result = operation.performOperation(operand1, operand2);
           System.out.println(operationName + ": " + operand1 + " " + operationName.toLowerCase() + " " + operand2 + " = " + result);
       }
   }
