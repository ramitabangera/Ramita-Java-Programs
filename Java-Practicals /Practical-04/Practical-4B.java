// Practical No. 4(B)
// Write a program to implement Method Overloading.

class Calculate
{
    void area(int side)
    {
        System.out.println("Area of Square = " + (side * side));
    }

    void area(int length, int breadth)
    {
        System.out.println("Area of Rectangle = "
                + (length * breadth));
    }

    void area(double radius)
    {
        System.out.println("Area of Circle = "
                + (3.14 * radius * radius));
    }
}

class Main
{
    public static void main(String[] args)
    {
        Calculate a = new Calculate();

        a.area(5);
        a.area(10, 20);
        a.area(7.0);
    }
}

/*
OUTPUT:

Area of Square = 25
Area of Rectangle = 200
Area of Circle = 153.86
*/
