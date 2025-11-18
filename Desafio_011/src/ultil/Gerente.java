package ultil;

public class Gerente  extends Funcionario{
	private Double bonus;

	public Gerente(String nome, Double salario, double bonus) {
		super(nome, salario);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
}
