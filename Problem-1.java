import java.io.*;
import java.util.*;

class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter input in following order: first number, second number, operator.");
        double firstInput = sc.nextInt();
        double secondInput = sc.nextInt();
        String operator = sc.next();
        switch (operator) {
            case "+" : System.out.println(firstInput + secondInput);
                        break;
            case "-" : System.out.println(firstInput - secondInput);
                        break;
            case "*" : System.out.println(firstInput * secondInput);
                        break;
            case "/" : System.out.println(firstInput / secondInput);
                        break;
            default : System.out.println("Please enter a valid operator");
        }
        
    }
}
