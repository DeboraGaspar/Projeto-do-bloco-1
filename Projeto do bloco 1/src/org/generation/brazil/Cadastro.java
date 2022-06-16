package org.generation.brazil;

import java.util.Scanner;

public class Cadastro {
		
		public Scanner leitor = new Scanner(System.in);
		
		private static String nome = "Felipe";
		private static String telefone = "123456789";
		private static String endereco = "Rua Generation, 54";
		private static String usuario = "felipe";
		private static String senha = "senha";	
		
		public void cadastreUsuario() throws InterruptedException {
			
			System.out.println(">>>>>> CADASTRO <<<<<<");
			System.out.println("-> Digite seu nome: ");
			nome = leitor.nextLine();
			
			System.out.println("-> Digite seu telefone:");
			telefone = leitor.nextLine();
			
			System.out.println("-> Digite seu endereço:");
			endereco = leitor.nextLine();
			
			System.out.println("-> Digite seu nome de usuario:");
			usuario = leitor.nextLine();
			
			System.out.println("-> Digite sua senha:");
			senha = leitor.nextLine();
			
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		

}
