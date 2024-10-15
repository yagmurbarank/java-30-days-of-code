package src.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a number that you want to see its times table:");
        int n = Integer.parseInt(bufferedReader.readLine().trim());


        for(int i=1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+ (n*i));
        }
        System.out.println("Do you want to make another operation? (1 for Yes, 0 for No)");
        int answer = Integer.parseInt(bufferedReader.readLine().trim());

        while (answer == 1) {
            System.out.println("Please enter a number to see its times table:");
            int y = Integer.parseInt(bufferedReader.readLine().trim());

            for (int i = 1; i <= 10; i++) {
                System.out.println(y + " x " + i + " = " + (y * i));
            }

            System.out.println("Do you want to make another operation? (1 for Yes, 0 for No)");
            answer = Integer.parseInt(bufferedReader.readLine().trim());
        }

        System.out.println("Have a nice day!");
        bufferedReader.close();
    }
}
