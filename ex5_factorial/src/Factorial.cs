using System;
using System.Numerics;

public class Factorial
{
    private static BigInteger FactHelper(BigInteger n, BigInteger acc) {
        if (n.IsZero)
            return acc;
        else
            return FactHelper(n - BigInteger.One, acc * n);
    }

    public static BigInteger Fact(int n) {
        return FactHelper(new BigInteger(n), BigInteger.One);
    }

    public static void Main()
    {
      Console.WriteLine(Fact(10000));
    }
}
