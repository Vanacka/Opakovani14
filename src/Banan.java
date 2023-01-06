import java.io.Serializable;
import java.util.Random;

public class Banan extends Ovoce {
    double zakroucenost;

    public Banan (String jmeno, double zakroucenost) {
        super(jmeno);
        this.zakroucenost = zakroucenost;
    }

    @Override
    public String toString() {
        return "\nBanan{" +
                "zakroucenost=" + zakroucenost +
                ", jmeno='" + jmeno + '\'' +
                '}';
    }
}
