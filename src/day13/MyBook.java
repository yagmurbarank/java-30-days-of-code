package src.day13;

public class MyBook extends  Book{
    public MyBook(String title, String author, int price) {
        super(title, author, price);
    }
    public void display() {
        System.out.println("Title: " + title );
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
