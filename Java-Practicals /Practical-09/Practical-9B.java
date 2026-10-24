// Practical No. 9(B)
// Write a program to define user defined exceptions
// and raise them as per the requirement.

class AttendancePerQualEx extends Exception
{
    public AttendancePerQualEx(String s)
    {
        super(s);
    }
}

class SYIT
{
    public void eligibility(int per) throws AttendancePerQualEx
    {
        if (per < 75)
            throw new AttendancePerQualEx("Not Eligible");
        else
            System.out.println("Eligible");
    }
}

class A
{
    public static void main(String[] args)
    {
        SYIT obj = new SYIT();

        try
        {
            obj.eligibility(78);
            obj.eligibility(25);
        }
        catch (AttendancePerQualEx e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Finally Executed");
        }
    }
}

/*
OUTPUT:

Eligible
Not Eligible
Finally Executed
*/
