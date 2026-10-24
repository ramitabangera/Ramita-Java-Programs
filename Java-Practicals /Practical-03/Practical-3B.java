// Practical No. 3(B)
// Write a Java program to implement multiple inheritance.

interface A
{
    void showA();
}

interface B
{
    void showB();
}

class C implements A, B
{
    public void showA()
    {
        System.out.println("This is Interface A");
    }

    public void showB()
    {
        System.out.println("This is Interface B");
    }
}

class Main
{
    public static void main(String[] args)
    {
        C obj = new C();

        obj.showA();
        obj.showB();
    }
}

/*
OUTPUT:

This is Interface A
This is Interface B
*/
