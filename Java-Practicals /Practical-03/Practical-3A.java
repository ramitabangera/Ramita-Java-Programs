// Practical No. 3(A)
// Write a Java program to implement single level inheritance.

class A
{
    int x;
}

class B extends A
{
    public void show()
    {
        System.out.print(x * x);
    }
}

class C
{
    public static void main(String[] args)
    {
        B obj = new B();

        obj.x = 5;
        obj.show();
    }
}

/*
OUTPUT:

25
*/
