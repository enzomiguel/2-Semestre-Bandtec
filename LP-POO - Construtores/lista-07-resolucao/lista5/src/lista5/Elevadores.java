package lista5;

public class Elevadores {
	
	// atributos
	Integer  peso = 0;
	Integer passageiro = 0;
	Integer soma = 0;
	
	public void entrarHomem() {
		
		peso += 90;
		passageiro ++;
		

		
	}
	
	public void entrarMulher() {
		
		peso +=65;
		//soma+=peso;
		passageiro ++;
		
	}
	
	public void entrarCrianca() {
		
		peso +=40;
		//soma+=peso;
		passageiro ++;
		
	}
	

}

//Crie uma JFrame que:
//a) Tenha os botões "Entrar homem", "Entrar mulher" e "Entrar criança" b) Abaixo dos botões, uma frase como esta:
//Total de passageiros no Elevador: 0
//Peso total no Elevador: 0kg
//c) Ao clicar em "Entrar homem", o peso do elevador aumenta em 90kg. Ao clicar em "Entrar
//mulher", o peso do elevador aumenta em 65kg. Ao clicar em "Entrar criança", o peso do
//elevador aumenta em 40kg. Independente do botão clicado, o total de passageiros aumenta
//em 1. d) Abaixo desses 3 botões e frases deve haver uma cópia dos mesmos componentes, porém
//cada grupo de componentes corresponde a um elevador diferente. 
//e) Para controlar a lógica do elevador em si (quantidade de pessoas, peso total, entrar
//homem, entrar mulher e entrar criança), crie uma classe chamada Elevador.