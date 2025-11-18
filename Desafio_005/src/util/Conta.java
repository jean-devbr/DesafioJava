package util;

public class Conta {
	private String nomeTitular;
	private double saldo;
	
	
	public Conta(String nomeTitular, double saldoInicial) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor;
	}
	
	public double getSaldo() {
        return saldo;
    }
	
	
    public String getNomeTitular() {
        return nomeTitular;
    }
    
   public String toString() {
	   return "Finaliza o progresso. Nome do títular: "
			   + nomeTitular
			   + ". Salto restante: "
			   + String.format("%.2f", saldo);
	   			
   }
}
