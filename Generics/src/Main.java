import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bag<String, Integer>> taschen = new ArrayList<>();

        taschen.add(new Bag<>("Fussball", 10));
        taschen.add(new Bag<>("Handy", 5));

        Bag<String, Integer> heaviestBag = Collections.max(taschen, new SortTascheGewicht());

        System.out.println(heaviestBag.getElement());
        // halskdjflkajsdölfkja


        // test
    }
}
