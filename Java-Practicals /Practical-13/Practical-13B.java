// Practical No. 13(B)
// Write a Java program to copy the contents
// from one file to other file.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FC
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr = new FileReader("SYIT.txt");
            FileWriter fw = new FileWriter("lyit.txt");

            int data;

            while ((data = fr.read()) != -1)
            {
                fw.write((char)data);
            }

            fr.close();
            fw.close();

            System.out.println("File Successfully");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

/*
OUTPUT:

File Successfully
*/
