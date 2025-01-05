package entities;


public class PessoaFisica extends Pessoaa {
	private Double gastosSaude;
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double calcularImposto() {
		if(rendaAnual < 20000.00 && gastosSaude == 0.0) return rendaAnual * 0.15;
		else if(rendaAnual >= 20000.00 && gastosSaude == 0.0) return rendaAnual * 0.25;
		else if(rendaAnual >= 20000.00 && gastosSaude != 0.0) return rendaAnual * 0.25 - gastosSaude * 0.5;
		else if(rendaAnual < 20000.00 && gastosSaude != 0.0) return rendaAnual * 0.15 - gastosSaude * 0.5;
		else return 0.0;
	}
	
	

}
