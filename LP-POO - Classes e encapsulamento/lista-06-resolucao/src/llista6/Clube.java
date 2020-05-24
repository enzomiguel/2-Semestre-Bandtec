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

//Exercício 01 - Clube
//Crie uma JFrame que controle a campanha de dois times de futebol:
//a) Tenha os botões "Registrar vitória", "Registrar empate" e "Registrar derrota" b) Abaixo dos botões, uma frase como esta:
//Vitórias: 0 - Derrotas: 0 - Empates: 0
//Pontuação: 0 pontos
//c) Ao clicar em "Registrar vitória", as vitórias aumentam em 1 e os pontos em 3. Ao clicar em
//"Registrar empate", os empates aumentam em 1 e os pontos em 1. Ao clicar em "Registrar
//derrota", as derrotas aumentam em 1. d) Abaixo desses 3 botões e frases deve haver uma cópia dos mesmos componentes, porém
//cada grupo de componentes corresponde a um time diferente
//e) Para controlar a lógica do time em si (quantidade de vitórias, empates, derrotas e pontos), crie uma classe chamada Clube