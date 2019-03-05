import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.lang.String;
import java.util.Comparator;

public class MaxLength1 {
    public static void main (String[] args) {


        ArrayList<String> testwords = new ArrayList<>();

        testwords.add("Kurlikmurlik2222111");
        testwords.add("Azazazazazazazazaz");
        testwords.add("RogaIcopita");
        testwords.add("Yazhelayu schastiya vam");

        String max = Collections.max(testwords, Comparator.comparing(String::length));
        System.out.println("Max length " + max);
    }
}
