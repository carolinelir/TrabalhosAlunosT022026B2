import java.util.ArrayList;
import java.util.Scanner;

public class principalBiblioteca {
	static Scanner entrada = new Scanner(System.in);
	static ArrayList<Livro> livros = new ArrayList<>();
	
	public static void main(String[]args) {
		int opcao;
		
		do {
			
			System.out.println("\n---------BIBLIOTECA--------");
			System.out.println("1 - Cadastrar livro");
			System.out.println("2 - Listar livros");
			System.out.println("3 - Buscar livro");
			System.out.println("4 - Emprestrar livro");
			System.out.println("5 - Devolver livro");
			System.out.println("6 - Sair");
			
			System.out.println("Escolha uma opcao: ");
			opcao = entrada.nextInt();
			entrada.nextLine();
			
			switch(opcao) {
			
			case 1:
				cadastrarLivro();
				break;
				
			case 2:
				listarLivros();
				break;
				
			case 3:
				buscarLivro();
				break;
				
			case 4: 
				emprestarLivro();
				break;
				
			case 5: 
				devolverLivro();
				break;
				
			case 6:
				System.out.println("Sistema encerrado!");
				break;
				
			default:
				System.out.println("Opcao invalida!");
			}
		}while (opcao !=6);
	}
	public static void cadastrarLivro() {
		
		System.out.println("\n--------CADASTRAR LIVRO--------");
		
		System.out.println("Digite o titulo do livro: ");
		String titulo = entrada.nextLine();
		
		System.out.println("Digite o nome do autor: ");
		String autor = entrada.nextLine();
		
		System.out.print("Digite o ano de publicacao: ");
		int ano = entrada.nextInt();
		entrada.nextLine();
		
		Livro novoLivro = new Livro(titulo, autor, ano);
		
		livros.add(novoLivro);
		
		System.out.println("Livro cadastrado com sucesso!");
	}
	public static void listarLivros() {
		System.out.println("\n--------LIVROS CADASTRADOS---------");
		
		if(livros.isEmpty()) {
			System.out.println("Nenhum livro cadastrado!");
		} else {
			for(int i = 0; i< livros.size(); i++) {
				Livro  livroAtual = livros.get(i);
				
				System.out.println("\nLivro " + (i + 1));
				System.out.println("Titulo: " + livroAtual.getTitulo());
				System.out.println("Autor: " + livroAtual.getAutor());
				System.out.println("Ano: " + livroAtual.getAno());
				
				if(livroAtual.isDisponivel()) {
					System.out.println("Disponibilidade: Disponivel");
				} else {
					System.out.println("Disponibilidade: Emprestado");
				}
			}
		}
	}

	public static void buscarLivro() {
		System.out.println("----------BUSCAR LIVRO----------");
		
		System.out.println("Digite o titulo do livro: ");
		String tituloBusca = entrada.nextLine();
		
		boolean encontrado = false;
		
		for(int i = 0; i < livros.size(); i++) {
			Livro livroAtual = livros.get(i);
			
			if(livroAtual.getTitulo().equalsIgnoreCase(tituloBusca)) {
				System.out.println("\nLivro encontrado!");
				System.out.println("Titulo: " + livroAtual.getTitulo());
				System.out.println("Autor: " + livroAtual.getAutor());
				System.out.println("Ano: " + livroAtual.getAno());
				
				if(livroAtual.isDisponivel()) {
					System.out.println("Disponibilidade: Disponivel");
				} else {
					System.out.println("Disponibilidade: Emprestado");
				}
				encontrado = true;
			}
		}
		
		if(encontrado ==false) {
			System.out.println("Livro nao encontrado");
		}
	}

	public static void emprestarLivro() {
		System.out.println("----------EMPRESTAR LIVRO----------");
		
		System.out.println("Digite o titulo do livro: ");
		String tituloBusca = entrada.nextLine();
		
		boolean encontrado = false;
		
		for(int i = 0; i < livros.size(); i++) {
			Livro livroAtual = livros.get(i);
			
			if(livroAtual.getTitulo().equalsIgnoreCase(tituloBusca)) {
				encontrado = true;
				
				if(livroAtual.isDisponivel()) {
					livroAtual.setDisponivel(false);
					
					System.out.println("Emprestimo realizado com sucesso!");
				} else {
					System.out.println("Este livro ja esta emprestado!");
				}
			}
		}
		if (encontrado == false) {
			System.out.println("Livro nao encontrado!");
		}
		}

	public static void devolverLivro() {
		
		System.out.println("---------DEVOLVER LIVRO----------");
		
		System.out.println("Digite o titulo do livro: ");
		String tituloBusca = entrada.nextLine();
		
		boolean encontrado = false;
		
		for(int i = 0; i < livros.size(); i++) {
			
			Livro livroAtual = livros.get(i);
			
			if(livroAtual.getTitulo().equalsIgnoreCase(tituloBusca)) {
				
				encontrado = true;
				
				if(livroAtual.isDisponivel()==false) {
					livroAtual.setDisponivel(true);
					
					System.out.println("Devolucao realizada com sucesso!");
				} else {
					System.out.println("Este livro nao estava emprestado!");
				}
			}
		}
		if(encontrado == false) {
			System.out.println("Livro nao encontrado!");
		}
	}
}