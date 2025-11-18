package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Turma;

public class Program {

	public static void main(String[] args) {
		/*	Escreva um algoritmo que permita a leitura das notas de uma turma de 20 alunos. Calcular a média
			da turma e contar quantos alunos obtiveram nota acima desta média calculada. Escrever a média da
			turma e o resultado da contagem.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Turma[] vect = new Turma[20];
		
		double calculo = 0;
		
		for(int i=0; i<vect.length; i++) {
			System.out.printf("%d° aluno teve a nota: ", i + 1);
			 double nota = sc.nextDouble();
			 calculo += nota;
			 
			 vect[i] = new Turma(nota);
			 
		}
		System.out.println();
		System.out.printf("A soma das notas são: %.2f%n", calculo);
		
		
		double media = calculo / vect.length;
		System.out.println();
		System.out.printf("Média da turma é: %.2f%n", media);
		
		int quantidadeAlunoMedia = 0;
		System.out.println();
		
		for(int i=0; i<vect.length; i++) {
			if (media < vect[i].getNota()) {
				System.out.printf("Acima da media da turma o aluno %s° %n", i+1);
				quantidadeAlunoMedia ++;
			}
		}
		System.out.println();
		System.out.printf("Quantidade de alunos com acima da média é: %d", quantidadeAlunoMedia);
	
		
		
				
		
		sc.close();
		
		

	}

}
