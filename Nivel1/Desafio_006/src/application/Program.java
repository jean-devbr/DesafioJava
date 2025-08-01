package application;

import java.util.Locale;
import java.util.Scanner;

import util.Produto;

public class Program {

	public static void main(String[] args) {
		// Controlador de estoque
		// Manipula nome, preço e quantidade, e calcula valor total.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Insera o nome do produto: ");
		String nomeProduto = sc.nextLine();
		
		System.out.print("Preço de uma unidade: ");
		double precoUnitario = sc.nextDouble();
		
		
		System.out.print("Quantidade de produto tem: ");
		int quantidadeProduto = sc.nextInt();
		
		Produto produto = new Produto(nomeProduto, precoUnitario, quantidadeProduto);
		
		produto.calcular();
		System.out.printf("Total: R$ %.2f%n ", produto.precoTotal);
		
		sc.close();

	}

}
