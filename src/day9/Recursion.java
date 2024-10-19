package src.day9;

import java.io.*;


class Result {

        public static int factorial(int n) {

            int fact = 1; //This code block ensures that if n is 0, fact remains 1
            for (int i = 1; i <= n; i++) {
                fact *= i;

            }
            return fact;


        }
    }
        public class Recursion {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            /*InputStreamReader(System.in) converts the byte-based System.in stream into a character-based reader.
              BufferedReader adds buffering capabilities to the reader for efficient reading.
            * */
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            /*When you use bufferedWriter.write(), it stores data in memory before sending
             it to the actual output stream (System.out), reducing the number of operations and increasing efficiency.
             */
           // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH"))); //System.getenv("OUTPUT_PATH") is commonly used in online coding platforms to store the output to a file

            System.out.print("Enter a number: ");
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Result.factorial(n);

            bufferedWriter.write(String.valueOf("Factorial of " + n + " is: " + result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

