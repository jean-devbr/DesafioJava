public class Attendant  extends Generator{
    private Double ValueBox;

    public Attendant(String name, String email, String password, boolean adm, Double valueBox) {
        super(name, email, password, adm);
        ValueBox = valueBox;
    }

    public Double getValueBox() {
        return ValueBox;
    }

    public void setValueBox(Double valueBox) {
        ValueBox = valueBox;
    }

    public void receivePayment(){
        ValueBox += 3.00;
    }
}
