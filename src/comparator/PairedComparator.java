package comparator;

import goal.Goal;
import matrix.Matrix;

import java.util.ArrayList;
import java.util.List;

import static comparator.Printer.printResultOfComparison;

public class PairedComparator {

    public static void compare(Matrix matrix) {
        System.out.println("Paired comparison: ");
        var list = calculateEstimation(matrix);
        printResultOfComparison(list);
        System.out.println("Paired comparison analysis has finished work");
    }

    public static List<Goal> calculateEstimation(Matrix matrix) {
        return calculateEstimation(matrix.array2D());
    }

    public static List<Goal> calculateEstimation(Integer[][] array2D) {
        final var dimension = array2D.length;
        final List<Goal> list = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            int rowSum = 0;
            for (int j = 0; j < dimension; j++) {
                if (j != i) {
                    rowSum += array2D[i][j];
                }
            }
            list.add(new Goal((i + 1), rowSum));
        }
        return list;
    }
}
