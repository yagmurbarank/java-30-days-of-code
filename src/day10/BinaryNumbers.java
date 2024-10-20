package src.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryNumbers
{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter a number:");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();

        //if n is zero print zero
        if (n == 0) {
            System.out.println(0);
            return;
        }

        int maxSeriesOfOnes = 0;
        int currentCount = 0;
        //converting binary and find max series of 1's
        while (n > 0) {
            if (n % 2 == 1) {
                currentCount++;
                maxSeriesOfOnes = Math.max(maxSeriesOfOnes, currentCount);
            } else {
                currentCount = 0;
            }

            n = n / 2;
        }

        System.out.println("The number of max consecutive 1 is " + maxSeriesOfOnes);
    }
}
