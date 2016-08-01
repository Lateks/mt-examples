class MutualRecursion {
    private static boolean isOdd(int n) {
        if (n == 0)
            return false;
        return isEven(n - 1);
    }

    private static boolean isEven(int n) {
        if (n == 0)
            return true;
        return isOdd(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(isOdd(10));
        System.out.println(isEven(10));
        System.out.println(isOdd(9));
        System.out.println(isEven(9));
        System.out.println(isOdd(2147483647));
    }
}
