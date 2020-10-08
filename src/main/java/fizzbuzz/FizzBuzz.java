package fizzbuzz;

import static java.lang.String.*;

/**
 * @author huisheng.jin
 * @date 2020/10/8.
 */
public class FizzBuzz {
    private static final int FIZZ_TAG = 3;
    private static final int BUZZ_TAG = 5;
    private final int number;

    private FizzBuzz(int number) {
        this.number = number;
    }

    public static String of(int number) {
        return new FizzBuzz(number).value();
    }

    private String value() {
        if (isRelatedTo(FIZZ_TAG) && isRelatedTo(BUZZ_TAG)) {
            return "FizzBuzz";
        }
        if (isRelatedTo(FIZZ_TAG)) {
            return "Fizz";
        }
        if (isRelatedTo(BUZZ_TAG)) {
            return "Buzz";
        }
        return valueOf(number);
    }

    private boolean isRelatedTo(int number) {
        return dividedBy(number) || contains(number);
    }

    private boolean contains(int containsNumber) {
        return valueOf(this.number).contains(valueOf(containsNumber));
    }

    private boolean dividedBy(int dividedNumber) {
        return this.number % dividedNumber == 0;
    }
}
