package goal;

import java.text.DecimalFormat;

public class Goal {
    private static final DecimalFormat formatter = new DecimalFormat("#.##");

    public String letter;
    public final int id;
    public double value;

    public Goal(String letter, int id, double value) {
        this.letter = letter;
        this.id = id;
        this.value = value;
    }

    public String getName(){
        return letter + id;
    }

    @Override
    public String toString() {
        return letter + id + " = " + formatter.format(value);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Goal goal)) {
            return false;
        }
        return goal.id == this.id && goal.value == this.value;
    }
}
