import static java.lang.String.*;

public class GameNumber {
    private Integer number;

    public GameNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if (dividedBy3And5() || contains3And5()) {
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

    private boolean contains3And5() {
        return contains(3) && contains(5);
    }

    private boolean dividedBy3And5() {
        return dividedBy(3) && dividedBy(5);
    }

    private boolean contains(int i) {
        return valueOf(number).contains(valueOf(i));
    }

    private boolean dividedBy(int divideNumber) {
        return number % divideNumber == 0;
    }
}
