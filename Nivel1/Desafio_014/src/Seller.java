public class Seller extends Generator {
    private Integer amount;

    public Seller(String name, String email, String password, boolean adm, Integer amount) {
        super(name, email, password, adm);
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void sales(double soloSales) {
        soloSales += 10.00;
    }

    public void amountSales() {
        
    }
}
