package src.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("First Name:");
            String firstName = sc.nextLine();
            System.out.println("Last Name:");
            String lastName = sc.next();
            System.out.println("ID Number:");
            int idNumber = sc.nextInt();
            System.out.println("Enter scores (enter -1 to stop):");
            List<Integer> scoresList = new ArrayList<>();


            while (true) {
                int score = sc.nextInt();
                if (score == -1) {
                    break;
                }
                scoresList.add(score);
            }

            Student student = new Student(firstName, lastName, idNumber, scoresList);


            student.printPerson();


            System.out.println("Grade: " + student.calculate());

            sc.close();
        }
}
