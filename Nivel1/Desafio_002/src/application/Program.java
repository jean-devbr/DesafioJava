package application;

import java.util.Locale;

import java.util.Scanner;

import entities.Eleitores;

public class Program {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
		  brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
		  de eleitores.*/
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Eleitores eleitores = new Eleitores();
		
		
		System.out.print("Digite a quantidade de eleitores no municipio: ");
		eleitores.municipio = sc.nextInt();
		System.out.print("Digite a quantidade de votos em brancos: ");
		eleitores.votoBranco = sc.nextInt();
		System.out.print("Digite a quantidade de votos em nulos: ");
		eleitores.votoNulo = sc.nextInt();
		System.out.print("Digite a quantidade de votos válidos: ");
		eleitores.votoValido = sc.nextInt();
		
		
		System.out.println("--------TOTAL-------");
		
		System.out.printf("Porcetagem dos votos em brancos é: %.2f%%%n", eleitores.porcentagemVotoBranco());
		System.out.printf("Porcetagem dos votos em nulos é: %.2f%%%n", eleitores.porcentagemVotoNulo());
		System.out.printf("Porcetagem dos votos válidos é: %.2f%%%n", eleitores.porcentagemVotoValido());
		
		
		sc.close();

	}

}
