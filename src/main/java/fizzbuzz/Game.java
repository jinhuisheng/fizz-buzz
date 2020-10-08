package fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author huisheng.jin
 * @date 2020/10/8.
 */
public class Game {
    private int size;
    private List<String> fizzBuzzList;

    public Game(int size) {
        this.size = size;
        this.fizzBuzzList = IntStream.range(1, size + 1).boxed().map(FizzBuzz::of).collect(Collectors.toList());
    }

    public Integer getSize() {
        return size;
    }

    public List<String> words() {
        return fizzBuzzList;
    }
}
