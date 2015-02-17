import java.util.*;

/**
 * @author Georgiy Korneev (kgeorgiy@kgeorgiy.info)
 */
public class SumLongTest {
    private static final SumChecker checker = new SumChecker("SumLong");

    public static void main(final String[] args) {
        checker.test(1, "1");
        checker.test(6, "1", "2", "3");
        checker.test(1, " 1");
        checker.test(1, "1 ");
        checker.test(1, "\t1\t");
        checker.test(12345, "\t12345\t");
        checker.test(1368, " 123 456 789 ");
        checker.test(60, "010", "020", "030");
        checker.test(-1, "-1");
        checker.test(-6, "-1", "-2", "-3");
        checker.test(-12345, "\t-12345\t");
        checker.test(-1368, " -123 -456 -789 ");
        checker.test(1, "+1");
        checker.test(6, "+1", "+2", "+3");
        checker.test(12345, "\t+12345\t");
        checker.test(1368, " +123 +456 +789 ");
        checker.test(0);
        checker.test(0, " ");
        randomTest(10, 100);
        randomTest(10, Long.MAX_VALUE);
        randomTest(100, Long.MAX_VALUE);
        checker.printStatus();
    }

    private static void randomTest(final int numbers, final long max) {
        long sum = 0;
        final List<String> args = new ArrayList<>();
        for (int i = 0; i < numbers; i++) {
            final long v = checker.random.nextLong() % max;
            args.add(String.valueOf(v));
            sum += v;
        }
        checker.testRandom(sum, args);
    }
}
