// Practical No. 8(A)
// Write a java program to demonstrate lambda
// expressions with Single Parameter.

interface greet
{
    void disp(int x);
}

class oneparam
{
    public static void main(String[] args)
    {
        greet g = (x) -> System.out.println(x * x);

        g.disp(4);
    }
}

/*
OUTPUT:

16
*/
