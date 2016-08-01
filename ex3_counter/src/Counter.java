import java.util.function.*;

public class Counter {
    static IntSupplier getCounter;
    static Runnable incrementCounter;

    static void initCounter() {
        IntRef c = new IntRef(0);
        getCounter = () -> c.get();
        incrementCounter = () -> c.set(c.get() + 1);
    }

    public static void main(String[] args) {
        initCounter();
        System.out.println(getCounter.getAsInt());
        incrementCounter.run();
        System.out.println(getCounter.getAsInt());
        incrementCounter.run();
        incrementCounter.run();
        System.out.println(getCounter.getAsInt());
    }

    private static class IntRef {
        private int val;

        public void set(int val) {
            this.val = val;
        }

        public int get() {
            return val;
        }

        public IntRef(int val) {
            this.val = val;
        }
    }
}
