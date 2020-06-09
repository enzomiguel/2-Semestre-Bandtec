
public class AlunoGraduacao extends Aluno {
	
	private Double nota1,nota2;
	
	public AlunoGraduacao(String nome, Integer ra, Double nota1, Double nota2) {
		super(nome,ra);
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	@Override
	public Double calculaMedia() {
		return (nota1 * 0.4) + (nota2 * 0.6);
	}
	
	@Override
	public String toString() {
		return "\nAluno Graduação " + super.toString() +"\nNota1: " + nota1 +
				"\nNota2: " + nota2;
	}
}

//
//. Uma classe AlunoGraduacao, com as características e comportamentos a seguir:
//Atributos:
//➢ nota1 - Double
//➢ nota2 - Double
//Métodos:
//➢ calculaMedia - retorna um Double - média ponderada dos atributos
//listados acima(nota1 * 0,4 + nota2 * 0,6)
//➢ toString - retorna uma string contendo as informações do objeto