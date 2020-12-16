import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Game {
    private int size;

    private List<GameNumber> numbers;

    public Game(int size) {

        this.size = size;
        this.numbers = IntStream.range(1, size + 1).boxed().map(GameNumber::new).collect(Collectors.toList());
    }

    public Integer size() {
        return size;
    }

    public Object numberAt(int position) {
        return "1";
    }
}
