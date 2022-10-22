import comparator.PairedComparator;
import comparator.SequentialComparator;
import goal.Goal;
import goal.Goals;
import matrix.MatrixFabric;

import java.util.List;

import static goal.Goals.sortList;

public class Main {
    public static void main(String[] args) {
        var matrix = MatrixFabric.makeMyVariantMatrix();
        System.out.printf("My matrix by variant:\n\n%s\n", matrix);
        PairedComparator.compare(matrix);
        System.out.println();

        var step = 5;
        List<Goal> list = Goals.makeListOfGoalsWithValues(10, 100, 70, 50, 25);
        sortList(list);
        SequentialComparator.compare(list, step);
    }
}