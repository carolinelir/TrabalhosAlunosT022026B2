
public class funcionario {
	private int id;
	private String nome;
	private String cargo;
	private double salario;
	private String departamento;
	
	public funcionario(int id, String nome, String cargo, double salario,String departamento){
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.departamento = departamento;
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
