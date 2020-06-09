
public class App {
	public static void main(String[] args) {
		
		Quadrado q = new Quadrado("Vermelha",20,2.2);
		Quadrado q1 = new Quadrado("Lilas",1,2.1);
		Retangulo r = new Retangulo("Azul",4,2.1,2.2);
		Triangulo t = new Triangulo("Amarelo",2,3.1,2.0);
		Circulo c = new Circulo("Verde",6,3.1);
		
		System.out.println(q);
		System.out.println(q1);
		System.out.println(r);
		System.out.println(t);
		System.out.println(c);
		
		Imagem img = new Imagem();
		img.adicionaFigura(q);
		img.adicionaFigura(q1);
		img.adicionaFigura(r);
		img.adicionaFigura(t);
		img.adicionaFigura(c);
		
		
		img.exibeFiguras();
		img.exibeQuadrado();
		img.exibeSomaArea();
		img.exibeFiguraAreaMaior20();
		
	}
}

//Crie uma classe App, dentro do método main, crie objetos das classes Quadrado, Retangulo, Triangulo, 
//Circulo e atribua valores para os seus atributos e exiba os
//dados dos objetos, inclusive a área, usando o toString implícito.
//Logo após crie um objeto do tipo Imagem e adicione os objetos criados acima, em
//seguida, invoque os métodos de exibição criados no item 6.