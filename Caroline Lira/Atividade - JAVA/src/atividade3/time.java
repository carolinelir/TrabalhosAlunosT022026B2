package atividade3;

public class time {
	String nome;
	int vitorias;
	int empates;
	int derrotas;
	int pontos;
	
	public time(String nome) {
		this.nome = nome;
		vitorias = 0;
		empates = 0;
		derrotas = 0;
		pontos = 0;
	}
	public void registrarVitoria() {
		vitorias++;
		pontos += 3;
	}
	public void registrarEmpates() {
		empates++;
		pontos += 1;
	}
	public void registrarDerrotas() {
		derrotas++;
	}
	public void exibirEstatisticas() {
		System.out.println("Time: " + nome);
		System.out.println("Vitórias: " + vitorias);
		System.out.println("Empates: " + empates);
		System.out.println("Derrotas: " + derrotas);
		System.out.println("Pontos: " + pontos);
	}
}
