// Practical No. 11(C)
// Generic Interface

interface I<T>
{
    void disp(T x);
}

class gen implements I<Integer>
{
    public void disp(Integer y)
    {
        System.out.println(y);
    }
}

class A
{
    public static void main(String[] args)
    {
        gen g = new gen();

        g.disp(8);
    }
}

/*
OUTPUT:

8
*/
