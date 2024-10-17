package src.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Arrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a integer for size of array:");
        //Reading an integer
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        //Reading and processing a list of integers
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        //if array size is not match throws an error
        if (arr.size() != n) {
            throw new IllegalArgumentException("Expected " + n + " numbers, but got " + arr.size());
        }
        bufferedReader.close();
        //reverse the list
        Collections.reverse(arr);
        //print the list
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

