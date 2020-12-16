import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GameNumberTest {

    @Test
    void should_toString_itself() {
        GameNumber gameNumber = new GameNumber(2);
        assertThat(gameNumber.toString()).isEqualTo("2");
    }

    @Test
    void should_toString_Fizz_given_3() {
        assertThat(new GameNumber(3).toString()).isEqualTo("Fizz");
        assertThat(new GameNumber(6).toString()).isEqualTo("Fizz");
        assertThat(new GameNumber(18).toString()).isEqualTo("Fizz");
    }
}