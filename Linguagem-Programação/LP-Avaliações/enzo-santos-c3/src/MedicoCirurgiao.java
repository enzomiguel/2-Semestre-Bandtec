
public class MedicoCirurgiao extends MedicoClinico {
	
	protected Integer qtdCirurgia;
	protected Double valorCirurgia;
	
	public MedicoCirurgiao(Integer codigo, String nome, Integer qtdConsulta, Double valorConsulta,Integer qtdCirurgia, Double valorCirurgia) {
		super(codigo,nome,qtdConsulta,valorConsulta);
		
		this.qtdCirurgia = qtdCirurgia;
		this.valorCirurgia = valorCirurgia;
	}
	
	public Integer getQtdCirurgia() {
		return qtdCirurgia;
	}
	public Double getValorCirurgia() {
		return valorCirurgia;
	}
	
	@Override
	public Double calcularSalario() {
		
		return (this.qtdConsulta * this.valorConsulta + this.qtdCirurgia * this.valorCirurgia);
	}
	
	@Override
    public String toString() {
        return "\nNome: " + this.nome + "\nC�digo: " + this.codigo + "\nValor da Consulta: " + this.valorConsulta + "\nQuantidade de Consulta: "
    + this.qtdConsulta + "\nQuantidade de Cirurgia: " + this.qtdCirurgia + "\nValor da Cirugia: " + this.valorCirurgia + "\nS�lario: " + calcularSalario() ;
    }
}

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
