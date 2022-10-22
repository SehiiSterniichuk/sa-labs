package goal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Goals {

    public static double sum(List<Goal> list) {
        return list.stream().mapToDouble((x) -> x.value).sum();
    }

    public static void weighList(List<Goal> list) {
        final var sum = sum(list);
        list.forEach(x -> x.value = x.value / sum);
    }

    public static void sortList(List<Goal> list) {
        list.sort(Comparator.comparingDouble(x -> x.value));
        Collections.reverse(list);
    }

    public static List<Goal> makeListOfGoalsWithValues(double... arr) {
        List<Goal> goals = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            goals.add(new Goal((i + 1), arr[i]));
        }
        return goals;
    }

    public static void printList(List<Goal> list) {
        System.out.println("[");
        list.forEach(x -> System.out.printf("%s,\n", x));
        System.out.println("]");
    }

    public static void printListInLine(List<Goal> list) {
        System.out.println(listToString(list));
    }

    public static String listToString(List<Goal> list) {
        var it = list.iterator();
        var sb = new StringBuilder();
        sb.append('[');
        for (; ; ) {
            var e = it.next();
            sb.append(e.getName());
            if (!it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }
}
