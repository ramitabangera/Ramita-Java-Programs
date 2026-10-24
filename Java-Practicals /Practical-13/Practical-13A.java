// Practical No. 13(A)
// Write a Java program to open a file and
// display the contents in the console window.

import java.io.FileReader;
import java.io.IOException;

class FR
{
    public static void main(String[] args)
    {
        try
        {
            int data;
            FileReader fr = new FileReader("SYIT.txt");

            while ((data = fr.read()) != -1)
            {
                System.out.print((char)data);
            }

            fr.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

/*
OUTPUT:

Contents of SYIT.txt will be displayed here.
*/
