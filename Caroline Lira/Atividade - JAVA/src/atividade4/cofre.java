package atividade4;

public class cofre {
	String dono;
	double saldo;
	double metaEconomia;
	
	public cofre(String dono, double metaEconomia) {
		this.dono = dono;
		this.metaEconomia = metaEconomia;
		this.saldo = 0;
	}
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.println("Depósito realizado!");
		} else {
			System.out.println("O depósito deve ser positivo!");
		}
	}
	public void retirar(double valor) {
		 if (valor <= 0) {
			 System.out.println("O valor deve ser positivo.");
		} else if (valor > saldo) {
			 System.out.println("Saldo insuficiente para retirada.");
		} else {
			 saldo -= valor;
	         System.out.println("Saque realizada.");
	        }
	    }
	public void verificarMeta() {
		if (saldo >= metaEconomia) {
			System.out.println("Meta de economia atingida!");
		} else {
			double falta = metaEconomia - saldo;
			System.out.printf("Faltam R$ %.2f%n para atingir a meta", falta);
		}
	}
	public void exibirSaldo() {
		System.out.println("Dono: " + dono);
		System.out.printf("Saldo: R$ %.2f%n", saldo);
		System.out.printf("Meta: R$ %.2f%n", metaEconomia);
	}
	}
