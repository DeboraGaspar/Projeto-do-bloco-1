package org.generation.brazil;

import java.util.Scanner;

public class TelaInicial {

	private static Cadastro cadastro = new Cadastro();
	
	private Menu menu = new Menu();
	
	public static Scanner entrada = new Scanner(System.in);

	public void SaudarUsuario() throws InterruptedException {
		
		System.out.println("Olá! Seja bem-vinde a  Java's Pizzaria!");
		Thread.sleep(2000);
		System.out.println("Nesse aplicativo, você seleciona as opções selecionando os números"
				+ " correspondentes a ela");
		Thread.sleep(2500);
		
		EscolherOpcoesMenu();

	}
	
	public void EscolherOpcoesMenu() throws InterruptedException {
		
		System.out.println("Para iniciar, fale para nós: ");
		Thread.sleep(1000);
		System.out.println("1. Já sou cliente");
		System.out.println("2. Quero me cadastrar");
		System.out.println("3. Sair");
		Thread.sleep(1000);
		System.out.print("Digite sua escolha: ");
		
		int escolha = (entrada.nextInt());
		
		if(escolha == 1) {
			logarUsuario();
		} 
		else if(escolha == 2) {
			cadastro.cadastreUsuario();
			logarUsuario();
		}
		else if (escolha == 3){

			System.out.println("VocÃª saiu do programa");
			
		} else {
			System.out.println("Opção inválida!");
		}

	}

	public void logarUsuario() throws InterruptedException{
		
		String nomeDigitado;
		
		do {
			System.out.println("Faça seu login");
			Thread.sleep(1300);
			System.out.print("Digite seu nome de usuário: ");	
			
		if(cadastro.getUsuario().equals(nomeDigitado = entrada.next())) {
	
			colocarSenha();

		}else {
			System.out.println("Login não encontrado!");
			Thread.sleep(1500);
		}
		
		}while(!cadastro.getUsuario().equals(nomeDigitado));
		
	}
	
	public void colocarSenha() throws InterruptedException{
		
		String senhaDigitada;
		
		do {
			System.out.print("Digite sua senha: ");
			
			if(cadastro.getSenha().equals(senhaDigitada = entrada.next())) {
				
				menu.Cardapio();

			}else {
				System.out.println("Senha incorreta!");
				Thread.sleep(1500);
			}
		}while(!cadastro.getSenha().equals(senhaDigitada));
		
	}
	
	
	
}