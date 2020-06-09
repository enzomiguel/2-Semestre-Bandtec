
public class Quadrado extends Figura {
	
	private Double lado;
	
	public Quadrado(String cor, Integer espessura,Double lado) {
		super(cor,espessura);
		this.lado = lado;
	}
	
	@Override
	public Double calcularArea() {
		
		return lado * lado;
	}
	
	@Override
	public String toString() {
		
		return "\nQuadrado \n" + super.toString()+ "\nLado: " + lado + "\nArea Calculada: " + calcularArea();
	}
	
	public Double getLado() {
		return lado;
	}
	
}

//. Uma classe Quadrado, com as características e comportamentos a seguir:
//Atributos:
//➢ lado - Double - representa a medida de um dos lados. Métodos:
//➢ calculaArea- retorna um Double - lado²(lado * lado). ➢ toString - retorna uma string contendo as informações do objeto.