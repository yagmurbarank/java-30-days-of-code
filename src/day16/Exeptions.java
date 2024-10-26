package src.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exeptions {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String:");
        String S = bufferedReader.readLine();

        bufferedReader.close();
        try{
            int number = Integer.parseInt(S);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
