import java.util.ArrayList;
import java.util.Scanner;

public class principal {
	static Scanner entrada = new Scanner(System.in);
	
	static ArrayList<funcionario>funcionarios = new ArrayList<>();
	
	public static void main(String[] args) {
		int opcao;
		
		do {
			
			System.out.println("\n--------SISTEMA DE FUNCIONARIOS-------");
			System.out.println("1 - Cadastrar funcionários");
			System.out.println("2 - Listar funcionarios");
			System.out.println("3 - Buscar funcionario por ID");
			System.out.println("4 - Atualizar funcionario");
			System.out.println("5 - Excluir funcionario");
			System.out.println("0 - Sair");
			System.out.println("Escolha uma opcao: ");
			
			opcao = entrada.nextInt();
			entrada.nextLine();
			
			switch(opcao) {
			
			case 1:
				cadastrar();
				break;
				
			case 2:
				listar();
				break;
			
			case 3: 
				buscar();
				break;
				
			case 4: 
				atualizar();
				break;
				
			case 5: 
				excluir();
				break;
				
			case 0:
				System.out.println("Sistema encerrado!");
				break;
				
			default:
				System.out.println("Opcao invalida!");
			}
		}while(opcao!=0);
	}
	public static void cadastrar() {
		System.out.println("\n--------CADASTRAR FUNCIONARIO--------");
		
		System.out.println("Digite o ID: ");
		int id = entrada.nextInt();
		entrada.nextLine();
		
		for(funcionario f: funcionarios) {
			if(f.getId() == id) {
				System.out.println("Esse ID já esta cadastarado!");
				return;
			}
		}
		System.out.print("Digite o nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o cargo: ");
		String cargo = entrada.nextLine();
		
		System.out.print("Digite o salario: ");
		double salario = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Digite o departamento: ");
		String departamento = entrada.nextLine();
		
		funcionario novo = new funcionario(id, nome, cargo, salario, departamento);
		
		funcionarios.add(novo);
		
		System.out.println("Funcionario cadastrado com sucesso!");
		}
	
	public static void listar() {
		System.out.println("\n--------LISTA DE FUNCIONARIOS---------");
		
		if(funcionarios.isEmpty()) {
			System.out.println("Nenhum funcionario cadastrado!");
			return;
		}
		
		for(funcionario f: funcionarios) {
			
			System.out.println("-------------------");
			System.out.println("ID: " + f.getId());
			System.out.println("Nome: " + f.getNome());
			System.out.println("Cargo: " + f.getCargo());
			System.out.println("Salario: R$ " + f.getSalario());
			System.out.println("Deparatamento: " + f.getDepartamento());
		}
		
	}
	public static void buscar() {
		System.out.println("\n----------BUSCAR FUNCIONARIO----------");
		
		System.out.println("Digite o ID do funcionario: ");
		int id = entrada.nextInt();
		
		for(funcionario f: funcionarios) {
			
			if(f.getId() == id) {
				
				System.out.println("Funcionario encontrado!");
				System.out.println("ID: " + f.getId());
				System.out.println("Nome: " + f.getNome());
				System.out.println("Cargo: " + f.getCargo());
				System.out.println("Salario: " + f.getSalario());
				System.out.println("Departamento: " + f.getDepartamento());
				
				return;
			}
		}
		System.out.println("Funcionario não encontrado!");
	}
	public static void atualizar() {
		System.out.println("----------ATUALIZAR FUNCIONARIO-----------");
		
		System.out.println("Digite o ID do funcionario: ");
		int id = entrada.nextInt();
		entrada.nextLine();
		
		for(funcionario f: funcionarios) {
			
			if(f.getId() == id) {
				System.out.println("Digite o novo nome: ");
				String nome = entrada.nextLine();
				
				System.out.println("Digite o novo cargo: ");
				String cargo = entrada.nextLine();
				
				System.out.println("Digite novo salario: ");
				double salario = entrada.nextDouble();
				entrada.nextLine();
				
				System.out.println("Digite o novo departamento: ");
				String departamento = entrada.nextLine();
				
				f.setNome(nome);
				f.setCargo(cargo);
				f.setSalario(salario);
				f.setDepartamento(departamento);
				
				System.out.println("Funcionario atualizado com sucesso!");
				
				return;
			}
		}
		System.out.println("Funcionario nao encontrado!");
	}
	public static void excluir() {
		System.out.println("----------EXCLUIR FUNCIONARIO---------");
		System.out.println("Digite o ID do funcionario: ");
		int id = entrada.nextInt();
		
		for(funcionario f: funcionarios) {
			if(f.getId() == id) {
				funcionarios.remove(f);
				System.out.println("Funcionario excluido com sucesso!");
				
				return;
			}
		}
		System.out.println("Funcionario nao encontrado!");
	}
		}

