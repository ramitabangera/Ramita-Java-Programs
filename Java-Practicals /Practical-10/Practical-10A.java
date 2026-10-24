// Practical No. 10(A)
// Generic Class

class gen<T>
{
    T x;

    public void disp(T y)
    {
        x = y;
        System.out.println(x);
    }
}

class gen2
{
    public static void main(String[] args)
    {
        gen<Integer> g1 = new gen<>();
        g1.disp(5);

        gen<Double> g2 = new gen<>();
        g2.disp(5.5);

        gen<String> g3 = new gen<>();
        g3.disp("SYIT");
    }
}

/*
OUTPUT:

5
5.5
SYIT
*/
