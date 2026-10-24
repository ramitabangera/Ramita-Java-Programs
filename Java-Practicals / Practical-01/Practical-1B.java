```java
// Practical No. 1(B)
// Write a Java program to demonstrate String Handling.

class Practical1B
{
    public static void main(String[] args)
    {
        String s = "SYIT";
        String s1 = "";

        System.out.println("Length = " + s.length());

        System.out.println("To check empty = " + s1.isEmpty());

        System.out.println("To display specific char = " + s.charAt(1));

        System.out.println("To check equal (Ignore Case) = "
                + s.equalsIgnoreCase("syit"));

        System.out.println("To check equal = " + s.equals("SYIT"));

        System.out.println("SYIT contains IT = " + s.contains("IT"));

        System.out.println("To check first occurrence of S = "
                + s.indexOf('S'));

        System.out.println("To check last occurrence of S = "
                + s.lastIndexOf('S'));

        System.out.println("String starts with A = "
                + s.startsWith("A"));

        System.out.println("String ends with T = "
                + s.endsWith("T"));

        System.out.println("String upper case = "
                + s.toUpperCase());

        System.out.println("String lower case = "
                + s.toLowerCase());

        System.out.println("Change SYIT to SYIT = "
                + s.replace("SYIT", "SYIT"));

        System.out.println("To add = " + s.concat(" NERUL"));
    }
}

/*
OUTPUT:

Length = 4
To check empty = true
To display specific char = Y
To check equal (Ignore Case) = true
To check equal = true
SYIT contains IT = true
To check first occurrence of S = 0
To check last occurrence of S = 0
String starts with A = false
String ends with T = true
String upper case = SYIT
String lower case = syit
Change SYIT to SYIT = SYIT
To add = SYIT NERUL
*/
```
