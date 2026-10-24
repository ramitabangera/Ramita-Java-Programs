// Practical No. 5
// Write a Java program to implement Method Overriding.

class A
{
    public void show()
    {
        System.out.println("Hi");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("Hello");
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

Hello
*/
