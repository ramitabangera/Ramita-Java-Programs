// Practical No. 4(A)
// Write a Java program to create a class and
// implement the concept of Constructor Overloading.

class Student
{
    int rollno;
    String name;

    Student()
    {
        rollno = 10;
        name = "Ramita";
    }

    Student(int r, String n)
    {
        rollno = r;
        name = n;
    }

    void display()
    {
        System.out.println("Roll no = " + rollno);
        System.out.println("Name = " + name);
    }
}

class Main
{
    public static void main(String[] args)
    {
        Student S1 = new Student();
        Student S2 = new Student(20, "Rahul");

        S1.display();
        S2.display();
    }
}

/*
OUTPUT:

Roll no = 10
Name = Ramita
Roll no = 20
Name = Rahul
*/
