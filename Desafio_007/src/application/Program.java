package application;

import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		/* 	Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armaze os nomes lidos em
			um vetor. Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa e depois
			escrever a mensagem ACHEI, se o nome estiver entre os 10 nomes lidos anteriormente (guardados no
			vetor), ou NÃO ACHEI caso contrário. */
		
		Scanner sc = new Scanner(System.in);
		
		Pessoas[] vect = new Pessoas[10];
		
		for(int i=0; i<10; i++ ) {
			System.out.printf("Digite %s° nome de uma pessoa: ", i + 1);
			String nome = sc.nextLine();
			
			vect[i] = new Pessoas(nome);
		}
		System.out.println();
		System.out.print("Digite um nome: ");
		String nomeEncontra = sc.nextLine();
		
		boolean encontraNome = false;
		
		for (int i=0; i<10; i++) {
			if (vect[i].getNome().equals(nomeEncontra)) {
				
				encontraNome = true;
				break;
			}
		}
		if (encontraNome) {
			System.out.println("ACHEI");
		}
		else {
			System.out.println("NÃO ACHEI");
		}
		
		sc.close();
	}

}
