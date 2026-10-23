package atividade4;

public class principal {

	public static void main(String[] args) {
		cofre cofre = new cofre ("Caroline Lira", 500.000);
		
		cofre.depositar(200.00);
		cofre.depositar(150.00);
		
		System.out.println("\nTentativa de retirada: ");
		cofre.retirar(400.00);
		
		System.out.println("\nSaldo final: ");
		cofre.exibirSaldo();
		
		System.out.println("\nVerificação da meta: ");
		cofre.verificarMeta();
	}

}
