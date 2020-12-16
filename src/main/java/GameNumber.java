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
        if (dividedBy(3) || contains(3)) {
            return "Fizz";
        }
        if (dividedBy(5) || contains(5)) {
            return "Buzz";
        }
        return number.toString();
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
