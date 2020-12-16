public class GameNumber {
    private Integer number;

    public GameNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return number.toString();
    }
}
