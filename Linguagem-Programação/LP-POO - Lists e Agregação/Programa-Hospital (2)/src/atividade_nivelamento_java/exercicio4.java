package atividade_nivelamento_java;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		int valor_produto,quant_vendida,valor_pago;
		
		Scanner leitorvalor_produto = new Scanner(System.in);
		Scanner leitorquant_vendida = new Scanner(System.in);
		Scanner leitorvalor_pago = new Scanner(System.in);
		
		
		System.out.println("Qual valor unitário de um produto?");
		valor_produto = leitorvalor_produto.nextInt();
		System.out.println("Qual quantidade vendida?");
		quant_vendida = leitorquant_vendida.nextInt();
		System.out.println("Qual o valor pago pelo cliente?");
		valor_pago = leitorvalor_pago.nextInt();
		double resultado = ((valor_produto * quant_vendida) - valor_pago);
		System.out.println("Seu troco será de R$ " + resultado);
		
		
	}
}

//Exercício 04 - Cálculo de Troco
//Crie uma classe chamada “CalculadoraTroco” Java que:
//A. Seja executável. B. Solicite o valor unitário de um produto. 
//C. Solicite a quantidade vendida. D. Solicite o valor pago pelo cliente.
//E. Calcule e exiba o troco com a seguinte frase. "Seu troco será de R$ X