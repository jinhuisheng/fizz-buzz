package fizzbuzz;

/**
 * @author huisheng.jin
 * @date 2020/10/8.
 */
public class FizzBuzz {
    private static final int FIZZ_TAG = 3;
    private static final int BUZZ_TAG = 5;
    private int number;

    private FizzBuzz(int number) {
        this.number = number;
    }

    public static String of(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        return fizzBuzz.value();
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
        return String.valueOf(number);
    }

    private boolean isRelatedTo(int i) {
        return isDividedBy(i) || contains(i);
    }

    private boolean contains(int number) {
        return String.valueOf(this.number).contains(String.valueOf(number));
    }

    private boolean isDividedBy(int number) {
        return this.number % number == 0;
    }
}
