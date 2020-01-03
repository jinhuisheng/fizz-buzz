/**
 * @author huisheng.jin
 * @date 2020/1/3.
 */
public class FizzBuzz {

    private int number;

    private FizzBuzz(int number) {
        this.number = number;
    }

    public static String of(int number) {
        return new FizzBuzz(number).convert();
    }

    private String convert() {
        if (isDividedBy(3) && isDividedBy(5)) {
            return "FizzBuzz";
        }
        if (isDividedBy(3)) {
            return "Fizz";
        }
        if (isDividedBy(5)) {
            return "Buzz";
        }
        return String.valueOf(this.number);
    }

    private boolean isDividedBy(int i) {
        return this.number % i == 0;
    }
}
