import java.util.function.Function;

public class SimpleClosure {
    static Function<Integer, Integer> add(int x) {
        return (y) -> {
            return x + y;
        };
    }

    public static void main(String[] args) {
        System.out.println(add(5).apply(4));

        Function<Integer, Integer> add10 = add(10);
        System.out.println(add10.apply(90));
        System.out.println(add10.apply(999));
    }
}
