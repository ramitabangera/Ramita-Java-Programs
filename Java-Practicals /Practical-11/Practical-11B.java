// Practical No. 12(B)
// Set Interface

import java.util.*;

class col
{
    public static void main(String[] args)
    {
        Set<String> s = new HashSet<>();

        s.add("G");
        s.add("Adv Py");
        s.add("IA");
        s.add("DS");

        System.out.println(s);

        s.remove("G");

        System.out.println(s.contains("G"));

        System.out.println(s.size());
    }
}

/*
OUTPUT:

[DS, IA, G, Adv Py]
false
3
*/
