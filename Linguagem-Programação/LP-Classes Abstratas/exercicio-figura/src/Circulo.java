
public class Circulo extends Figura {
	private Double raio;
	
	public Circulo(String cor, Integer espessura,Double raio) {
		super(cor,espessura);
		this.raio = raio;
	}
	
	@Override
	public Double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * raio * raio;
	}
	
	@Override
	public String toString() {
		
		return "\nCirculo \n" +super.toString()+ "\nRaio: " + raio + "\nArea Calculada: " + calcularArea() ;
	}
	
	public Double getRaio() {
		return raio;
	}
}

//Uma classe Circulo, com as características e comportamentos a seguir:
//Atributos:
//➢ raio - Double
//Métodos:
//➢ calculaArea - retorna um Double - π . raio²( Pi * raio * raio). ➢ toString - retorna uma string contendo as informações do objeto