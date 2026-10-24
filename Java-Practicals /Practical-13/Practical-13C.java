// Practical No. 13(C)
// Write a Java program to read the student
// data from user and store it in the file.

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class main
{
    public static void main(String[] args)
    {
        try
        {
            Scanner s = new Scanner(System.in);

            System.out.print("Enter Roll no: ");
            int r = s.nextInt();

            s.nextLine();

            System.out.print("Enter name: ");
            String name = s.nextLine();

            FileWriter fw = new FileWriter("Student.txt");

            fw.write("Roll no = " + r + "\n");
            fw.write("Name = " + name + "\n");

            fw.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

/*
OUTPUT:

Enter Roll no: 10
Enter name: Ramita
*/
