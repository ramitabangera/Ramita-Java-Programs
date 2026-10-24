// Practical No. 12(B)
// Write a program to demonstrate Buffered Writer.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class BW
{
    public static void main(String[] args)
    {
        try
        {
            BufferedWriter bw =
                new BufferedWriter(new FileWriter("SYIT.txt"));

            String s = "How it works Internally";

            bw.write(s);
            bw.close();

            System.out.println("Task done!");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

/*
OUTPUT:

Task done!
*/
