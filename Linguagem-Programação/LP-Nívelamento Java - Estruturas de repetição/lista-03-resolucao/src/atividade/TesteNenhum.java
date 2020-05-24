package atividade;

import java.util.Scanner;

public class TesteNenhum {
	
public static void main(String[] args) {
		
		Integer idade;
		String nome;
		
		Scanner leitor = new Scanner(System.in);
		Scanner leitor1 = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leitor1.nextLine();
		System.out.println("Digite sua idade: ");
		idade = leitor.nextInt();
		
		if(idade < 10) {
			
			System.out.println("Vai trabalhar!");
			
		}else {
			System.out.println("Pode entrar na balada " + nome);
		}
		
	}
}
