package application;

import java.util.Locale;
import java.util.Scanner;

import util.Funcionario;

public class Program {

	public static void main(String[] args) {
		/*Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
		mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
		efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
		vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
		vendedor*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salário fixo mensal de um funcionário: ");
		Funcionario.salarioFixoMensal = sc.nextDouble();
		
		System.out.print("Digite a comissão fixa cada carro vendido: ");
		Funcionario.comissaoCadaCarro = sc.nextDouble();
		
		System.out.print("Digite o valor total da venda desse funcionário: ");
		Funcionario.valorTotalCarroFuncionario = sc.nextDouble();	
		
		System.out.print("Digite a quantidade de carro que o funcionário vendeu no mês passado: ");
		Funcionario.quantidadeCarroVendido = sc.nextDouble();
		
		
		System.out.println("-------FIM DO PROGRAMA--------");
		System.out.printf("O valor total que o funcionario vai recebe por cada carro vendido é: R$ %.2f%n",Funcionario.comissaoRecebe());
		System.out.printf("O sálario final que ele vai recebe: R$ %.2f%n", Funcionario.salarioFinal());
		
		
		sc.close();

	}

}
