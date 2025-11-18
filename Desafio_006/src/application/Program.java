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
		
		
		System.out.print("Insira o nome do produto: ");
		String nomeProduto = sc.nextLine();
		
		System.out.print("Preço de uma unidade: ");
		double precoUnitario = sc.nextDouble();
		
		
		System.out.print("Estoque: ");
		int quantidadeProduto = sc.nextInt();
		
		Produto produto = new Produto(nomeProduto, precoUnitario, quantidadeProduto);
		
		System.out.print("Insira a quantos produtos você deseja adicionar: ");
		int adicionarProduto = sc.nextInt();
		produto.adicionar(adicionarProduto);
		System.out.printf("Total no estoque: %d%n", produto.getQuantidadeProduto());
		
		
		System.out.print("Insira a quantos produtos você deseja remover: ");
		int removerProduto = sc.nextInt();
		produto.remove(removerProduto);
		System.out.printf("Total no estoque: %d%n", produto.getQuantidadeProduto());
		
		double total = produto.calcular();
		System.out.printf("Valor total no estoque: R$ %.2f%n ", total);
		
		sc.close();

	}

}
