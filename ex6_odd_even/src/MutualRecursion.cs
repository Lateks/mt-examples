using System;

public class MutualRecursion
{
    private static bool IsOdd(int n) {
        if (n == 0)
            return false;
        return IsEven(n - 1);
    }

    private static bool IsEven(int n) {
        if (n == 0)
            return true;
        return IsOdd(n - 1);
    }

    public static void Main() {
        Console.WriteLine(IsOdd(10));
        Console.WriteLine(IsEven(10));
        Console.WriteLine(IsOdd(9));
        Console.WriteLine(IsEven(9));
        Console.WriteLine(IsOdd(2147483647));
    }
}
