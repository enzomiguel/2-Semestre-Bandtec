

package atividade;
 

import java.util.Scanner;

public class Revisao {
	public static void main(String[] args) {
		
		String nome;
		Double moedas, resultado = 0.0;
		
		Scanner leitorNome = new Scanner(System.in);
		Scanner leitorMoeda = new Scanner(System.in);
		
		System.out.print("Qual seu nome: ");
		nome = leitorNome.nextLine();
		
		for(Integer i = 1; i < 8; i++) {
			System.out.println("Valor depositado no dia " + i + "º dia");
			moedas = leitorMoeda.nextDouble();
			resultado += moedas;
			
			if(moedas == 0.00 || moedas == 0.01 || moedas == 0.05 || moedas == 0.10 || moedas == 0.25 || moedas == 0.50 || moedas == 1.00) {
				System.out.println("Depositado ");
			}else {
				System.out.println("Erro, tente algo como: 0,01 ou 1. Tente novamente: ");
				--i;
			}
		}
		System.out.format("\nAo final de 7 dias, " + nome + " guardou R$ %.2f", resultado);
	}

}
