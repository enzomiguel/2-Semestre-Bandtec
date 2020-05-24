package llista6;

public class Eleicao {
	//atributos
	private Integer votos1 = 0,votos2 = 0, totalVotos = 0;
	private String vencedor ="";
	
	//metodos
	public void votarCandidato1() {
		
		votos1++;
		
	}
	
	public void votarCandidato2() {
		votos2++;
		
	}

	public void encerrarVotacao() {
		if(votos1 > votos2) {
			vencedor = "Candidato 1 venceu!";
		}
		else {
			vencedor = "Candidato 2 venceu!";
		}
	}

	public void somaTotal() {
		totalVotos = votos1 +votos2;
	}
	
	
	public Integer getCandidato1() {
		return votos1;
		
	}
	
	public void setCandidato1(Integer votos1) {
		this.votos1 = votos1;
	}
	
	public Integer getCandidato2() {
		return votos2;
	}
	
	public void setCandidato2(Integer votos2) {
		this.votos2 = votos2;
	}
	public Integer getTotalVotos() {
		return totalVotos;
	}

	public void setTotalVotos(Integer totalVotos) {
		this.totalVotos = totalVotos;
	}
	
	public String getVencedor() {
		return vencedor;
	}
	
	public void setVencedor(String vencedor) {
		this.vencedor = vencedor;
		
	}
}

//Exerc�cio 03 - Elei��o
//Uma vota��o para representante da sala foi iniciada, e voc� ficou como respons�vel para
//criar uma aplica��o que funcione como uma urna eletr�nica, sendo assim, crie uma JFrame
//que:
//a) Tenha tr�s bot�es:
//a) Votar no candidato 1. b) Votar no candidato 2. c) Encerrar elei��o. b) Tenha quatro �labels� principais:
//a) Total de votos para o primeiro candidato. b) Total de votos para o segundo candidato
//c) Total de votos realizados. d) Resultado final.
//c) Ao clicar em votar no candidato 1 ou votar no candidato 2, as labels total de votos
//candidato 1, total de votos candidatos 2 e total de votos dever�o ser atualizadas. 
//d) Ao clicar em encerrar a elei��o, os bot�es de voto n�o dever�o computar mais e a label
//resultado dever� apresentar quem venceu. Se houver empate informe o usu�rio. 
//e) Crie uma classe chamada UrnaEltronica para gerenciar os votos e informa��es.