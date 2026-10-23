package atividade3;

public class Principal {

	public static void main(String[] args) {
		time time1 = new time ("Leões");
		time time2 = new time ("Tigres");
		
		time1.registrarVitoria();
		time1.registrarVitoria();
		time1.registrarEmpates();
		time1.registrarDerrotas();
		
		time2.registrarVitoria();
		time2.registrarEmpates();
		time2.registrarEmpates();
		time2.registrarDerrotas();
		
		time1.exibirEstatisticas();
		System.out.println();
		time2.exibirEstatisticas();
		
		System.out.println("\nClassificação: ");
		
		if(time1.pontos > time2.pontos) {
			System.out.println(time1.nome + "possui mais pontos.");
		} else if (time2.pontos > time1.pontos) {
			System.out.println(time2.nome + "possui mais pontos.");
		} else {
			System.out.println("Houve empate na classificação.");
		}
	}

}
