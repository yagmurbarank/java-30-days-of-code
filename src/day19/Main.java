package src.day19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("Please enter a number:");
        int n = scanner.nextInt();
        scanner.close();
AdvancedArithmetic myCalculator= new Calculator();
int sum= myCalculator.divisorSum(n);
System.out.println("I implemented:" + myCalculator.getClass().getInterfaces()[0].getName() );
System.out.println("Sum of divisors of "+ n + " is " + sum);

    }
}