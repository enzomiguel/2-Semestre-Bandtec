package atividade_nivelamento_java;

import java.util.Scanner;

public class exerci5 {

		public static void main(String[] args) {
			
			double salario,imposto;
			
			Scanner leitorsalario = new Scanner(System.in);
			Scanner leitorimposto = new Scanner(System.in);
			
			System.out.println("Qual o seu salário: ");
			salario = leitorsalario.nextDouble();
			System.out.println("Qual a porcentagem de imposto que você deverá pagar:");
			imposto = leitorimposto.nextDouble();
			
			double porcentagem = (imposto/100);
			double resultado = (porcentagem) * (salario);
			
			System.out.println("Seu salário liquido é: R$" + (salario - resultado));
		}
}

//Crie uma classe chamada “CalculadoraSalario” Java que:
//A. Seja executável. B. Solicite que o usuário digite o seu salário. 
//C. Solicite a porcentagem de imposto que o usuário deverá pagar. 
//D. Exiba o valor do salário líquido. Por exemplo:
//Se o salário for 1000,00, e o imposto for de 20%, o salário líquido será 800,00.