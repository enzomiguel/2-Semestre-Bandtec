package atividade;

import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		
		Integer base,expoente;
		Integer resultado = 1;
		
		Scanner leitor = new Scanner(System.in);
		
	System.out.println("Digite o n�mero da base: ");
	base = leitor.nextInt();
	System.out.println("Digite o n�mero da expoente: ");
	expoente = leitor.nextInt();
	
	for (Integer cont = 0; cont < expoente; cont++) {
		resultado *= base;
		
		
	}
	System.out.println("Resultado da potencia e : " + resultado);
	}
}

//Exerc�cio 09 - Pot�ncia
//Elaborar um programa em Java que apresente como resultado o valor de uma
//pot�ncia de uma base qualquer elevada a um expoente qualquer, ou seja, de BE, em
//que B � o valor da base e E o valor do expoente. Considere apenas a entrada de valores inteiros e positivos. 
//Por exemplo: B = 2 e E = 5.
//O programa dever� calcular e exibir o valor de 2 elevado a 5 = 32. 
//(N�o � para usar m�todos que calculam a pot�ncia diretamente).