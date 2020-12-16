import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameNumberTest {

    @Test
    void should_toString_itself() {
        GameNumber gameNumber = new GameNumber(2);
        assertThat(gameNumber.toString()).isEqualTo("2");
    }

    @Test
    void should_toString_Fizz_given_number_divided_by_3() {
        assertThat(new GameNumber(3).toString()).isEqualTo("Fizz");
        assertThat(new GameNumber(6).toString()).isEqualTo("Fizz");
        assertThat(new GameNumber(18).toString()).isEqualTo("Fizz");
    }

    @Test
    void should_toString_Buzz_given_number_divided_by_5() {
        assertThat(new GameNumber(5).toString()).isEqualTo("Buzz");
        assertThat(new GameNumber(10).toString()).isEqualTo("Buzz");
    }

    @Test
    void should_toString_Buzz_given_number_divided_by_3_and_5() {
        assertThat(new GameNumber(15).toString()).isEqualTo("FizzBuzz");
        assertThat(new GameNumber(45).toString()).isEqualTo("FizzBuzz");
    }


}