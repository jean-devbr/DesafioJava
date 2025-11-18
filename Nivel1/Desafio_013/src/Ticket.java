public class Ticket {
    private double value;
    private String name;
    private String description;
    private String information;

    public Ticket(double value, String name, String description,String information) {
        this.value = value;
        this.name = name;
        this.information = information;
        this.description = description;
    }

    public Ticket() {

    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
