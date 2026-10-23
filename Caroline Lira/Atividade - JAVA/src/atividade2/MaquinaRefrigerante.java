package atividade2;

public class MaquinaRefrigerante {
	int quantidadeEstoque;
	double preco;
	double dinheiroArrecadado;
	
	public MaquinaRefrigerante (int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
		this.preco = 4.50;
		this.dinheiroArrecadado = 0;
	}
	public void comprar(int quantidade, double valorPago) {
		if(quantidade <=0) {
			System.out.println("Quantidade Inválida!");
		}else if (quantidade > quantidadeEstoque) {
			System.out.println("Estoque insuficiente!");
		}else if (valorPago < quantidade * preco) {
			System.out.println("Dinheiro Insuficiente!");
		}else{
			double total = quantidade * preco;
			double troco = valorPago - total;
			
			quantidadeEstoque -= quantidade;
			dinheiroArrecadado += total;
			
			System.out.println("Compra realizada!");
			System.out.printf("Troco: R$ %.2f%n", troco);
		}
	}
	public void reporEstoque(int quantidade) {
		if(quantidade > 0) {
			quantidadeEstoque += quantidade;
			System.out.println("Estoque atualizado!");
		}else {
			System.out.println("Quantidade inválida!");
		}
	}
	public void exibirEstado() {
		System.out.println("Estoque: " + quantidadeEstoque);
		System.out.printf("Preco: R$ %.2f%n", preco);
		System.out.printf("Dinheiro arrecadado: R$ %.2f%n", dinheiroArrecadado);
	}
}
