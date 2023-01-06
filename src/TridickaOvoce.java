import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TridickaOvoce {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Random r = new Random();
        File file = new File("data.dat");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Ovoce> arr = (ArrayList<Ovoce>)ois.readObject();
        Collections.sort(arr);
        System.out.println(arr);


    }
}