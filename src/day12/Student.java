package src.day12;

    class Student extends Person {
        private int[] testScores;


        public Student(String firstName, String lastName, int idNumber, int[] testScores) {
            super(firstName, lastName, idNumber);
            this.testScores = testScores;
        }

        public char calculate() {
            int sum = 0;
            for (int score : testScores) {
                sum += score;
            }
            int average = sum / testScores.length;

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






