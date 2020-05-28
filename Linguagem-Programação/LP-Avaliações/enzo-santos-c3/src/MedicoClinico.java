
public class MedicoClinico {
	protected Integer codigo;
	protected String nome;
	protected Integer qtdConsulta;
	protected Double valorConsulta;
	
	public MedicoClinico(Integer codigo, String nome, Integer qtdConsulta, Double valorConsulta) {
		this.codigo = codigo;
		this.nome = nome;
		this.qtdConsulta = qtdConsulta;
		this.valorConsulta = valorConsulta;
	
	}
	
	public Double calcularSalario() {
	
		return (this.qtdConsulta * this.valorConsulta) ;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public Integer getQtdConsulta() {
		return qtdConsulta;
	}
	public Double getValorConsulta() {
		return valorConsulta;
	}
	
	@Override
    public String toString() {
        return "\nNome: " + this.nome + "\nC�digo: " + this.codigo + "\nValor da Consulta: " + this.valorConsulta + "\nQuantidade de Consulta: " + this.qtdConsulta + "\nS�lario: " + calcularSalario() ;
    }
}


//Crie um projeto Java, ele deve conter:
//
//a) Uma classe chamado "MedicoClinico", ela deve conter:
//
//    I. Atributos:
//
//        codigo - Integer - representa o c�digo do medico(CRM).
//
//        nome - String - representa o nome do m�dico.
//
//        qtdConsulta - Integer - representa o n�mero de consultas realizadas.
//
//        valorConsulta - Double - representa o valor da consulta.
//
//    II. M�todos:
//
//        calcularSalario() - retorna um Double - esse m�todo deve retornar a quantidade de consultas realizadas vezes o valor da consulta.
//
//        toString() - retorna uma String - sobreescrita do m�todo "toString" para informar os valores do objeto, inclusive o sal�rio,
//        mas n�o precisa criar o atributo sal�rio.
//
//b) Uma classe chamada "MedicoCirurgiao", herdeira de "MedicoClinico", ela deve conter:
//
//    I. Atributos:
//
//        qtdCirurgia - Integer - representa a quantidade de cirurgias realizadas.
//
//        valorCirurgia - Double - representa o valor da cirurgia.
//
//    II. M�todos:
//
//        calcularSalario() - retorna um Double - esse m�todo deve ser sobreescrito, o calculo anterior permanece, por�m devemos acrescentar
// valores de cirurgia:
//
//          qtdConsulta vezes valorConsulta mais qtdCirurgia vezes valorCirurgia.
//
//        toString() - retorna uma String - sobreescrita do m�todo "toString" para informar os valores do objeto, inclusive o sal�rio.
//
//c) Uma classe chamada "App", ela deve ser execut�vel e dever�:
//
//    I. Ter no min�mo dois objetos do tipo "MedicoClinico".
//
//    II. Ter no min�mo dois objetos do tipo "MedicoCirurgiao".
//
//    III. Invocar e apresentar os dados e sal�rio de cada um deles.