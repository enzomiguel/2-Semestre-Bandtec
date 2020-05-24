
public class Coordenador extends Professor {
	
	protected Integer qtdHorasCoord;
	protected Double valorHoraCoord;
	protected String curso;
	
	
	public Coordenador(String nome, String curso, Integer codigo, Integer horas, Integer qtdHorasCoord, Double valorHoras, Double valorHoraCoord) {
        super(nome, codigo, horas, valorHoras);

        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
        this.curso = curso;
    }
	
	@Override
	public Double calcularSalario() {
		Double ganhoCodMes = qtdHorasCoord * valorHoraCoord * 4.5;
		ganhoCodMes += qtdHorasCoord * valorHoraCoord * 4.5;
		return ganhoCodMes ;
	}
	
	@Override
	public Integer getCodigo() {
		
		return super.getCodigo();
	}
	@Override
	public Integer getHoras() {
		// TODO Auto-generated method stub
		return super.getHoras();
	}
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}
	@Override
	public Double getValorHora() {
		// TODO Auto-generated method stub
		return super.getValorHora();
	}
	public String getCurso() {
		return curso;
	}
	public Integer getQtdHorasCoord() {
		return qtdHorasCoord;
	}
	public Double getValorHoraCoord() {
		return valorHoraCoord;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + this.nome + "\nC�digo: " + this.codigo + "\nHoras: " + this.qtdHorasCoord +
				"\nHoras P: " + this.horas + "\nValor Hora: " + this.valorHoraCoord + 
				"\nValor Hora P: " + this.valorHora + 
				"\nS�lario do Coordenador: " + calcularSalario() ;
	}
}

//2. Criar a classe Coordenador, herdeiro de Professor, que representa um professor
//que, al�m de ministrar aulas, coordena um determinado curso e tem como
//atributos:
//a. qtdHorasCoord - Integer - quantidade de horas de coordena��o exercidas por
//semana. b. valorHoraCoord - Double - valor da hora de coordena��o, em reais
//c. curso - String - curso que coordena. Deve ter o construtor que inicializa os
//atributos e os m�todos getters e setters. E deve reescrever o m�todo
//calculaSalario( ), que calcula o valor do ganho do coordenador no m�s
//(quantidade de horas aulas ministradas por semana vezes
//valor da hora aula vezes 4,5 + quantidade de horas de
//coordena��o por semana vezes valor da hora de coordena��o
//vezes 4,5). Reescreva tamb�m o m�todo
//toString( ), para retornar uma String com os valores dos atributos e o sal�rio
//de um coordenador.