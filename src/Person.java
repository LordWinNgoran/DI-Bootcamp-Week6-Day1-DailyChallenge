//Daily Challenge: Data Types And Constructors
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Write a Java program that implements the design described by the UML Class diagram given below:
 * Date : 29/01/2023
 */
public class Person {
    /* 1
    Create a class called “Person” that has the following properties:
    name (String), age (int), and salary (double).
     */

    public String name;
    public int age;
    public double salary;
    /* 2
    Create a no-arg constructor for the Person class that initializes the properties to default values.
     */
    public Person(){}
    /* 3
    create a second constructor for the Person class that takes in three arguments
    (name, age, and salary) and assigns them to the corresponding properties.
     */
    public Person(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /* 4
    Create a third constructor that takes in two arguments (name and age)
    and assigns them to the corresponding properties, sets salary to -1.
     */
    public Person(String name, int age){
        this.name = name;
        this.salary = -1;
    }
    /* 5
    Add a method to the Person class called “displayInfo” that prints the name,
    age, and salary of the Person object to the console.
     */
    public String displayInfo() {
        return "Person{" +
                "name='" + name  +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    public static void main(String[] args) {
        /* 6
        in the main method of your program, create two Person objects: one
         using the no-arg constructor and the other using th1e second constructor.
         */
        Person personne1 = new Person();
        Person personne2 = new Person("Lordwin",25,25.5);
        /* 7
        Call the “displayInfo” method on each of the Person objects to print their information to the console.
         */
        System.out.println(personne1.displayInfo());
        System.out.println(personne2.displayInfo());

        /* 8
        Create a third Person object using the third constructor, and call the displayInfo method,
         check if salary is -1 and print a message saying “Salary not provided”
         */
        Person personne3 = new Person("Fasio lordwin",0);
        if(personne3.salary ==-1){
            System.out.println("Salary not provided");
        }

    }



}