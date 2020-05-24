package lista5;

public class Lutadores {

	// atributo
	
	Integer vida = 100;
	
	//metodos
	
	public void apanhar() {
		
		
		if(vida > 0 ) {
			vida -= 10;
		}
		
}
	
	public void concentrarForca() {
		if(vida > 0)
		vida += 2;
		
	}

	public Integer getVida() {
		return vida;
	}
	
	
	
}

//a) Tenha 2 progress bars, que representam a "vida" de 2 lutadores num jogo de luta. Ambas
//devem estar com o valor 100 logo de cara
//b) Abaixo de cada progress bar devem haver 2 botões lado a lado: "Apanhar" e "Concentrar
//Força" c) Ao clicar no "Apanhar", o valor da progress bar reduz em 10. Caso ele chegue em 0, exibir
//abaixo da progress bar o texto "Lutador X perdeu" (onde X é 1 ou 2, dependendo do lutador
//que perdeu)
//d) Ao clicar no "Concetrar Força", o valor da progress bar aumenta em 2. Porém, esse botão
//não deve fazer nada caso o lutador já esteja sem "vida" e) Nenhum botão abaixo das progress bar deve funcionar após um dos lutadores já ter
//perdido
//f) Crie uma classe Lutador que deve possuir o atributo de "vida" e os métodos de "apanhar" e
//"concentrarForca" e quaisquer outros que julgar necessários