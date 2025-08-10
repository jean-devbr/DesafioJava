package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/* 	Crie uma lista de nomes e permita ao usuário adicionar, remover e listar todos os nomes.
		 */ 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		System.out.println("Nomes da lista:");
		list.add("Jean costa");
		list.add("Maria sksk");
		list.add("Joao");
		list.add("Marcelo");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		
		System.out.println();
		System.out.print("Digite o nome que você deseja adicionar na lista: ");
		String adicionarNome = sc.nextLine();
		list.add(4,adicionarNome);
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println();
		System.out.print("Qual nome você deseja remover? ");
		String removerNome = sc.nextLine();
		list.remove(removerNome);
		
		for (String x : list) {
			System.out.println(x);
		}
		
		sc.close();
		
	}

}
