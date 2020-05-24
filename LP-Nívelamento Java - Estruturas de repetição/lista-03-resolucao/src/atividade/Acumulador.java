package atividade;

import java.util.Scanner;

public class Acumulador {
	public static void main(String[] args) {
		Integer Numero=1;
		Integer cont = 0;
		Integer total = 0;
		
		Scanner leitor = new Scanner(System.in);
		
			while(Numero !=0) {
				System.out.println("Digite um numero: ");
				Numero = leitor.nextInt();
				System.out.println("Seu numero: "+ Numero);
				 total = total+Numero;
				System.out.println("Total Ate agr: "+ total);
				cont++;
			}
		
		System.out.println("A soma dos números lidos é :" + total);
	}
	
	
}
//Exercício 07 - Acumulador
//Criar uma classe chamada “Acumulador” que :
//Leia vários números até ler o número 0 e calcule a soma dos números lidos. (Não é para usar vetor)