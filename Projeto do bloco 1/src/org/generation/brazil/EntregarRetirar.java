package org.generation.brazil;

public class EntregarRetirar{

public void Finalizar() throws InterruptedException {
	
	System.out.println("Seu pedido foi feito com sucesso!");

	for(int i = 0; i <= 2; i++){
	System.out.println(".");
	Thread.sleep(500);
	}
	
	System.out.println("Seu pedido est� sendo preparado");
	for(int i = 0; i <= 3; i++){
	System.out.println(".");
	Thread.sleep(1500);
	}
	System.out.println("Seu pedido saiu para entrega ou est� pronto para ser retirado");
	System.out.println("Obrigado por realizar seu pedido na Java's Pizzaria! At� logo!");

}
}
