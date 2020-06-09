
public class Horista extends Funcionario {
	private Integer qtdHoras;
	private Double valorHora;
	
	public Horista(String cpf, String nome, Integer qtdHoras,Double valorHora) {
		super(cpf,nome);
		this.qtdHoras= qtdHoras;
		this.valorHora = valorHora;
	}
	
	// implementacao metodo abstrato
		@Override
		public Double calcSalario() {
			return qtdHoras * valorHora;
		}
		
		// to string 
		@Override
		public String toString() {
			
			return "\nHorista \n"+ super.toString()
			+ "\nQuantidade de Horas: " + qtdHoras + 
			"\nValor Hora: " + valorHora + 
			 "\nsalario: " + calcSalario();
		}
		
		public Integer getQtdHoras() {
			return qtdHoras;
		}
		public Double getValorHora() {
			return valorHora;
		}
		
}
