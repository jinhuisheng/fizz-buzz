import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    void should_return_itself() {
        assertResult(1, "1");
    }

    @Test
    void should_return_Fizz_given_number_divided_by_3() {
        assertResult(3, "Fizz");
        assertResult(6, "Fizz");
    }

    @Test
    void should_return_Fizz_given_number_contains_3() {
        assertResult(13, "Fizz");
        assertResult(31, "Fizz");
    }

    @Test
    void should_return_Buzz_given_number_divided_by_5() {
        assertResult(5, "Buzz");
        assertResult(10, "Buzz");
    }

    @Test
    void should_return_Buzz_given_number_contains_5() {
        assertResult(52, "Buzz");
    }

    @Test
    void should_return_FizzBuzz() {
        assertResult(15, "FizzBuzz");
        assertResult(45, "FizzBuzz");
        assertResult(35, "FizzBuzz");
        assertResult(305, "FizzBuzz");
        assertResult(51, "FizzBuzz");
    }

    private void assertResult(int number, String expected) {
        assertThat(FizzBuzz.of(number)).isEqualTo(expected);
    }

}
