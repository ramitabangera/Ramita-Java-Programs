// Practical No. 12(A)
// Write a program to demonstrate Buffered Reader.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BR
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader br =
                new BufferedReader(new FileReader("SYIT.txt"));

            String s;

            while ((s = br.readLine()) != null)
            {
                System.out.println(s);
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

/*
EXPECTED OUTPUT:

Contents of SYIT.txt file will be displayed here.
*/
