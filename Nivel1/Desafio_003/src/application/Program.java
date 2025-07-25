package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
		  Calcular e escrever o valor do novo salário. */ 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Digite o salário do funcionario mensal: ");
		funcionario.salarioMensal = sc.nextDouble();
		System.out.print("Digite a porcetagem do reajuste do salário: ");
		funcionario.porcetagem = sc.nextDouble();
		
		System.out.println("--------REAJUSTE----------");
		funcionario.reajuste(funcionario.porcetagem);
		System.out.printf("Reajuste do salário é: $ %.2f%n" ,funcionario.salarioMensal);
		
		
		
		sc.close();
	}

}
