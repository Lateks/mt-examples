// Compile with `javac Factorial.java`
// Run with `java Factorial`
import java.math.BigInteger;

class Factorial {
    public static BigInteger factHelper(BigInteger n, BigInteger acc) {
        if (n.equals(BigInteger.ZERO))
            return acc;
        else
            return factHelper(n.subtract(BigInteger.ONE), acc.multiply(n));
    }

    public static BigInteger fact(int n) {
        return factHelper(BigInteger.valueOf(n), BigInteger.ONE);
    }

    // fact(10000) is not enough to blow the stack on my machine.
    public static void main(String[] args) {
        System.out.println(fact(100000));
    }
}
