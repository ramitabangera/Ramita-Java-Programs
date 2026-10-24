// Practical No. 6(A)
// Write a program to implement the concept of Abstract Classes and Methods.

abstract class A
{
    abstract public void show();

    public void disp()
    {
        System.out.println("X : hi");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("X : Hello");
    }
}

class C
{
    public static void main(String[] args)
    {
        B obj = new B();

        obj.show();
        obj.disp();
    }
}

/*
OUTPUT:

X : Hello
X : hi
*/
