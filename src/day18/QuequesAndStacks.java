package src.day18;

import java.util.*;


public class QuequesAndStacks {
    // Stack for storing characters in LIFO order
    private Stack<Character> stack;

    // Queue for storing characters in FIFO order
    private Queue<Character> queue;

    // Constructor to initialize stack and queue
    public QuequesAndStacks() {
        this.stack = new Stack<>();
        this.queue = new LinkedList<>();
    }

    // Method to push character onto stack
    public void pushCharacter(char ch) {
        stack.push(ch);
    }

    // Method to enqueue character in queue
    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    // Method to pop character from stack
    public char popCharacter() {
        return stack.pop();
    }

    // Method to dequeue character from queue
    public char dequeueCharacter() {
        return queue.poll();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        // Create main class object
        QuequesAndStacks quequesAndStacks = new QuequesAndStacks();

        // Enqueue and push each character in input
        for (char ch : input.toCharArray()) {
            quequesAndStacks.pushCharacter(ch);
            quequesAndStacks.enqueueCharacter(ch);
        }

        // Check if input is a palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (quequesAndStacks.popCharacter() != quequesAndStacks.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The word, " + input + ", is a palindrome.");
        } else {
            System.out.println("The word, " + input + ", is not a palindrome.");
        }

        scanner.close();
    }
}
