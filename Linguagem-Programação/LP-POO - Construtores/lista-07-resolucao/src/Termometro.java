
public class Termometro {
	//atributos
	private Double temperaturaAtual, temperaturaMax, temperaturaMin;
	
	//construtores 
	
	public Termometro() {
	}
	
	public Termometro(Double temperaturaAtual, Double temperaturaMax, Double temperaturaMin ) {
		this();
		this.temperaturaAtual = temperaturaAtual;
		this.temperaturaMax = temperaturaMax;
		this.temperaturaMin = temperaturaMin;
	}
	
	
	
	
	//metodos 
	public void aumentarTemperatura(){
		temperaturaAtual +=1.0;
		if(temperaturaAtual > temperaturaMax) {
			//atribuindo a tempMaxima para tempAtual
			setTemperaturaAtual(temperaturaMax);
			
		}
	}
	public void diminuiTemperatura() {
		
		temperaturaAtual -= 3.0;
		if(temperaturaAtual < temperaturaMin) {
			setTemperaturaAtual(temperaturaMin);
			
		}
		
	}
	public void exibeFahreinheit() {
		temperaturaAtual = temperaturaAtual * 1.8+ 32;
		System.out.println(String.format("Temperatura atual em Fahreinheit:  %.2f  ", getTempAtual()));
	}
	
	public void exibirTemperaturas() {
		 System.out.println("\n**************************************************");
	        System.out.println("\nTemperatura minima: " + getTemperaturaMin()+"°");
	        System.out.println("Temperatura atual: " + getTempAtual()+"°");
	        System.out.println("Temperatura maxima: " + getTemperaturaMax()+"°");
	}
	
	
	//Getters e Setters
	public Double getTempAtual() {
		return temperaturaAtual;
	}
	public void setTemperaturaAtual(Double temperaturaAtual) {
		this.temperaturaAtual = temperaturaAtual;
	}
	public Double getTemperaturaMax() {
		return temperaturaMax;
	}
	public void setTemperaturaMax(Double temperaturaMax) {
		this.temperaturaMax = temperaturaMax;
	}
	public Double getTemperaturaMin() {
		return temperaturaMin;
	}
	public void setTemperaturaMin(Double temperaturaMin) {
		this.temperaturaMin = temperaturaMin;
	}
	
}

//Crie uma classe chamada Termometro
//a) Crie os atributos temperaturaAtual, temperaturaMax, temperaturaMin
//b) Crie um método chamado aumentaTemperatura, que recebe um valor para
//aumentar a temperatura atual. Caso a nova temperatura seja maior do que a
//temperaturaMax, atribua para a temperatura atual a temperaturaMax. c) Crie um método chamado diminuiTemperatura, que recebe um valor para
//diminuir a temperatura atual. Caso a nova temperatura seja menor do que a
//temperaturaMin, atribua para a temperatura atual a temperaturaMin. d) Crie um método chamado exibeFahreinheit, que calcula e exibe a
//temperatura atual na escala de Fahreinheit. Pesquise como é a fórmula para
//converter de Celsius para Fahreinheit. f) Crie uma outrea classe chamada TesteTermometro, crie uma instância e
//seus execute os métodos para testar sua classe recém criada.