public class GameNumber {
    private Integer number;

    public GameNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if (dividedBy(3) && dividedBy(5)) {
            return "FizzBuzz";
        }
        if (dividedBy(3)) {
            return "Fizz";
        }
        if (dividedBy(5)) {
            return "Buzz";
        }
        return number.toString();
    }

    private boolean dividedBy(int divideNumber) {
        return number % divideNumber == 0;
    }
}
