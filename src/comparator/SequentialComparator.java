package comparator;

import goal.Goal;

import java.util.List;

import static comparator.Printer.printResultOfComparison;
import static goal.Goals.*;

public class SequentialComparator {

    public static void compare(List<Goal> list, int estimationIncreaseStep) {
        System.out.println("Sequential comparison: ");
        sortList(list);
        System.out.print("Preliminary estimation: ");
        printList(list);
        algorithm(list, estimationIncreaseStep);
        printResultOfComparison(list);
        System.out.println("Sequential comparison analysis has finished work");
    }

    public static void algorithm(List<Goal> list, int estimationIncreaseStep){
        var v = new Goal[list.size()];
        list.toArray(v);
        algorithm(v, estimationIncreaseStep);
    }

    public static void algorithm(Goal[] v, int estimationIncreaseStep){
        int i, j, c;
        var size = v.length;
        for (i = size - 3; i >= 0; i--) {
            for (j = i + 1; j < size; j++) {
                for (c = j + 1; c < size; c++) {
                    if (compare(v[i], v[j], v[c]) && (i < j) && (j < c)) {
                        v[i].value = v[j].value + v[c].value + estimationIncreaseStep;
                    }
                }
            }
        }
    }

    public static boolean compare(Goal comparable, Goal first, Goal second) {
        return comparable.value <= first.value + second.value;
    }
}
