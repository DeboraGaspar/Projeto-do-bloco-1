package org.generation.brazil;

import java.util.Scanner;

public class Menu {
	
	public int totalPizza;
	private Scanner sc;
	
	public void Cardapio() throws InterruptedException {
		
		Opcionais opcionais = new Opcionais();
		
		sc = new Scanner(System.in);
		
		int pizza = 0, quant1 = 0, quant2 = 0, quant3 = 0, quant4 = 0, quant5 = 0;
		@SuppressWarnings("unused")
		String continuar;
		
		do {
		System.out.println("=========== CATALOGO ===========");
		System.out.println("Escolha o sabor da sua pizza!");
		
		System.out.println("1. Mussarela		R$36,00");
		System.out.println("2. Calabresa		R$36,00");
		System.out.println("3. Moda da casa		R$36,00");
		System.out.println("4. Frango c/ Catupiry	R$36,00");
		System.out.println("5. Portuguesa		R$36,00");
		
		System.out.println("Digite o n�mero da pizza que voc� quer:");
		
		pizza = sc.nextInt();
		
		switch(pizza) {
		case 1:
			System.out.println("Voc� escolheu a pizza de Mussarela!");
			System.out.println("-> Quantas voc� deseja?");
			Thread.sleep(1000);
			quant1 = sc.nextInt();
			System.out.println("-> Deseja mais alguma pizza? (S ou N)");
			Thread.sleep(1560);
		break;
		case 2:
			System.out.println("Voc� escolheu a pizza de Calabresa!");
			System.out.println("-> Quantas voc� deseja?");
			Thread.sleep(1000);
			quant2 = sc.nextInt();
			System.out.println("-> Deseja mais alguma pizza? (S ou N)");
			Thread.sleep(1560);
		break;
		case 3:
			System.out.println("Voc� escolheu a pizza de Moda da casa!");
			System.out.println("-> Quantas voc� deseja?");
			Thread.sleep(1000);
			quant3 = sc.nextInt();
			System.out.println("-> Deseja mais alguma pizza? (S ou N)");
			Thread.sleep(1560);
		break;
		case 4:
			System.out.println("Voc� escolheu a pizza de Frango c/ Catupiry!");
			System.out.println("-> Quantas voc� deseja?");
			Thread.sleep(1000);
			quant4 = sc.nextInt();
			System.out.println("-> Deseja mais alguma pizza? (S ou N)");
			Thread.sleep(1560);
		break;
		case 5:
			System.out.println("Voc� escolheu a pizza de Portuguesa! \n");
			System.out.println("-> Quantas voc� deseja?");
			Thread.sleep(1000);
			quant5 = sc.nextInt();
			System.out.println("-> Deseja mais alguma pizza? (S ou N)");
			Thread.sleep(1560);
			
		break;
		default:
			System.out.println("Op��o inv�lida!");
			Thread.sleep(800);
			System.out.println("Deseja escolher alguma pizza? (S ou N)");
			Thread.sleep(1060);
		break;
		}

		totalPizza = quant1 + quant2 + quant3 + quant4 + quant5;
		
		}
		while(!sc.next().equals("n".toLowerCase()));
		
		System.out.println("Voc� est� pedindo " + totalPizza + " pizzas");
		Thread.sleep(1500);
		
		totalPizza = (totalPizza * 36);
		
		opcionais.EscolherOpcoes();
	}

	
	

	
	
	
	
	}

