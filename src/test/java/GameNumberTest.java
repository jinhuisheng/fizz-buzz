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
        GameNumber gameNumber = new GameNumber(3);
        assertThat(gameNumber.toString()).isEqualTo("Fizz");
    }

}