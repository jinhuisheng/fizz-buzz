import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    void should_process_normal() {
        String result = FizzBuzz.of(1);
        assertThat(result).isEqualTo("1");
        assertThat(FizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    void should_return_Fizz_given_number_divided_by_3() {
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(6)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(18)).isEqualTo("Fizz");
    }

    @Test
    void should_return_Fizz_given_number_contains_3() {
        assertThat(FizzBuzz.of(13)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(31)).isEqualTo("Fizz");
    }


    @Test
    void should_return_Buzz_given_number_divided_by_5() {
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(25)).isEqualTo("Buzz");
    }

    @Test
    void should_return_Buzz_given_number_contains_5() {
        assertThat(FizzBuzz.of(52)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(59)).isEqualTo("Buzz");
    }


    @Test
    void should_return_FizzBuzz_given_number_divided_by_3_and_5() {
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.of(45)).isEqualTo("FizzBuzz");
    }

    @Test
    void should_return_FizzBuzz_given_number_contains_3_and_5() {
        assertThat(FizzBuzz.of(53)).isEqualTo("FizzBuzz");
    }

    @Test
    void should_return_FizzBuzz_given_number_contains_5_and_divided_by_3() {
        assertThat(FizzBuzz.of(51)).isEqualTo("FizzBuzz");
    }

    @Test
    void should_return_FizzBuzz_given_number_contains_3_and_divided_by_5() {
        assertThat(FizzBuzz.of(310)).isEqualTo("FizzBuzz");
    }

}
