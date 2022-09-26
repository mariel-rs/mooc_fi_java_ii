import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }

        double maxValue = 0.0;

        for (Double cap : history) {
            if (cap > maxValue) {
                maxValue = cap;
            }
        }

        return maxValue;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }

        double minValue = this.history.get(0);

        for (Double cap : history) {
            if (cap < minValue) {
                minValue = cap;
            }
        }

        return minValue;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;

        for (Double cap : history) {
            sum += cap;
        }

        return sum / this.history.size();
    }
}
