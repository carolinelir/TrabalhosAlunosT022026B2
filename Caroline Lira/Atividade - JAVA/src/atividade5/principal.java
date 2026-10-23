package atividade5;

public class principal {

	public static void main(String[] args) {
		pedido pedido =new pedido ("Caroline Lira");
		
		pedido.adicionarLanches(2);
		pedido.adicionarLanches(1);
		
		System.out.println("\nResumo do pedido: ");
		pedido.exibirPedido();
		
		pedido.finalizarPedido();
		
		System.out.println("\nTentatica de adicionar mais lanches: ");
		pedido.adicionarLanches(1);
		
		System.out.println("\nEstado final: ");
		pedido.exibirPedido();
	}

}
