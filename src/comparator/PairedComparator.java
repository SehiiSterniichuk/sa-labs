package comparator;

import goal.Goal;
import matrix.Matrix;

import java.util.ArrayList;
import java.util.List;

import static comparator.Printer.printResultOfComparison;

public class PairedComparator {

    public static List<Goal> compare(Matrix matrix) {
        System.out.println("Paired comparison: ");
        var list = calculatePrice(matrix);
        printResultOfComparison(list);
        System.out.println("Paired comparison analysis has finished work");
        return list;
    }

    public static List<Goal> calculatePrice(Matrix matrix) {
        return calculatePrice(matrix.array2D());
    }

    public static List<Goal> calculatePrice(Integer[][] array2D) {
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
