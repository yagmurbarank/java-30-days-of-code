package src.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Given the meal price (base cost of a meal),
 * tip percent (the percentage of the meal price being added as tip),
 * and tax percent (the percentage of the meal price being added as tax) for a meal,
 * find and print the meal's total cost. Round the result to the nearest integer.
 *
 * The function accepts following parameters:
 *  1. DOUBLE meal_cost
 *  2. INTEGER tip_percent
 *  3. INTEGER tax_percent
 */
class Result {
        public static void solve(double meal_cost, int tip_percent, int tax_percent) {

            double tip=  ((tip_percent*meal_cost)/100);
            double tax= ((tax_percent*meal_cost)/100);
            double total_cost= meal_cost+ tip+ tax;
            System.out.println("Total cost is " + Math.round(total_cost));

        }}

        public class Operators {


            public static void main(String[] args) throws IOException {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Please enter your Meal Cost (It should be double) :");
                double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());
                System.out.println("Please enter your Tip Cost (It should be integer) :");
                int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());
                System.out.println("Please enter your Tax Cost (It should be integer):");
                int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

                Result.solve(meal_cost, tip_percent, tax_percent);

                bufferedReader.close();
            }
        }


