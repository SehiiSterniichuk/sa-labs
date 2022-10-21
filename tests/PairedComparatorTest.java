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
        g1 = new Goal("Z", 1, 0.1);
        g2 = new Goal("Z", 2, 0.3);
        g3 = new Goal("Z", 3, 0.4);
        g4 = new Goal("Z", 4, 0.2);
        g5 = new Goal("Z", 5, 0);
        var expected = List.of(g3,g2,g4,g1,g5);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void calculatePrice() {
        var actual = PairedComparator.calculatePrice(matrix);
        System.out.println(matrix);
        Goal g1,g2,g3,g4,g5;
        g1 = new Goal("C", 1, 1);
        g2 = new Goal("C", 2, 3);
        g3 = new Goal("C", 3, 4);
        g4 = new Goal("C", 4, 2);
        g5 = new Goal("C", 5, 0);
        var expected = List.of(g1,g2,g3,g4,g5);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void calculateWeight() {
        var actual = PairedComparator.calculatePrice(matrix);
        weighList(actual);
        Goal g1,g2,g3,g4,g5;
        g1 = new Goal("V", 1, 0.1);
        g2 = new Goal("V", 2, 0.3);
        g3 = new Goal("V", 3, 0.4);
        g4 = new Goal("V", 4, 0.2);
        g5 = new Goal("V", 5, 0);
        var expected = List.of(g1,g2,g3,g4,g5);
        Assertions.assertIterableEquals(expected, actual);
    }

}