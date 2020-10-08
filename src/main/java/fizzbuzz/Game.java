package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huisheng.jin
 * @date 2020/10/8.
 */
public class Game {
    private int size;
    private List<String> fizzBuzzList = new ArrayList<>();

    public Game(int size) {
        this.size = size;
        for (int i = 1; i <= size; i++) {
            fizzBuzzList.add(FizzBuzz.of(i));
        }
    }

    public Integer getSize() {
        return size;
    }

    public List<String> words() {
        return fizzBuzzList;
    }
}
