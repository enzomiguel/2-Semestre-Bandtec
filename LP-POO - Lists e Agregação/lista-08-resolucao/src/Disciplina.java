
public class Disciplina {
	private String nome;
	private Double notaContinuada;
	private Double notaSemestral;
	private Integer quantFalta;
	private Boolean resultado ;
	private Double media;
	
	public Disciplina(String nome, Double notaContinuada,Double notaSemestral,Integer quantFalta) {
		this.nome = nome;
		this.notaContinuada = notaContinuada;
		this.notaSemestral = notaSemestral;
		this.quantFalta = quantFalta;
		this.media = notaContinuada *0.4 + notaSemestral *0.6;
		this.resultado = this.media >= 6 && this.quantFalta <= 15;
	}
	
	public Double getMedia() {
		return media;
	}
	public String getNome() {
		return nome;
	}
	public Double getNotaContinuada() {
		return notaContinuada;
	}
	public Double getNotaSemestral() {
		return notaSemestral;
	}
	public Integer getQuantFalta() {
		return quantFalta;
	}
	
	@Override
	public String toString() {
		return "\nNome da Disciplina: " + nome + 
				"\nNota Continuada: " + notaContinuada +"\nNota Integrada: " + notaSemestral +
				"\nQuantidade de Faltas: " + quantFalta + "\nMédia Final: " + getMedia() + "\nSituação: " + (resultado ? "Aprovado": "Reprovado") ;
	}
}
                                                                                                             //operador ternario              