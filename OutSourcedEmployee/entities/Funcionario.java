package entities;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(int id, String  nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public void aumentarSalario(float taxa) {
		this.salario += this.salario * (taxa/100.0);
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

	public double getSalario() {
		return salario;
	}
	
	public String toString() {
		return getId() + ", " +
			   getNome() + ", " +
			   String.format("$ %.2f", getSalario());
	}
}
