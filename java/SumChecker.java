import java.util.List;
import java.util.ListIterator;

/**
 * @author Georgiy Korneev (kgeorgiy@kgeorgiy.info)
 */
public class SumChecker extends MainChecker {
    public SumChecker(final String className) {
        super(className);
    }

    public void testRandom(final long result, final List<String> args) {
        for (final ListIterator<String> li = args.listIterator(); li.hasNext(); ) {
            li.set(randomSpace() + li.next() + randomSpace());
        }
        for (final ListIterator<String> li = args.listIterator(); li.hasNext(); ) {
            String next = li.next();
            if (li.hasNext() && random.nextBoolean()) {
                next += " " + randomSpace() + li.next();
                li.remove();
                li.previous();
                li.set(next);
            }
        }
        test(result, args.toArray(new String[args.size()]));
    }

    private String randomSpace() {
        return random.nextBoolean() ? "" : " \t\n\u000B\u2029\f".charAt(random.nextInt(6)) + randomSpace();
    }
}
