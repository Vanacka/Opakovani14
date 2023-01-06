import java.io.Serializable;
import java.util.Random;

public class Jahoda extends Ovoce {
    int pocetJadyrek;

    public Jahoda (String jmeno, int pocetJadyrek) {
        super(jmeno);
        this.pocetJadyrek = pocetJadyrek;
    }

    @Override
    public String toString() {
        return "\nJahoda{" +
                "pocetJadyrek=" + pocetJadyrek +
                ", jmeno='" + jmeno + '\'' +
                '}';
    }
}
