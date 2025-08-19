/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Program;

import entities.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    static Scanner sc = new Scanner(System.in);
    static List<Livro> livros = new ArrayList<>();

    public static void main(String[] args) {
        inserirVariosLivros();
        removerLivro();
    }
    
    private static void inserirVariosLivros() {
        System.out.print("Quantos livro você deseja adicinar: ");
        int quantidadeAddLivro = sc.nextInt();
        
        for(int i=0; i < quantidadeAddLivro; i++) {
            livros.add(inserirLivro(i));
        }
    }
    
    private static void removerLivro() {
        System.out.println();
        System.out.print("Deseja remover um livro(S/N): ");
        char removerLivro = sc.next().charAt(0);
        
        if( removerLivro == 'S') {
            System.out.println("Qual nome do título: ");
            String titulo = sc.nextLine();
            
  
        }
        
        sc.close();
    }
    
    private static Livro inserirLivro(int i) {
        System.out.println();
        System.out.printf("#%d",i+1);
        System.out.println();
        System.out.print("Digite o nome do título: ");
        String titulo = sc.nextLine();
        sc.next();
        System.out.print("Digite o nome do autor: ");
        String autor = sc.nextLine();
        sc.next();
        System.out.print("Digite quantas páginas tem o livro: ");
        int numeroPagina = sc.nextInt();
        return new Livro(titulo, autor, numeroPagina);
    }
}
