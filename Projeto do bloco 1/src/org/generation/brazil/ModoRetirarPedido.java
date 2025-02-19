package org.generation.brazil;

import java.util.Scanner;

public class ModoRetirarPedido {
	
	public Scanner leia = new Scanner(System.in);
	
	private Cadastro cadastro = new Cadastro();
	
	@SuppressWarnings("unused")
	private int modoEntrega;
	
	public void EscolherEntrega() throws InterruptedException{
		
		Pagamentos pagar = new Pagamentos();
		
		System.out.println("===== ENTREGA DO PEDIDO =====\n");
		Thread.sleep(2000);
		
		System.out.println("1. RETIRADA NO LOCAL\n"
				+ "2. ENTREGA A DOMIC�LIO ");
		Thread.sleep(1000);
		System.out.println("-> Selecione a melhor op��o para voc�: ");
		
		int modoEntrega = leia.nextInt();
		
		switch(modoEntrega) {
		case 1:
			System.out.println("===== RETIRADA NO LOCAL ====="
					+ "\n**Ap�s confirma��o do pagamento!!** ");
			Thread.sleep(2500);
			break;
		case 2:
			System.out.println("===== ENTREGA A DOMOC�LIO ====="
					+ "\n*** Frete GR�TIS *** "
					+ "\nEndere�o de entrega registrado em cadastro: " + cadastro.getEndereco());
			Thread.sleep(2500);
			break;
		default:
			do {
				System.out.println("Escolha uma op��o v�lida!"
						+ "\n 'Digite 1 para retornar as op��es...");
				Thread.sleep(1500);
				modoEntrega = leia.nextInt();
			} while (modoEntrega != 1 && modoEntrega != 2);
			
			EscolherEntrega();
		}
		
		pagar.telaInicialPagamentos();
		
	}
	
}
	
	
	
		
		
	

