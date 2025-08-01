package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conta;

public class Program {

	public static void main(String[] args) {
		//Permite depositar, sacar e consultar saldo
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Insire o nome do títula: ");
		String nomeTitular = sc.nextLine();
		
		System.out.print("Seu saldo atual é: ");
		double saldoInicial = sc.nextDouble();
		
		Conta conta = new Conta(nomeTitular, saldoInicial);
		
		System.out.printf("Seu saldo atual é: R$ %.2f%n", conta.getSaldo());
		
		System.out.print("Deposito: R$ ");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);
		
		System.out.printf("Seu saldo atual é: R$ %.2f%n", conta.getSaldo());
		
		
		System.out.print("Saque: R$ ");
		double sacar = sc.nextDouble();
		
		
		while (sacar > conta.getSaldo()) {
			System.out.printf("Tentativa de saque de R$ %.2f falhou %n", sacar);
			System.out.print("Saque: R$ ");
			sacar = sc.nextDouble();
			
		}
		conta.saque(sacar);
		System.out.printf("Seu saldo atual após o saque: R$ %.2f%n", conta.getSaldo());
		
		System.out.println("-----------FIM DO PROGRAMA------------");
		System.out.println(conta);
		sc.close();
		
		
	}

}
