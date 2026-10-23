package atividade5;

public class pedido {
	String nomeCliente;
	int quantidadeLanches;
	double precoLanche;
	double taxaEntrega;
	String status;
	
	public pedido (String nomeCliente) {
		this.nomeCliente = nomeCliente;
		this.quantidadeLanches = 0;
		this.precoLanche = 18.00;
		this.taxaEntrega = 7.00;
		this.status = "Aberto";
	}
	public void adicionarLanches(int quantidade) {
		if(status.equals("Finalizado")) {
			System.out.println("Pedido finalizado. Naõ é possível adicionar mais lanches!");
		} else if (quantidade <=0) {
			System.out.println("Quantidade inválida!");
		} else {
			quantidadeLanches += quantidade;
			System.out.println("Lanches adicionados com sucesso");
		}
	}
	public double calcularTotal() {
		double subtotal = quantidadeLanches * precoLanche;
		if(quantidadeLanches >=3) {
			subtotal = subtotal * 0.90;	
	   }
		return subtotal + taxaEntrega;
	}
	public void finalizarPedido() {
		status = "Finalizado";
		System.out.println("Pedido finalizado!");
	}
	public void exibirPedido() {
		System.out.println("Cliente: " + nomeCliente);
		System.out.println("Quantidade de lanches: " + quantidadeLanches);
		System.out.println("Status: " + status);
		System.out.printf("Total: R$ %.2f%n", calcularTotal());
	}
}
