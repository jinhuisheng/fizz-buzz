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
        if (isDividedOrContains(3) && isDividedOrContains(5)) {
            return "FizzBuzz";
        }
        if (isDividedOrContains(3)) {
            return "Fizz";
        }
        if (isDividedOrContains(5)) {
            return "Buzz";
        }
        return String.valueOf(this.number);
    }

    private boolean isDividedOrContains(int i) {
        return isDividedBy(i) || contains(i);
    }

    private boolean contains(int i) {
        return String.valueOf(this.number).contains(String.valueOf(i));
    }

    private boolean isDividedBy(int i) {
        return this.number % i == 0;
    }
}
