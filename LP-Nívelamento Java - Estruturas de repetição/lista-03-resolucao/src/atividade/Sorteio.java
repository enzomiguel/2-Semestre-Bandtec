package atividade;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		Integer numero;
		Integer sorteio ;
		Boolean validacao = true;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		numero = leitor.nextInt();
		
		for(Integer cont = 1; cont <=200; cont++) {
		
			sorteio = aleatorio.nextInt(99) + 1;
			System.out.println(cont + ") sorteio: "+ sorteio);
			
			 if(numero == sorteio && validacao == true) {
				 System.out.println("--------------------------------------------------------- ");
				 System.out.println(" Seu numero foi sorteado pela primeira vez aqui: ");
				 System.out.println( " Sorteio: "+ cont);
				 System.out.println("--------------------------------------------------------- ");
				validacao = false;
			}
		}
		
		
	}

}
//Exerc�cio 06 - Sorteio
//Crie uma classe chamada �Sorteio� que:
//Solicite um n�mero de 1 a 100. Realize 200 sorteios. Ao final, exibir:
//Se o n�mero do usu�rio foi sorteado (pela 1� vez) e em qual sorteio. Quantos n�meros pares foram sorteados.= 1
//Quantos n�meros �mpares foram sorteados.
