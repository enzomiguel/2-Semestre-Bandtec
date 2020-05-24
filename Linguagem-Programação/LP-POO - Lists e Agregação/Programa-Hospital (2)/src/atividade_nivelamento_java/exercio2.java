package atividade_nivelamento_java;

import java.util.Scanner;

public class exercio2 {

	public static void main(String[] args) {
		
		int idade;
		String nome;
		Scanner leitorNome = new Scanner(System.in);
		Scanner leitorIdade = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = leitorNome.nextLine();
		System.out.print("Olá, " + nome + "! Qual o ano de seu nascimento? : ");
		idade = leitorIdade.nextInt();
		
		int year = 2030 - idade - 1;
		System.out.print("Em 2030 você terá " + year + "  anos");
		
		
	}
	
	
}

//Exercício 02 - Idade
//Crie uma classe chamada “Idade” Java que:
//A. Seja executável. B. Solicite que o usuário digite o seu nome. C. 
//Em seguida, o programa deverá exibir a mensagem: “Olá, Fulano! Qual o ano de seu nascimento?”. 
//D. Depois, o programa deverá exibir: “Em 2030 você terá 25 anos” (sendo Fulano o nome digitado pelo 
//usuário e xx a idade
//do usuário). Exemplo:
//Qual é o seu nome?
//Maria
//Olá, Maria! Qual o ano de seu nascimento?