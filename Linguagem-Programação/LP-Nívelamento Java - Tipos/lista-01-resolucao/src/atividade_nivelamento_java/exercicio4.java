package atividade_nivelamento_java;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		int valor_produto,quant_vendida,valor_pago;
		
		Scanner leitorvalor_produto = new Scanner(System.in);
		Scanner leitorquant_vendida = new Scanner(System.in);
		Scanner leitorvalor_pago = new Scanner(System.in);
		
		
		System.out.println("Qual valor unit�rio de um produto?");
		valor_produto = leitorvalor_produto.nextInt();
		System.out.println("Qual quantidade vendida?");
		quant_vendida = leitorquant_vendida.nextInt();
		System.out.println("Qual o valor pago pelo cliente?");
		valor_pago = leitorvalor_pago.nextInt();
		double resultado = ((valor_produto * quant_vendida) - valor_pago);
		System.out.println("Seu troco ser� de R$ " + resultado);
		
		
	}
}

//Exerc�cio 04 - C�lculo de Troco
//Crie uma classe chamada �CalculadoraTroco� Java que:
//A. Seja execut�vel. B. Solicite o valor unit�rio de um produto. 
//C. Solicite a quantidade vendida. D. Solicite o valor pago pelo cliente.
//E. Calcule e exiba o troco com a seguinte frase. "Seu troco ser� de R$ X