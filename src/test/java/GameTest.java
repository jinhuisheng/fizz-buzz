import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {
    @Test
    void should_return_expected_size_number_given_size() {
        Game game = new Game(100);
        assertThat(game.size()).isEqualTo(100);
        assertThat(game.numberAt(0).toString()).isEqualTo("1");
        assertThat(game.numberAt(2).toString()).isEqualTo("Fizz");
    }
}
