public class Bag<elementType, weightType extends Number> {
    private elementType element;
    private weightType weight;

    public Bag() {
    }

    public Bag(elementType element, weightType weight) {
        this.element = element;
        this.weight = weight;
    }

    public Bag(elementType element) {
        this.element = element;
    }

    public void put(elementType element) {
        this.element = element;
    }

    public elementType getElement() {
        return this.element;
    }

    public boolean isEmpty() {
        return element == null;
    }

    public weightType getWeight() {
        return this.weight;
    }

    public void setWeight(weightType weight) {
        this.weight = weight;
    }

}
