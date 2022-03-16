package questao2Rendimento;

public class Rendimento {

	float invest, taxa, mes, rendimento;
	

	
	
	
	public Rendimento(float invest, float taxa,  float mes) {
		
		this.invest = invest;
		this.taxa = taxa;
		this.mes = mes;
	}



	public float calculaRendimento(){
		
		this.rendimento =  (float) (invest * Math.pow((1+taxa/100), mes));		
		return rendimento;
	}
	
}
