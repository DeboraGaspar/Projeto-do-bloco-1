package org.generation.brazil;

import java.util.Scanner;

public class Cadastro {
		
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		String telefone;
		String endere�o;
		String usuario;
		String senha;
	
	void cadastreUsuario() {
		
		System.out.println("Digite seu nome completo:");
		nome = leitor.next();
		System.out.println("Digite seu telefone:");
		telefone = leitor.next();
		System.out.println("Digite seu endere�o:");
		endere�o = leitor.next();
		System.out.println("Escolha um nome de usu�rio: ");
		usuario = leitor.next();
		System.out.println("Crie uma senha:");
		senha = leitor.next();
		System.out.println("Usu�rio cadastrado.");
	}
		
}
