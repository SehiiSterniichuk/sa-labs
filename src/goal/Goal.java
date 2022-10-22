package goal;

import java.text.DecimalFormat;

public class Goal {
    private static final DecimalFormat formatter = new DecimalFormat("#.##");

    public static String letter = "Z";
    public final int id;
    public double value;

    public Goal(int id, double value) {
        this.id = id;
        this.value = value;
    }

    public String getName() {
        return letter + id;
    }

    @Override
    public String toString() {
        return letter + id + " = " + formatter.format(value);
    }
}
