import java.util.Scanner;

public class Manager extends Generator {

    public Manager(String name, String email, String password, boolean adm) {
        super(name, email, password, adm);
    }

    public Manager() {
        super();
        setAdm(true);
    }

    // Gerar relatório financeiro (exemplo simples)
    public void generateFinancialReport() {
        System.out.println("--- Financial report ---");
        // neste exercício não há dados persistentes, então apenas um placeholder
        System.out.println("No persistent financial data available in this demo.");
    }

    // Consultar vendas — poderia agregar de várias fontes; aqui apenas placeholder
    public void consultSales() {
        System.out.println("Manager consulting sales: (no persisted sales in demo)");
    }

    // Manager pode também reutilizar changesLogin / changePassword / logoff herdados
}

