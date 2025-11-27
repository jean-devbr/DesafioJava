public class Attendant  extends Generator{
    private Double ValueBox;

    public Attendant(String name, String email, String password, boolean adm, Double valueBox) {
        super(name, email, password, adm);
        ValueBox = valueBox;
    }

    public Attendant() {
        super();
        this.ValueBox = 0.0;
    }

    public Double getValueBox() {
        return ValueBox;
    }

    public void setValueBox(Double valueBox) {
        ValueBox = valueBox;
    }

    public void receivePayment(double value){
        if (this.ValueBox == null) this.ValueBox = 0.0;
        this.ValueBox += value;
        System.out.println("Payment received: R$ " + value + ", new box total: R$ " + this.ValueBox);
    }

    public void closeBox(){
        System.out.println("Closing box. Total: R$ " + (this.ValueBox == null ? 0.0 : this.ValueBox));
        // opcional: zerar o caixa
        this.ValueBox = 0.0;
    }
}
