package ultil;

public class Vendedor extends Funcionario {
	
	private Double comissao;

	public Vendedor(String nome, Double salario, Double comissao) {
		super(nome, salario);
		this.comissao = comissao;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	
	
}
