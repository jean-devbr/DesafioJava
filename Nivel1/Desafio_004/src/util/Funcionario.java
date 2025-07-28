package util;

public class Funcionario {
	public static double quantidadeCarroVendido;
	public static double salarioFixoMensal;
	public static double comissaoCadaCarro;
	public static double valorTotalCarroFuncionario;
	
	public static double comissaoRecebe() {
		return quantidadeCarroVendido * comissaoCadaCarro ;
	}
	public static double salarioFinal() {
		return salarioFixoMensal + comissaoRecebe() + (valorTotalCarroFuncionario * 0.05);
	}
}
