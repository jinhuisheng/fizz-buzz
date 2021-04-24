import static java.lang.String.*;

public class FizzBuzz {
    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public static String of(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        return fizzBuzz.parse();
    }

    private String parse() {
        String result = "";
        if (isDividedOrContains(3)) {
            result += "Fizz";
        }
        if (isDividedOrContains(5)) {
            result += "Buzz";
        }
        return result.isEmpty() ? valueOf(number) : result;
    }

    private boolean isDividedOrContains(int i) {
        return dividedBy(i) || contains(i);
    }

    private boolean dividedBy(int i) {
        return number % i == 0;
    }

    private boolean contains(int i) {
        return valueOf(number).contains(valueOf(i));
    }
}
