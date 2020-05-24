
public class Historico {
	
	//atributos
	private String operacao;
	private Integer dia , mes , ano ;
	private Double valor;
	
	
	public Historico(String operacao, Integer dia, Integer mes, Integer ano, Double valor) {
		this.ano = ano;
		this.dia= dia;
		this.mes = mes;
		this.operacao = operacao;
		this.valor = valor;
	}
	
	//getter
	public Integer getAno() {
		return ano;
	}
	public Integer getDia() {
		return dia;
	}
	public Integer getMes() {
		return mes;
	}
	public String getOperacao() {
		return operacao;
	}
	public Double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nTipo de Operação: " + operacao + "\n Dia: " + dia + "\n Mes: " + mes +"\nValor: " + valor ;
	}
}
