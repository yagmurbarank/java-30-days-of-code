package src.day17;
import java.util.Scanner;


class Calculator {
        int power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("n and p should be non-negative");
            }
            return (int) Math.pow(n, p);
        }
    }

public class MoreException {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Calculator calculator = new Calculator();

            System.out.print("Enter number of test cases: ");
            int T = scanner.nextInt();  // number of test cases

            for (int i = 0; i < T; i++) {
                int n = scanner.nextInt();
                int p = scanner.nextInt();

                try {
                    int result = calculator.power(n, p);
                    System.out.println(result);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            scanner.close();
        }
    }


