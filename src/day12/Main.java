package src.day12;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            String firstName = sc.next();
            String lastName = sc.next();
            int idNumber = sc.nextInt();


            int numScores = sc.nextInt();
            int[] scores = new int[numScores];
            for (int i = 0; i < numScores; i++) {
                scores[i] = sc.nextInt();
            }


            Student student = new Student(firstName, lastName, idNumber, scores);


            student.printPerson();


            System.out.println("Grade: " + student.calculate());

            sc.close();
        }
}
