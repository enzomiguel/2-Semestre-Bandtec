package atividade_nivelamento_java;

import java.util.Scanner;

public class exercicio_1 {

	
	public static void main(String[] args) {
		Double n1,n2;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		
		n1 = leitor.nextDouble();
		
		System.out.print("Digite outro n�mero: ");
		
		n2 = leitor.nextDouble();
		
		System.out.println("Resultado da soma �: " + (n1 + n2));
		
		System.out.println("Resultado da subtra��o �: " + (n1 - n2));
		
		System.out.println("Resultado da multiplica��o �: " + (n1 * n2));
		
		System.out.println("Resultado da divis�o �: " + (n1 / n2));
	}
}

//Exerc�cio 01 - Calculadora Simples
//Crie uma classe chamada �Calculadora� Java que:
//A. Seja execut�vel (possui o m�todo main). B. 
//Solicite um n�mero para o usu�rio(n�mero real). C. 
//Solicite outro n�mero para o usu�rio(n�mero real). D. 
//Calcule e exiba a soma dos dois n�meros digitados. E. 
//Calcule e exiba a subtra��o do primeiro n�mero pelo segundo. F. 
//Calcule e exiba a multiplica��o do primeiro n�mero pelo segundo. G. 
//Calcule e exiba a divis�o do primeiro n�mero pelo segundo.