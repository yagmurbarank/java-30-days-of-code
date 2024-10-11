package src.day0;
import java.util.*;

public class HelloWorld
{
    public static void main(String[] args) {
            Scanner k=new Scanner(System.in);
            System.out.println("Hello, World.");
            System.out.println("What is your name?");
            String input= k.nextLine();
            System.out.println("Hello!" + input);
        }
    }