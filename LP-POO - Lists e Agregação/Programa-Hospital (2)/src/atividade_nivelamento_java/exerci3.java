package atividade_nivelamento_java;

import java.util.Scanner;

public class exerci3 {

		public static void main(String[] args) {
			
			int limite_peso, limite_pessoas, pri_pessoa, se_pessoa, ter_pessoa;
			
			
			Scanner leitorlimite_peso =  new Scanner(System.in);
			Scanner leitorlimite_pessoas =  new Scanner(System.in);
			Scanner leitorpri_pessoa =  new Scanner(System.in);
			Scanner leitorse_pessoa =  new Scanner(System.in);
			Scanner leitorter_pessoa =  new Scanner(System.in);
			
			
			System.out.println("Qual o limite de peso de um elevador?:");
			limite_peso = leitorlimite_peso.nextInt();
			System.out.print("Qual limite de pessoas em um elevado?:");
			limite_pessoas = leitorlimite_pessoas.nextInt();
			System.out.println("Qual  o peso da 1ª pessoa que entrou no elevador?:");
			pri_pessoa = leitorpri_pessoa.nextInt();
			System.out.println("Qual o peso da 2ª pessoa que entrou no elevador?:");
			se_pessoa = leitorse_pessoa.nextInt();
			System.out.println("Qual o peso da 3ª pessoa que entrou no elevador?:");
			ter_pessoa = leitorter_pessoa.nextInt();
			int soma = pri_pessoa + se_pessoa + ter_pessoa ;
			System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + limite_pessoas+ " pessoas." 
					+ "O peso total no elevador é de " + soma + " sendo que ele suporta " + limite_peso );
			
		}
}

//Exercício 03 - Elevador
//Crie uma classe chamada “Elevador” Java que:
//A. Seja executável. B. Solicite ao usuário o limite de peso de um elevador (número real).
//C. Solicite ao usuário o limite de pessoas em um elevador (número inteiro).
//D. Solicite ao usuário o peso da 1ª pessoa que entrou no elevador (número real). 
//E. Solicite ao usuário o peso da 2ª pessoa que entrou no elevador (número real). 
//F. Solicite ao usuário o peso da 3ª pessoa que entrou no elevador (número real). 
//Ao final, exiba uma frase assim: "Entraram 3 pessoas no elevador, no qual cabem X pessoas. "
	//	+ "O peso total no elevador é de Y, sendo que ele suporta Z". 
	//	(onde X é o 2º valor lido no programa, Z o 1º e Y é a soma dos pesos das 3 pessoas)