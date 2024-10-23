package src.day12;

import java.util.List;

class Student extends Person {
        private List<Integer> testScores;

        public Student(String firstName, String lastName, int idNumber,  List<Integer> scores) {
            super(firstName, lastName, idNumber);
            this.testScores = scores;
        }

        public char calculate() {
            int sum = 0;
            for (int score : testScores) {
                sum += score;
            }
            int average = sum / testScores.size();

            if (average >= 90 && average <= 100) {
                return 'O';
            } else if (average >= 80) {
                return 'E';
            } else if (average >= 70) {
                return 'A';
            } else if (average >= 55) {
                return 'P';
            } else if (average >= 40) {
                return 'D';
            } else {
                return 'T';
            }
        }
    }






