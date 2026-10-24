// Practical No. 9(A)
// Write a program to demonstrate try, catch block and finally.

class SYIT
{
    public static void main(String[] args)
    {
        try
        {
            int x, y;
            x = 12;
            y = 0;

            System.out.println(x / y);
            System.out.println("Inbetween Code");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Finally Executed");
        }
    }
}

/*
OUTPUT:

/ by zero
Finally Executed
*/
