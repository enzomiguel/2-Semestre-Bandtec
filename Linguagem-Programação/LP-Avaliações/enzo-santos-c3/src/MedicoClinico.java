
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
        return "\nNome: " + this.nome + "\nCódigo: " + this.codigo + "\nValor da Consulta: " + this.valorConsulta + "\nQuantidade de Consulta: " + this.qtdConsulta + "\nSálario: " + calcularSalario() ;
    }
}


//Crie um projeto Java, ele deve conter:
//
//a) Uma classe chamado "MedicoClinico", ela deve conter:
//
//    I. Atributos:
//
//        codigo - Integer - representa o código do medico(CRM).
//
//        nome - String - representa o nome do médico.
//
//        qtdConsulta - Integer - representa o número de consultas realizadas.
//
//        valorConsulta - Double - representa o valor da consulta.
//
//    II. Métodos:
//
//        calcularSalario() - retorna um Double - esse método deve retornar a quantidade de consultas realizadas vezes o valor da consulta.
//
//        toString() - retorna uma String - sobreescrita do método "toString" para informar os valores do objeto, inclusive o salário,
//        mas não precisa criar o atributo salário.
//
//b) Uma classe chamada "MedicoCirurgiao", herdeira de "MedicoClinico", ela deve conter:
//
//    I. Atributos:
//
//        qtdCirurgia - Integer - representa a quantidade de cirurgias realizadas.
//
//        valorCirurgia - Double - representa o valor da cirurgia.
//
//    II. Métodos:
//
//        calcularSalario() - retorna um Double - esse método deve ser sobreescrito, o calculo anterior permanece, porém devemos acrescentar
// valores de cirurgia:
//
//          qtdConsulta vezes valorConsulta mais qtdCirurgia vezes valorCirurgia.
//
//        toString() - retorna uma String - sobreescrita do método "toString" para informar os valores do objeto, inclusive o salário.
//
//c) Uma classe chamada "App", ela deve ser executável e deverá:
//
//    I. Ter no minímo dois objetos do tipo "MedicoClinico".
//
//    II. Ter no minímo dois objetos do tipo "MedicoCirurgiao".
//
//    III. Invocar e apresentar os dados e salário de cada um deles.