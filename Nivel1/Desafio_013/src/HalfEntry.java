public class HalfEntry extends Ticket {

    private double half;

    public HalfEntry(double value, String name, String description, String information) {
        super(value, name, description, information);
    }

    public HalfEntry() {

    }

    public void halfEntry(){
        half = getValue() / 2;
        setValue(half);
    }
}
