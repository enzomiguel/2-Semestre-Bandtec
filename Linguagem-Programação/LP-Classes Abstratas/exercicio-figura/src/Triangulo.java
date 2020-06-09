
public class Triangulo extends Figura {
	
	private Double base;
	private Double altura;
	
	public Triangulo(String cor, Integer espessura,Double base,Double altura) {
		super(cor,espessura);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public Double calcularArea() {
		return base * altura / 2;
	}
	
	@Override
	public String toString() {
		
		return "\nTriangulo \n" + super.toString()+ "\nBase: " + base + "\nAltura: " + altura + "\nArea Calculada: " + calcularArea();
	}
	
	public Double getAltura() {
		return altura;
	}
	public Double getBase() {
		return base;
	}
}

//Uma classe Triangulo, com as características e comportamentos a seguir:
//Atributos:
//➢ base - Double
//➢ altura- Double
//Métodos:
//➢ calculaArea - retorna um Double - base * altura / 2
//➢ toString - retorna uma string contendo as informações do objeto.