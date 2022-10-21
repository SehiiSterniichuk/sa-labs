import java.text.DecimalFormat;

public class Goal {
    private static final DecimalFormat formatter = new DecimalFormat("#.##");

    public String letter;
    public final int id;
    public float value;

    public Goal(String letter, int id, float value) {
        this.letter = letter;
        this.id = id;
        this.value = value;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return letter + " " + id + " = " + formatter.format(value);
    }
}
