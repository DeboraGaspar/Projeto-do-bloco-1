package org.generation.brazil;

import java.util.Scanner;

public class Cadastro {
		
		Scanner leitor = new Scanner(System.in);
		
		private String nome;
		private String telefone;
		private String endereco;
		private String usuario;
		private String senha;	
		
		public void cadastreUsuario() {
			System.out.println("Tela de cadastro");
			System.out.println("Digite seu nome:");
			setNome(leitor.next());
			System.out.println("Digite seu telefone:");
			setTelefone(leitor.next());
			System.out.println("Digite seu endere�o:");
			setEndereco(leitor.next());
			System.out.println("Digite seu nome de usuario:");
			setUsuario(leitor.next());
			System.out.println("Digite sua senha:");
			setSenha(leitor.next());
		}
		
		
		public Scanner getLeitor() {
			return leitor;
		}

		public void setLeitor(Scanner leitor) {
			this.leitor = leitor;
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
