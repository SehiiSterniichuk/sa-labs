import comparator.SequentialComparator;
import goal.Goal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var list1 = List.of(
        new Goal(2, 100),
        new Goal(3, 70),
        new Goal(4, 50),
        new Goal(5, 25),
        new Goal(1, 10));
        var step = 15;
        List<Goal> list = new ArrayList<>(list1);
        SequentialComparator.compare(list, step);
    }
}