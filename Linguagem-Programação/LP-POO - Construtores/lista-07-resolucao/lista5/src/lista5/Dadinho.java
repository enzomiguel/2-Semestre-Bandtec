package lista5;

import java.util.Random;

public class Dadinho {
	
	//atributo
	Integer numero,vitorias = 0;
	
	// random e uma classe propria do java
	Random aleatorio = new Random();
	
	//metodo (comportamento)
	public void sortearDadinho() {
		
		// dentro do parentes eu vou colocar o intervalo de numeros q quero sortear
		numero = aleatorio.nextInt(6)+ 1;
		
	}

}

//Crie uma JFrame que:
//a) Tenha 1 bot�o "Sortear dadinhos" b) Ao clicar nele, devem ser sorteados 2 n�meros entre 1 e 6
//c) Cada n�mero deve aparecer uma Label diferente como neste exemplo: "Dadinho 1: 5" d) 
//Abaixo dos valores sorteados, deve aparecer uma frase como esta "O Dadinho X venceu" ou "Empate" e) 
//Crie uma classe Dadinho que deve ser respons�vel por sortear um valor e disponibilizar o
//valor sorteado
//
//Desafio:
//a) Melhore a tela da quest�o anterior de tal forma que, nela... b) Abaixo da frase de d),
//deve aparecer uma frase como esta "Vit�rias do Dadinho 1: X /
//Vit�rias do Dadinho 1: Y" (isso mesmo, a mesma frase com as vit�rias de ambos).
