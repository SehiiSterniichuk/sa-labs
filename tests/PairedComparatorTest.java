import comparator.PairedComparator;
import goal.Goal;
import static goal.Goals.*;
import matrix.Matrix;
import matrix.MatrixFabric;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PairedComparatorTest {
    private static final Matrix matrix = MatrixFabric.makeMyVariantMatrix();

    @Test
    void compare() {
        var actual = PairedComparator.compare(matrix);
        Goal g1,g2,g3,g4,g5;
        g1 = new Goal(1, 0.1);
        g2 = new Goal(2, 0.3);
        g3 = new Goal(3, 0.4);
        g4 = new Goal(4, 0.2);
        g5 = new Goal(5, 0);
        var expected = List.of(g3,g2,g4,g1,g5);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void calculatePrice() {
        var actual = PairedComparator.calculatePrice(matrix);
        System.out.println(matrix);
        Goal g1,g2,g3,g4,g5;
        g1 = new Goal(1, 1);
        g2 = new Goal(2, 3);
        g3 = new Goal(3, 4);
        g4 = new Goal(4, 2);
        g5 = new Goal(5, 0);
        var expected = List.of(g1,g2,g3,g4,g5);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void calculateWeight() {
        var actual = PairedComparator.calculatePrice(matrix);
        weighList(actual);
        Goal g1,g2,g3,g4,g5;
        g1 = new Goal(1, 0.1);
        g2 = new Goal(2, 0.3);
        g3 = new Goal(3, 0.4);
        g4 = new Goal(4, 0.2);
        g5 = new Goal(5, 0);
        var expected = List.of(g1,g2,g3,g4,g5);
        Assertions.assertIterableEquals(expected, actual);
    }

}