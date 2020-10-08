package fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/10/8.
 */
public class GameTest {
    @Test
    void should_create_game_object() {
        Game game = new Game(100);
        assertThat(game.getSize()).isEqualTo(100);

        List<String> result = game.words();
        assertThat(result.get(0)).isEqualTo("1");
        assertThat(result.get(2)).isEqualTo("Fizz");
        assertThat(result.get(4)).isEqualTo("Buzz");
        assertThat(result.get(14)).isEqualTo("FizzBuzz");
    }
}
