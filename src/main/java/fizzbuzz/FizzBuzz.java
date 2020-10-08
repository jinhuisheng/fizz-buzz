package fizzbuzz;

/**
 * @author huisheng.jin
 * @date 2020/10/8.
 */
public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public static String of(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        return fizzBuzz.value();
    }

    private String value() {
        if (dividedBy(3) && dividedBy(5)) {
            return "FizzBuzz";
        }
        if (dividedBy(3)) {
            return "Fizz";
        }
        if (dividedBy(5)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean dividedBy(int dividedNumber) {
        return this.number % dividedNumber == 0;
    }
}
