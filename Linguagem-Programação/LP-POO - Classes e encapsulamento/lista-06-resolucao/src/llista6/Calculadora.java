package llista6;

public class Calculadora {
	//atributos
	private Integer numero01 = 0,numero02 = 0,total = 0 ;
	
	
	//metodos
	public Integer soma(Integer numero01, Integer numero02) {
		
	total = numero01+numero02;
	return total;
	}
	
	public Integer  subtracao(Integer numero01, Integer numero02) {
		
	total = numero01 - numero02;	
	return total;
	}
	
	public Integer multiplicacao(Integer numero01, Integer numero02) {
		
	total = numero01 * numero02;
	return total;	
	}
	
	public Integer divisao(Integer numero01, Integer numero02) {
	total = numero01 / numero02;
	return total;	
	}
	
	public Integer getNumero01() {
		return numero01;
	}
	
	public void setNumero01(Integer numero01) {
		this.numero01 = numero01;
	}
	
	public Integer getNumero02() {
		return numero02;
	}
	
	public void setNumero02(Integer numero02) {
		this.numero02 = numero02;
	}
	
	public Integer getTotal() {
		return total;
	}

}

//Exerc�cio 02 - Calculadora
//Crie uma JFrame que:
//a) Tenha 2 inputs(textField), n�mero 01 e n�mero 02 onde o usu�rio colocar� os n�meros que
//desejar. b) Abaixo dos inputs, coloque 4 bot�es que representam as opera��es aritm�ticas
//b�sicas(soma, subtra��o, multiplica��o e divis�o). c) Abaixo dos bot�es coloque um texto(Label) resultado, ela dever� apresentar o resultado
//de cada opera��o quando o usu�rio clicar em um dos bot�es. d) Crie uma classe chamada �Calculadora� para gerenciar os c�lculos e o resultado.