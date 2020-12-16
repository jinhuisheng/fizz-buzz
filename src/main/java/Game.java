import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Game {
    private int size;

    private List<Integer> numbers;

    public Game(int size) {

        this.size = size;
        this.numbers = IntStream.range(1, size + 1).boxed().collect(Collectors.toList());
    }

    public Integer size() {
        return size;
    }

    public String get(int index) {
        return null;
    }

    public Object numberAt(int position) {
        return numbers.get(position).toString();
    }
}
