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
		System.out.print("Ol�, " + nome + "! Qual o ano de seu nascimento? : ");
		idade = leitorIdade.nextInt();
		
		int year = 2030 - idade - 1;
		System.out.print("Em 2030 voc� ter� " + year + "  anos");
		
		
	}
	
	
}

//Exerc�cio 02 - Idade
//Crie uma classe chamada �Idade� Java que:
//A. Seja execut�vel. B. Solicite que o usu�rio digite o seu nome. C. 
//Em seguida, o programa dever� exibir a mensagem: �Ol�, Fulano! Qual o ano de seu nascimento?�. 
//D. Depois, o programa dever� exibir: �Em 2030 voc� ter� 25 anos� (sendo Fulano o nome digitado pelo 
//usu�rio e xx a idade
//do usu�rio). Exemplo:
//Qual � o seu nome?
//Maria
//Ol�, Maria! Qual o ano de seu nascimento?