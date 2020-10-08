package fizzbuzz;

import org.junit.jupiter.api.Test;

/**
 * @author huisheng.jin
 * @date 2020/10/8.
 */
public class AcceptanceTest {
    @Test
    void fizz_buzz_program() {
        Game game = new Game(100);
        game.words().forEach(System.out::println);
    }
}
