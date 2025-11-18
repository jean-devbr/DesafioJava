package entities;

public class Funcionario {
	public double salarioMensal;
	public double porcetagem;
	
	public void reajuste(double porcetagem) {
		salarioMensal += salarioMensal * (porcetagem / 100);
	}

}
