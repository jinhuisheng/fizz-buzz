package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/10/8.
 */
public class FizzBuzzTest {
    @Test
    void should_return_itself_given_common_number() {
        assertThat(FizzBuzz.of(1)).isEqualTo("1");
        assertThat(FizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    void should_return_Fizz_given_number_divided_by_3() {
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(6)).isEqualTo("Fizz");
    }

    @Test
    void should_return_Fizz_given_number_contains_3() {
        assertThat(FizzBuzz.of(13)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(23)).isEqualTo("Fizz");
    }

    @Test
    void should_return_Buzz_given_number_divided_by_5() {
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(10)).isEqualTo("Buzz");
    }

    @Test
    void should_return_Buzz_given_number_contains_5() {
        assertThat(FizzBuzz.of(52)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(58)).isEqualTo("Buzz");
    }

    @Test
    void should_return_FizzBuzz_given_number_divided_by_3_and_divided_by_5() {
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.of(51)).isEqualTo("FizzBuzz");
    }
}
