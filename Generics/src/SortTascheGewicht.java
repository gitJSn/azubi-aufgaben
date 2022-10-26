import java.util.Comparator;

public class SortTascheGewicht implements Comparator<Bag<?, ? extends Number>> {
    @Override
    public int compare(Bag o1, Bag o2) {
        return Double.compare(o1.getWeight().doubleValue(), o2.getWeight().doubleValue());
    }
}
