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
		
		System.out.println("A soma dos n�meros lidos � :" + total);
	}
	
	
}
//Exerc�cio 07 - Acumulador
//Criar uma classe chamada �Acumulador� que :
//Leia v�rios n�meros at� ler o n�mero 0 e calcule a soma dos n�meros lidos. (N�o � para usar vetor)