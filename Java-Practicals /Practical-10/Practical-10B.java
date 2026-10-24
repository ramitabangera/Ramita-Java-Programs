// Practical No. 10(B)
// Generic Method

class gen<T>
{
    T x;

    public T disp(T y)
    {
        x = y;
        return x;
    }
}

class gen2
{
    public static void main(String[] args)
    {
        gen<Integer> g1 = new gen<>();
        System.out.println(g1.disp(5));

        gen<Double> g2 = new gen<>();
        System.out.println(g2.disp(5.5));

        gen<String> g3 = new gen<>();
        System.out.println(g3.disp("SYIT"));
    }
}

/*
OUTPUT:

5
5.5
SYIT
*/
