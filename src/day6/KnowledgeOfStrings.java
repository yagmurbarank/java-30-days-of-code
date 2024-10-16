package src.day6;

import java.util.Scanner;

public class KnowledgeOfStrings {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Please enter a number for space-separated:");
        int T = src.nextInt();
        src.nextLine();
        for (int t = 0; t < T; t++) {
            System.out.println("Please enter a String:");
            String S = src.nextLine();
            String evenText = "";
            String oddText = "";

            for (int i = 0; i < S.length(); i++) {
                if (i % 2 == 0) {
                    evenText += S.charAt(i);
                } else {
                    oddText += S.charAt(i);
                }
            }

            System.out.println(evenText + " " + oddText);
        }

        src.close(); }}
