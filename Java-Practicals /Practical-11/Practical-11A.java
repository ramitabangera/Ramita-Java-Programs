// Practical No. 12(A)
// Write a program to demonstrate the methods of List Interface.

import java.util.*;

class col
{
    public static void main(String[] args)
    {
        List<String> l = new ArrayList<>();

        l.add("G");
        l.add("Adv Py");
        l.add("IA");
        l.add("DS");

        System.out.println(l);

        l.remove(0);
        System.out.println(l);

        l.remove("DS");
        System.out.println(l);

        System.out.println(l.get(0));

        l.set(1, "rm");
        System.out.println(l);

        System.out.println(l.contains("rm"));

        System.out.println(l.indexOf("G"));
    }
}

/*
OUTPUT:

[G, Adv Py, IA, DS]
[Adv Py, IA, DS]
[Adv Py, IA]
Adv Py
[Adv Py, rm]
true
-1
*/
