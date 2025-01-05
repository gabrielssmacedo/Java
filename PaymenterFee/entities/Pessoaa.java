package entities;

public abstract class Pessoaa {
	protected String nome;
	protected Double rendaAnual;
	
	public Pessoaa() {
	}
	
	public Pessoaa(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getRendaAnual() {
		return rendaAnual;
	}
	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double calcularImposto();

	@Override
	public String toString() {
		return nome + ": $ " + String.format("%.2f", calcularImposto()); 
	}
	
	
}
