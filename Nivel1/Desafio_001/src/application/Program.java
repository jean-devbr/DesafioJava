package application;

import java.util.Locale;
import java.util.Scanner;

import entities.antecessor;

public class Program {

	public static void main(String[] args) {
		/* Escreva um algoritmo para ler um valor (do teclado) 
		  e escrever (na tela) o seu antecessor */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		antecessor NumeroAntecessor = new antecessor();
		System.out.print("Digite um número inteiro: ");
		NumeroAntecessor.numero = sc.nextInt();
		NumeroAntecessor.menor();
		System.out.printf("Seu antecessor é: %d", NumeroAntecessor.resultado);
		
		sc.close();
		
	}

}
