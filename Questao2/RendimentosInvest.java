package Questao2;

public class RendimentosInvest {
	
	//atributos
	private float investInicial;
	private float taxa;
	private float numMeses;
	private Double resultado;
	
	//construtor
	public RendimentosInvest(float investInicial, float taxa, float numMeses, Double resultado) {
		super();
		this.investInicial = investInicial;
		this.taxa = taxa;
		this.numMeses = numMeses;
		this.resultado = resultado;
	}
	//setters e getters

	public float getInvestInicial() {
		return investInicial;
	}

	public void setInvestInicial(float investInicial) {
		this.investInicial = investInicial;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	public float getNumMeses() {
		return numMeses;
	}

	public void setNumMeses(float numMeses) {
		this.numMeses = numMeses;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	
	//metodo
	public Double rendimento(){
        for (int i=1; i<= numMeses; i++){
            resultado += resultado * (taxa/100);
        }
        return resultado;
	}
}
	
	


