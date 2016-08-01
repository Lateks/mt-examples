using System;

public class Counter
{
    public static Func<int> getCounter;
    public static Action incrementCounter;

    public static void initCounter() {
        int c = 0;
        getCounter = () => c;
        incrementCounter = () => c = c + 1;
    }

    public static void Main()
    {
        initCounter();
        Console.WriteLine(getCounter());
        incrementCounter();
        Console.WriteLine(getCounter());
        incrementCounter();
        incrementCounter();
        Console.WriteLine(getCounter());
    }
}
