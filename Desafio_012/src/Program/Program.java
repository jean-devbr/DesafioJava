
package Program;

import entities.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	//SISTEMA DE BIBLIOTECA
    static Scanner sc = new Scanner(System.in);
    static List<Livro> livros = new ArrayList<>();

    public static void main(String[] args) {
    	mensagemEntrada();
        inserirVariosLivros();
        removerLivro();
        historicoLivro();
    }
    
    private static void mensagemEntrada() {
    	System.out.println("Bem vindo na biblioteca Virtual");
    	System.out.println("O que você deseja fazer?\n1 - Incluir livro \n2 - Excluir livro \n3 - Pesquisa livro \n4 - Editar livro \n5 - Histórico \n6 - Encerrar");
    	System.out.print("Digite a número correto: ");
    	int guiaNumerico = sc.nextInt();
    	if (guiaNumerico == 1) {
    		inserirVariosLivros();
    	}
    	else if (guiaNumerico == 2) {
    		removerLivro();
    	}
    	else if (guiaNumerico == 5) {
    		historicoLivro();
    	}
    }
    
    private static void inserirVariosLivros() {
        System.out.print("Quantos livro você deseja adicinar: ");
        int quantidadeAddLivro = sc.nextInt();
        
        for(int i=0; i < quantidadeAddLivro; i++) {
            livros.add(inserirLivro(i));
        }
        
        System.out.println();
        System.out.println("Livro(s) adicionado(s)");
        System.out.println();
        mensagemEntrada();
    }
    
    private static void removerLivro() {
        System.out.println();
        sc.nextLine();
        System.out.println("Histórico de livro:");
        
        
        for(int i=0; i<livros.size(); i++) {
        	 Livro historico = livros.get(i);
        	 System.out.println(i + 1 +"° " + " - Título: " + historico.getTitulo() + " - Autor: " + 
        			 			historico.getAutor() + " -  " + historico.getNumeroPagina() + " Número de paginas");
        }
        boolean removido = false;
        System.out.print("Digite nome do titulo: ");
        String titulo = sc.nextLine();
        for(int i=0; i<livros.size(); i++) {
        	if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
        		livros.remove(i);
        		removido = true;
        		break;
        	}
        }
        
        if (removido == true) {
        	System.out.println("Livro removido");
        }
        
        while (removido == false) {
        	System.out.println();
        	System.out.println("Livro não Encontrado");
        	System.out.print("Digite nome do titulo: ");
            titulo = sc.nextLine();
            for(int i=0; i<livros.size(); i++) {
            	if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
            		livros.remove(i);
            		removido = true;
            		break;
            	}
            }
        	
        }
        System.out.println();
        mensagemEntrada();
        sc.close();
    }
    
    private static Livro inserirLivro(int i) {
    	 	System.out.println();
    	    System.out.printf("#%d\n", i + 1);
    	    System.out.println();

    	    sc.nextLine(); 

    	    System.out.print("Digite o nome do título: ");
    	    String titulo = sc.nextLine();

    	    System.out.print("Digite o nome do autor: ");
    	    String autor = sc.nextLine();

    	    System.out.print("Digite quantas páginas tem o livro: ");
    	    int numeroPagina = sc.nextInt();

    	    sc.nextLine(); 

    	    return new Livro(titulo, autor, numeroPagina);
    }
    private static void historicoLivro() {
    	System.out.println();
    	for(int i=0; i<livros.size(); i++) {
       	 Livro historico = livros.get(i);
       	 System.out.println(i + 1 +"° " + " - Título: " + historico.getTitulo() + " - Autor: " + 
       			 			historico.getAutor() + " -  " + historico.getNumeroPagina() + " Número de paginas");
       }
    	System.out.println();
    	mensagemEntrada();
    	
    }
}
