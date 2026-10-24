```java
// Practical No. 2(A)
// Write a Java program to demonstrate Class, Methods and Objects.

class Student
{
    int roll;
    String name;

    void show(int x, String n)
    {
        roll = x;
        name = n;
    }

    void display()
    {
        System.out.println("Roll no = " + roll);
        System.out.println("Name = " + name);
    }
}

class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.show(10, "Ramita");
        s2.show(20, "Simi");

        s1.display();
        s2.display();
    }
}

/*
OUTPUT:

Roll no = 10
Name = Ramita
Roll no = 20
Name = Simi
*/
```
