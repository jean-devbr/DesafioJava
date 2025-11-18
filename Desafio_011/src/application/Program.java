package application;

import java.util.Locale;

import ultil.Funcionario;
import ultil.Gerente;
import ultil.Vendedor;

public class Program {

	public static void main(String[] args) {
		/*	Voce precisa criar um sistema que gerencie funcionarios.
			Havera Funcionario como classe base, e duas subclasses: Gerente e Vendedor.*/ 
		
		Locale.setDefault(Locale.US);
		
		Funcionario[] funcionario = new Funcionario[2];
		
		funcionario[0] = new Gerente("Ana", 5000.00, 150.00);
		funcionario[1] = new Vendedor("Jean", 1500.00, 75.00);
		
		for (Funcionario lista : funcionario) {
			System.out.println("Nome: " + lista.getNome() + " |" + lista.getSalario());
			
			if (lista instanceof Gerente) {
				Gerente gerente = (Gerente) lista;
				System.out.println("Bonus: " + gerente.getBonus());
			}
			else if ( lista instanceof Vendedor) {
				Vendedor vendedor = (Vendedor) lista;
				System.out.println("Comissão: " + vendedor.getComissao());
			}
			System.out.println("-------------------");
		}
		
	}

}
