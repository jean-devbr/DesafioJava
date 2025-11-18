package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
		/*	Ler um vetor Q de 20 posições (aceitar somente números positivos). Escrever a seguir o valor do
			maior elemento de Q e a respectiva posição que ele ocupa no vetor. */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Dados [] Q = new Dados[20];
		
		for (int i=0; i<Q.length; i++) {
			System.out.printf("Digite %d° número positivo: ", i + 1);
			double numero = sc.nextDouble();
			while (numero < 0) {
				System.out.println("Erro! Apenas númeoros positivos");
				System.out.print("Digite novamente: ");
				numero = sc.nextDouble();
			}
			
			Q[i] = new Dados(numero);
		}
		
		double maior = Q[0].numero;
		int posicao = 0;
		
		for (int i=0; i<Q.length; i++) {
			if (Q[i].numero > maior ) {
				maior = Q[i].numero;
				posicao = i;
			}
		}
	
		System.out.printf("O maior número é: %.2f.%n", maior);
		System.out.printf("A posição que ele ocupa no vetor é: %d%n", posicao);
		
		
		sc.close();
		
	}

}
