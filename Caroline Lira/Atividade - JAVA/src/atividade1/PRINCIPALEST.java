package atividade1;

public class PRINCIPALEST {

	public static void main(String[] args) {
		ESTACIONAMENTO carro = new ESTACIONAMENTO("ABC1234", "Civic");
		
		carro.adicionarTempo(60);
		carro.exibirResumo();

	}

}
