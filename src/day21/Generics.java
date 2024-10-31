package src.day21;

import java.util.Scanner;

public class Generics {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the int size:");
            int intSize = sc.nextInt();
            Integer[] intArray = new Integer[intSize];
            System.out.println("Enter the integers as int size:");
            for (int i = 0; i < intSize; i++) {
                intArray[i] = sc.nextInt();
            }
            Printer.printArray(intArray);

           System.out.println("Enter the string size:");
            int stringSize = sc.nextInt();
            sc.nextLine();
            String[] stringArray = new String[stringSize];
            System.out.println("Enter strings as your string size:");
            for (int i = 0; i < stringSize; i++) {
                stringArray[i] = sc.nextLine();
            }
            Printer.printArray(stringArray);

            sc.close();
        }}
    class Printer {
        // Generic method to print array elements
        public static <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.println(element);
            }
        }
    }

