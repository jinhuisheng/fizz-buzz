public class Console {

    private static final int HUNDRED_NUMBER = 100;

    public static void main(String[] args) {
        for (int i = 1; i <= HUNDRED_NUMBER; i++) {
            System.out.println(FizzBuzz.of(i));
        }
    }

}
