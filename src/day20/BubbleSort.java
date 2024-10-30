package src.day20;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = sc.nextInt();
        int[] a = new int[n];


        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();


        int numSwaps = 0;

        for (int i = 0; i < n; i++) {
            int swapsThisRound = 0;

            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    numSwaps++;
                    swapsThisRound++;
                }
            }



            if (swapsThisRound == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}




