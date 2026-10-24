// Practical No. 14(A)
// Write a Java program to implement Thread Life Cycle.

class R implements Runnable
{
    public void run()
    {
        System.out.println("Thread is Running");

        try
        {
            Thread.sleep(500);
            System.out.println("Thread is Waiting");
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Thread is Completed");
    }
}

class S
{
    public static void main(String[] args)
    {
        Runnable r = new R();
        Thread t1 = new Thread(r);

        System.out.println("Thread is Created");

        t1.start();

        System.out.println("Thread is Running");
    }
}

/*
OUTPUT:

Thread is Created
Thread is Running
Thread is Running
Thread is Waiting
Thread is Completed
*/
