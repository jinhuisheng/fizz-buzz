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

    private boolean isRelatedTo(int i) {
        return dividedBy(i) || contains(i);
    }

    private boolean contains(int i) {
        return valueOf(number).contains(valueOf(i));
    }

    private boolean dividedBy(int divideNumber) {
        return number % divideNumber == 0;
    }
}
