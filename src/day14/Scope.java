package src.day14;

import java.util.*;

class Difference {
    private int[] _elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this._elements = elements;
    }

    public void computeDifference() {
        int min = _elements[0];
        int max = _elements[0];

        for (int i = 1; i < _elements.length; i++) {
            if (_elements[i] < min) {
                min = _elements[i];
            }
            if (_elements[i] > max) {
                max = _elements[i];
            }
        }

        maximumDifference = Math.abs(max - min);
    }
}

public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = sc.nextInt();
        int[] elements = new int[n];

        for (int i = 0; i < n; i++) {
            elements[i] = sc.nextInt();
        }


        Difference difference = new Difference(elements);
        difference.computeDifference();


        System.out.println(difference.maximumDifference);
    }
}
