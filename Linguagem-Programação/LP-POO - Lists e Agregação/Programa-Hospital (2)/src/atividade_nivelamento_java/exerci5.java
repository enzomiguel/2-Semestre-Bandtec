package atividade_nivelamento_java;

import java.util.Scanner;

public class exerci5 {

		public static void main(String[] args) {
			
			double salario,imposto;
			
			Scanner leitorsalario = new Scanner(System.in);
			Scanner leitorimposto = new Scanner(System.in);
			
			System.out.println("Qual o seu sal�rio: ");
			salario = leitorsalario.nextDouble();
			System.out.println("Qual a porcentagem de imposto que voc� dever� pagar:");
			imposto = leitorimposto.nextDouble();
			
			double porcentagem = (imposto/100);
			double resultado = (porcentagem) * (salario);
			
			System.out.println("Seu sal�rio liquido �: R$" + (salario - resultado));
		}
}

//Crie uma classe chamada �CalculadoraSalario� Java que:
//A. Seja execut�vel. B. Solicite que o usu�rio digite o seu sal�rio. 
//C. Solicite a porcentagem de imposto que o usu�rio dever� pagar. 
//D. Exiba o valor do sal�rio l�quido. Por exemplo:
//Se o sal�rio for 1000,00, e o imposto for de 20%, o sal�rio l�quido ser� 800,00.