package llista6;

public class Clube {
	
	//atributos
	Integer quantidadeVitoria = 0;
	Integer pontos = 0;
	Integer empate = 0, derrota = 0;
	
	
	//metodos
	
	void registrarVitoria() {
		
		quantidadeVitoria ++;
		pontos +=3;
		
	}
	
	void registrarEmpate() {
		
		empate ++;
		pontos++;
	}
	
	void registrarDerrota() {
		
		derrota ++;
	}

}

//Exerc�cio 01 - Clube
//Crie uma JFrame que controle a campanha de dois times de futebol:
//a) Tenha os bot�es "Registrar vit�ria", "Registrar empate" e "Registrar derrota" b) Abaixo dos bot�es, uma frase como esta:
//Vit�rias: 0 - Derrotas: 0 - Empates: 0
//Pontua��o: 0 pontos
//c) Ao clicar em "Registrar vit�ria", as vit�rias aumentam em 1 e os pontos em 3. Ao clicar em
//"Registrar empate", os empates aumentam em 1 e os pontos em 1. Ao clicar em "Registrar
//derrota", as derrotas aumentam em 1. d) Abaixo desses 3 bot�es e frases deve haver uma c�pia dos mesmos componentes, por�m
//cada grupo de componentes corresponde a um time diferente
//e) Para controlar a l�gica do time em si (quantidade de vit�rias, empates, derrotas e pontos), crie uma classe chamada Clube