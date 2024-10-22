package src.day12;


public class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;


    public Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }


    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
    }
}
