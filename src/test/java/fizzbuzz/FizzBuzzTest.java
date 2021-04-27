package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class FizzBuzzTest {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";

    @Test
    void should_return_itself() {
        assertResult(1, "1");
    }

    @Test
    void should_return_Fizz_given_number_is_divided_by_3() {
        assertResult(3, FIZZ);
        assertResult(6, FIZZ);
    }

    @Test
    void should_return_Fizz_given_number_contains_3() {
        assertResult(13, FIZZ);
        assertResult(31, FIZZ);
    }

    @Test
    void should_return_Buzz_given_number_is_divided_by_5() {
        assertResult(5, BUZZ);
    }

    @Test
    void should_return_Buzz_given_number_contains_5() {
        assertResult(52, BUZZ);
    }

    @Test
    void should_return_FizzBuzz() {
        assertResult(15, FIZZ_BUZZ);
        assertResult(35, FIZZ_BUZZ);
        assertResult(305, FIZZ_BUZZ);
        assertResult(51, FIZZ_BUZZ);
    }

    private void assertResult(int number, String expected) {
        assertThat(FizzBuzz.of(number)).isEqualTo(expected);
    }
}
