package src.day1;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "Yagmur ";
        int k;
        double l;
        String st;

        Scanner sr= new Scanner(System.in);

        System.out.println("Please enter an integer number.");
        k= sr.nextInt();
        System.out.println("Please enter a Double number.");
        l= sr.nextDouble();
        sr.nextLine(); //Consume the leftover newline character
        System.out.println("Please enter a String.");
        st = sr.nextLine();

        System.out.println("Sum of i and your integer number: " + (i+k));
        System.out.println("Sum of d and your double number: " +(d+l));
        System.out.println("Sum of s and your String: " +(s+ st));
        sr.close();

    }
}
