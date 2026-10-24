// Practical No. 14(B)
// Write a Java program to implement multithreading.

class A implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(
                "Thread: " + Thread.currentThread().getName()
                + " - " + i);

            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}

class B
{
    public static void main(String[] args)
    {
        Runnable x = new A();
        Thread t1 = new Thread(x);

        t1.start();
    }
}

/*
OUTPUT:

Thread: Thread-0 - 0
Thread: Thread-0 - 1
Thread: Thread-0 - 2
Thread: Thread-0 - 3
Thread: Thread-0 - 4
*/
