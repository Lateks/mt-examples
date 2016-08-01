/*
 * ============
 * OS X (Mono):
 * ============
 * Compile using:
 * `mcs -r:/Library/Frameworks/Mono.framework//Versions/4.2.1/lib/mono/4.5/System.Numerics.dll Factorial.cs`
 * Run using `mono Factorial.exe`
 *
 * Overflows on very large inputs, but not e.g. 10000.
 * 1000000 overflows when using ints.
 * 100000 results in a memory allocation error when using BigInteger!
 *
 * ================
 * On .NET/Windows:
 * ================
 * Compile using:
 * `csc /lib:C:\Windows\Microsoft.NET\Framework\v4.0.30319/ /reference:System.Numerics.dll Factorial.cs`
 * Then just run `Factorial.exe`.
 *
 * Already overflows at 10000.
 */
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
