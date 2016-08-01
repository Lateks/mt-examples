using System;

public class NestedClosure
{
    private static Func<int, Func<int, int>> Add(int x)
    {
        return (y) => (z) => x + y + z;
    }

    public static void Main()
    {
        Console.WriteLine(Add(5)(4)(3));
    }
}
