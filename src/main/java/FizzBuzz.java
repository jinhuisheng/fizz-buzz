import static java.lang.String.*;

public class FizzBuzz {
    private static final int FIZZ_NUMBER = 3;
    private static final int BUZZ_NUMBER = 5;
    private int number;

    private FizzBuzz(int number) {
        this.number = number;
    }

    public static String of(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        return fizzBuzz.of();
    }

    private String of() {
        if (isContainsOrDividedBy(FIZZ_NUMBER) && isContainsOrDividedBy(BUZZ_NUMBER)) {
            return "FizzBuzz";
        }
        if (isContainsOrDividedBy(BUZZ_NUMBER)) {
            return "Buzz";
        }
        if (isContainsOrDividedBy(FIZZ_NUMBER)) {
            return "Fizz";
        }
        return valueOf(number);
    }

    private boolean isContainsOrDividedBy(int i) {
        return number % i == 0 || valueOf(number).contains(valueOf(i));
    }
}
