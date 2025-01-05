package entities;

public class Aluno {
	private String nome;
	private float n1; 
	private float n2;
	
	public Aluno(String nome, float n1, float n2) {
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
	}

	public String getNome() {
		return nome;
	}

	public float getN1() {
		return n1;
	}

	public float getN2() {
		return n2;
	}
}
