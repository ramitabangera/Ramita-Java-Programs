'''java
// Practical No. 1(C)
//Write a Java program to demonstrate working with arrays in Java.

class Practical1C
{
    public static void main(String[] args)
    {
        int[] a = new int[5];

        a[0] = 13;
        a[1] = 12;
        a[2] = 4;
        a[3] = 15;
        a[4] = 16;

        System.out.println(a[2]);

        System.out.println(a.length);

        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }

        for (int i : a)
        {
            System.out.println(i);
        }
    }
}

/*
OUTPUT:

4
5
13
12
4
15
16
13
12
4
15
16
*/
```
