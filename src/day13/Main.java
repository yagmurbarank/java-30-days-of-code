package src.day13;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Title:");
        String title = sc.nextLine();
        System.out.println("Author:");
        String author = sc.nextLine();
        System.out.println("Price:");
        int price = sc.nextInt();


        MyBook myBook = new MyBook(title, author, price);


        myBook.display();


        sc.close();
    }
}
