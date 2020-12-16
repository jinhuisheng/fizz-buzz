public class GameNumber {
    private Integer number;

    public GameNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if (number == 3) {
            return "Fizz";
        }
        return number.toString();
    }
}
