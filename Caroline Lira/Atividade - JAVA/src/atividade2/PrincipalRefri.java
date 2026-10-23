package atividade2;

public class PrincipalRefri {

	public static void main(String[] args) {
		MaquinaRefrigerante maquina = new MaquinaRefrigerante(5);
		
		System.out.println("Primeira compra: ");
		maquina.comprar(2,10.00);
		System.out.println("\nSegunda compra: ");
		maquina.comprar(4, 20.00);
		System.out.println("\nEstado da máquina: ");
		maquina.exibirEstado();
	}

}
