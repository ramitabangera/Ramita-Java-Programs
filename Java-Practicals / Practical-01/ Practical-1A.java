// Aim: Write a Java program to demonstrate Terminal Input and Output in Java.

// Code
import java.util.Scanner;

public class Practical1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        sc.close();
    }
}

/*
Sample Output:

Enter your name: Ramita
Enter your age: 19

--- Student Details ---
Name: Ramita
Age: 19
*/
