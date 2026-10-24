// Practical No. 2(B)
// Write a Java program to demonstrate Encapsulation in Java.

class Student
{
    private int no;
    private String name;

    public void display()
    {
        System.out.println("Roll No: " + no);
        System.out.println("Name is: " + name);
    }

    public void put(int a, String b)
    {
        no = a;
        name = b;
    }
}

class R
{
    public static void main(String[] args)
    {
        Student Obj = new Student();

        Obj.put(10, "Ramita");
        Obj.display();
    }
}

/*
OUTPUT:

Roll No: 10
Name is: Ramita
*/
