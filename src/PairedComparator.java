import goal.Goal;
import matrix.Matrix;

import java.util.ArrayList;
import java.util.List;
import static goal.Goals.*;

public class PairedComparator {

    public static List<Goal> compare(Matrix matrix) {
        System.out.println("Paired comparison: ");
        var list = calculatePrice(matrix);
        System.out.println("Prices of goals: ");
        printList(list);
        weighList(list);
        System.out.println("Weights of goals: ");
        printList(list);
        sortList(list);
        System.out.print("Result: ");
        printListInLine(list);
        System.out.println("Paired comparison analysis has finished work");
        return list;
    }

    public static List<Goal> calculatePrice(Matrix matrix) {
        final var array2D = matrix.array2D();
        final var dimension = array2D.length;
        final List<Goal> list = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            int rowSum = 0;
            for (int j = 0; j < dimension; j++) {
                if (j != i) {
                    rowSum += array2D[i][j];
                }
            }
            list.add(new Goal("C", (i + 1), rowSum));
        }
        return list;
    }
}
