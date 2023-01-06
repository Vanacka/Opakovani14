import org.apache.commons.lang.RandomStringUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ovoce implements Comparable<Ovoce>, Serializable {
    String jmeno;

    public Ovoce(String jmeno) {
        this.jmeno = jmeno;
    }
    public static String nahodneJmeno () {
        //length is bounded by 7
        /*byte[] array = new byte[7];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));*/

        return RandomStringUtils.randomAlphabetic(10);
    }

    @Override
    public int compareTo(Ovoce o) {
        return jmeno.compareTo(o.jmeno);
    }
    public static void main(String[] args) throws IOException {
        Random r = new Random();
        File file = new File("data.dat");

        ArrayList<Ovoce> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(new Jahoda(nahodneJmeno(), r.nextInt(60)));
            arr.add(new Banan(nahodneJmeno(), r.nextDouble(90)));
        }
        System.out.println(arr);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(arr);
        oos.close();
    }
}
