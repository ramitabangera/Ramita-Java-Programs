// Practical No. 11(C)
// Map Interface

import java.util.*;

class col
{
    public static void main(String[] args)
    {
        Map<Integer, String> m = new HashMap<>();

        m.put(1, "Apple");
        m.put(2, "Ball");
        m.put(3, "Cat");
        m.put(4, "Dog");

        System.out.println(m);

        System.out.println(m.remove(2));

        System.out.println(m.containsKey(3));

        System.out.println("Dog");
    }
}

/*
OUTPUT:

{1=Apple, 2=Ball, 3=Cat, 4=Dog}
Ball
true
Dog
*/
