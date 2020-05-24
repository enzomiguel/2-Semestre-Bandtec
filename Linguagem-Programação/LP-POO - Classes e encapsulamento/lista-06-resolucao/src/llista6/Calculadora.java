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

//Exercício 02 - Calculadora
//Crie uma JFrame que:
//a) Tenha 2 inputs(textField), número 01 e número 02 onde o usuário colocará os números que
//desejar. b) Abaixo dos inputs, coloque 4 botões que representam as operações aritméticas
//básicas(soma, subtração, multiplicação e divisão). c) Abaixo dos botões coloque um texto(Label) resultado, ela deverá apresentar o resultado
//de cada operação quando o usuário clicar em um dos botões. d) Crie uma classe chamada “Calculadora” para gerenciar os cálculos e o resultado.