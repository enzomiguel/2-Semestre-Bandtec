
public abstract class Figura {
	
	private String cor;
	private Integer espessura;
	
	public Figura(String cor, Integer espessura) {
		this.cor = cor;
		this.espessura = espessura;
		
	}
	
	public abstract Double  calcularArea();
		
	@Override
	public String toString() {
		
		return "Figura \n" + "Cor: " + cor + "\nEspessura: " + espessura;
	}
	
	public String getCor() {
		return cor;
	}
	public Integer getEspessura() {
		return espessura;
	}
}


//1. Uma classe abstrata Figura, com as características e comportamentos a seguir:
//Atributos:
//➢ cor - String
//➢ espessura - Integer
//Métodos:
//➢ calculaArea - abstrato e retorna um Double
//➢ toString - retorna uma string contendo as informações do objeto
//inclusive a área