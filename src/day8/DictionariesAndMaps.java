package src.day8;

import java.util.HashMap;
import java.util.Scanner;

//Key-Value pair mappings using a Map or Dictionary data structure
public class DictionariesAndMaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // hashMap to store phone book
        HashMap<String, String> phoneBook = new HashMap<>();

System.out.println("Enter number:");
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Name:");
            String name = in.next();
            System.out.println("Enter phone number:");
            String phone = in.next();
            //add name and phone to phonebook as key value
            phoneBook.put(name, phone);
        }


        while (in.hasNext()) {
            String query = in.next();

            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}

