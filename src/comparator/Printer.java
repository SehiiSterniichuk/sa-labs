package comparator;

import goal.Goal;

import java.util.List;

import static goal.Goals.*;
import static goal.Goals.printListInLine;

public class Printer {
    public static void printResultOfComparison(List<Goal> list) {
        Goal.letter = "Z";
        System.out.print("Calculated estimations of goals: ");
        printList(list);
        Goal.letter = "V";
        weighList(list);
        System.out.print("Weights of goals: ");
        printList(list);
        sortList(list);
        System.out.printf("Sum of weights: %,.1f\n", sum(list));
        Goal.letter = "Z";
        System.out.print("Result: ");
        printListInLine(list);
    }
}
