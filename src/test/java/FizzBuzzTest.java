import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/1/3.
 */
class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "4,4",
            "3,Fizz",
            "6,Fizz",
            "5,Buzz",
            "10,Buzz",
            "15,FizzBuzz",
    })
    void should_return_expected_when_input_number(Integer number, String expected) {
        assertThat(FizzBuzz.of(number)).isEqualTo(expected);
    }
}
