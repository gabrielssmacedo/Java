package entities;

public class PessoaJuridica extends Pessoaa {
	private Integer numFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public Double calcularImposto() {
		if(numFuncionarios <= 10) return rendaAnual * 0.16;
		else return rendaAnual * 0.14;
	}
	
}
