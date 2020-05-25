
public class AlunoPos extends Aluno{
	protected Double notaMonografia;
	
	public AlunoPos(Integer ra, String nome, Double notaContinuada, Double notaSemestral, Double notaMonografia) {
	super(ra,nome,notaContinuada, notaSemestral);
	
	this.notaMonografia = notaMonografia;
	
	}
	
	@Override
	public Double calcularMedia() {
		Double mediaAlunoPos = (notaContinuada + notaSemestral + notaMonografia) /3;
		return mediaAlunoPos;
	}
	
	public Double getNotaMonografia() {
		return notaMonografia;
	}
	
	@Override
	public String toString() {
		
		return "\nNome: " + this.nome + "\nRA: " + this.ra + "\nNota Continuada: " + this.notaContinuada + 
				"\nNota Semestral: " + this.notaSemestral + "\nNota Monografia: "  + this.notaMonografia + "\nMédia: " + calcularMedia();
	}
	
}
