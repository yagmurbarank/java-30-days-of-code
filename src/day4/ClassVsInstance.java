package src.day4;

import java.util.*;

class Person{

    private int age;
    public Person(int initialAge){
        if(initialAge<0){
            this.age=0;
            System.out.println("Age is not valid, setting age to 0.");
        }else {
            this.age = initialAge;
        }


    }
    public void yearPasses(){
        this.age++;


    }
    public void amIOld(){
        if( this.age==0 && this.age<2){
            System.out.println("You are baby.");
        }
        else if(this.age>=2 && this.age<=4){
            System.out.println("You are a toddler.");
        }
        else if(this.age>=5 && this.age<=12){
            System.out.println("You are a child.");
        }
        else if(this.age>=13 && this.age<=19){
            System.out.println("You are a teen.");
        }
        else if(this.age>=20 && this.age<=39){
            System.out.println("You are a adult.");
        }
        else if(this.age>=40 && this.age<=59){
            System.out.println("You are a middle age adult.");
        }
        else{
            System.out.println("You are senior adult.");
        }
    }


}

public class ClassVsInstance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many age do you want to test?");
        int number= scanner.nextInt();
        for (int i = 0; i < number; i++) {
            // Read the initial age for each test
            System.out.println("Enter age:");
            int initialAge = scanner.nextInt();

            // Create a new Person object
            Person person = new Person(initialAge);

            // Check the person's current age status
            System.out.print("Now:");
            person.amIOld();

            // Loop for calculate the age after 3 years
            for (int j = 0; j < 3; j++) {
                person.yearPasses();
            }

            // Check the after 3 years
            System.out.print("Three years later:");
            person.amIOld();

            // Printed a blank line between test cases
            System.out.println();
        }


        scanner.close();
    }
}

