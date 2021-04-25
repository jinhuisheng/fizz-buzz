package fizzbuzz;

import static java.lang.String.*;

public class FizzBuzz {

    public static final int BUZZ_NUMBER = 5;
    public static final int FIZZ_NUMBER = 3;
    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public static String of(int number) {
        return new FizzBuzz(number).parse();
    }

    private String parse() {
        String result = "";
        if (isDividedByOrContains(FIZZ_NUMBER)) {
            result += "Fizz";
        }
        if (isDividedByOrContains(BUZZ_NUMBER)) {
            result += "Buzz";
        }
        return result.isEmpty() ? valueOf(number) : result;
    }

    private boolean isDividedByOrContains(int i) {
        return dividedBy(i) || contains(i);
    }

    private boolean dividedBy(int i) {
        return number % i == 0;
    }

    private boolean contains(int i) {
        return valueOf(number).contains(valueOf(i));
    }
}
