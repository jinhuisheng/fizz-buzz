package fizzbuzz;

import static java.lang.String.*;

public class FizzBuzz {

    public static final int BUZZ_NUMBER = 5;
    public static final int FIZZ_NUMBER = 3;
    private final int rawNumber;

    public FizzBuzz(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    public static String of(int number) {
        return new FizzBuzz(number).parse();
    }

    private String parse() {
        String result = "";
        if (isRelatedTo(FIZZ_NUMBER)) {
            result += "Fizz";
        }
        if (isRelatedTo(BUZZ_NUMBER)) {
            result += "Buzz";
        }
        return result.isEmpty() ? valueOf(rawNumber) : result;
    }

    private boolean isRelatedTo(int number) {
        return dividedBy(number) || contains(number);
    }

    private boolean contains(int number) {
        return valueOf(rawNumber).contains(valueOf(number));
    }

    private boolean dividedBy(int number) {
        return rawNumber % number == 0;
    }
}
