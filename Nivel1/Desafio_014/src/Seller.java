import java.util.Scanner;

public class Seller extends Generator {
    private Integer amount;

    public Seller(String name, String email, String password, boolean adm, Integer amount) {
        super(name, email, password, adm);
        this.amount = amount;
    }

    // construtor padrão para facilitar instanciação sem repetir dados
    public Seller() {
        super();
        this.amount = 0;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    // Realizar uma venda: usa o produto herdado para ler os dados e incrementa o contador
    public void makeSale(Scanner sc) {
        // reutiliza o método de Product para preencher nome e preço
        product.sale(sc);
        // incrementa o número de vendas
        if (this.amount == null) this.amount = 0;
        this.amount += 1;
        System.out.println("Sale recorded: " + product.getName() + " - R$ " + product.getPrice());
    }

    // Consultar número de vendas
    public void consultSales() {
        System.out.println("Total sales count: " + (this.amount == null ? 0 : this.amount));
    }

    // exemplo de método que poderia incrementar por um valor específico (não usado atualmente)
    public void sales(double soloSales) {
        // este método não altera o estado do objeto; removido uso direto
        System.out.println("Single sale value: " + soloSales);
    }

    public void amountSales() {
        // método placeholder — a lógica principal está em makeSale/consultSales
    }

}
