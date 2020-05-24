package atividade;

import java.util.Scanner;

public class Votacao {
	public static void main(String[] args) {
		
		
		Integer voto;
		Integer mussarela = 0;
		Integer calabresa = 0;
		Integer quatroQueijo = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("--------------SABORES-------------\n"
				+ "\n mussarela, deve-se digitar o valor 5\n"
				+ " calabresa, deve-se digitar o valor 25\n"
				+ " sabor quatro queijos, deve-se digitar o valor 50\n");
		
		for(Integer cont = 1; cont <=10; cont++) {
			System.out.println("Digite o número desejado: ");
			voto = leitor.nextInt();
			
			if(voto == 5) {
				mussarela ++;
				
			}
			if(voto == 25) {
				calabresa ++;
			}
			if(voto == 50) {
				quatroQueijo ++;
			}
		}

		if(mussarela > calabresa && mussarela > quatroQueijo) {
			System.out.println("Mussarela e o sabor favorito!");
		}
		 if(calabresa > mussarela && calabresa > quatroQueijo) {
			System.out.println("Calabresa e o sabor favorito!");
		}
		 if(quatroQueijo > mussarela && quatroQueijo > calabresa){
			System.out.println("Quatro queijo e o sabor favorito!");
		}
		 System.out.println("Mussarela teve " + mussarela + " votos\n" +
				 "Calabresa teve " +  calabresa + "\nQuatro queijo teve " + quatroQueijo + " votos");
	}

}


//Exercício 08 - Votação
//Foi feita uma pesquisa para saber qual o sabor de pizza favorito entre os alunos da
//Faculdade. Para votar no sabor mussarela, deve-se digitar o valor 5, 
//Para votar no sabor calabresa, deve-se digitar o valor 25, 
//Para votar no sabor quatro queijos, deve-se digitar o valor 50.
//Elabore um programa em Java que leia os votos de 10 alunos diferentes
//(sem usar vetor) e exiba:
//a) Quantos votos obteve cada sabor. b) Qual o sabor favorito segundo a pesquisa.

