import static java.lang.String.*;

public class GameNumber {
    private Integer number;

    public GameNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if (isRelatedTo(3) && isRelatedTo(5)) {
            return "FizzBuzz";
        }
        if (isRelatedTo(3)) {
            return "Fizz";
        }
        if (isRelatedTo(5)) {
            return "Buzz";
        }
        return number.toString();
    }

    private boolean isRelatedTo(int number) {
        return dividedBy(number) || contains(number);
    }

    private boolean contains(int number) {
        return valueOf(this.number).contains(valueOf(number));
    }

    private boolean dividedBy(int number) {
        return this.number % number == 0;
    }
}
