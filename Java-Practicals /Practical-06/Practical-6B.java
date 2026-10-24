// Practical No. 6(B)
// Write a program to implement the concept of Interface.

interface A
{
    void show();
}

class B implements A
{
    public void show()
    {
        System.out.println("Hello from Interface");
    }
}

class C
{
    public static void main(String[] args)
    {
        B obj = new B();

        obj.show();
    }
}

/*
OUTPUT:

Hello from Interface
*/
