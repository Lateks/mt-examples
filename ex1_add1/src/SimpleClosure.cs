using System;

public class SimpleClosure
{
    private static Func<int, int> Add(int x)
    {
        return y => x + y;
    }

    public static void Main()
    {
        Console.WriteLine(Add(5)(4));

        Func<int, int> add10 = Add(10);

        Console.WriteLine(add10(90));
        Console.WriteLine(add10(999));
    }
}
