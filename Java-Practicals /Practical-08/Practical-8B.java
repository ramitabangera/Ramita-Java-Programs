// Practical No. 8(B)
// Write a java program to demonstrate working lambda
// expression with multiple parameter.

interface greet
{
    int disp(int x, int y);
}

class twoparam
{
    public static void main(String[] args)
    {
        greet g = (x, y) -> (x + y);

        System.out.println(g.disp(4, 8));
    }
}

/*
OUTPUT:

12
*/
