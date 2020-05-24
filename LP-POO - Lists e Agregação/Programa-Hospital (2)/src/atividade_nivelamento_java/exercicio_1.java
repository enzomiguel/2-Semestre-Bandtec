package atividade_nivelamento_java;

import java.util.Scanner;

public class exercicio_1 {

	
	public static void main(String[] args) {
		Double n1,n2;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		
		n1 = leitor.nextDouble();
		
		System.out.print("Digite outro número: ");
		
		n2 = leitor.nextDouble();
		
		System.out.println("Resultado da soma é: " + (n1 + n2));
		
		System.out.println("Resultado da subtração é: " + (n1 - n2));
		
		System.out.println("Resultado da multiplicação é: " + (n1 * n2));
		
		System.out.println("Resultado da divisão é: " + (n1 / n2));
	}
}

//Exercício 01 - Calculadora Simples
//Crie uma classe chamada “Calculadora” Java que:
//A. Seja executável (possui o método main). B. 
//Solicite um número para o usuário(número real). C. 
//Solicite outro número para o usuário(número real). D. 
//Calcule e exiba a soma dos dois números digitados. E. 
//Calcule e exiba a subtração do primeiro número pelo segundo. F. 
//Calcule e exiba a multiplicação do primeiro número pelo segundo. G. 
//Calcule e exiba a divisão do primeiro número pelo segundo.