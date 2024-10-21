package src.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TwoDimensionalArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        int maxHourglassSum = Integer.MIN_VALUE;


        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int hourglassSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                maxHourglassSum = Math.max(maxHourglassSum, hourglassSum);
            }
        }

        System.out.println(maxHourglassSum);
    }
}

/*An hourglass in a 2D array is a pattern of values that looks like the shape of an hourglass, with 7 elements.

The shape of the hourglass is as follows:
a b c
  d
e f g

How to calculate the hourglass sum:
Take the top three elements: a, b, c
Take the middle element: d
Take the bottom three elements: e, f, g
*/