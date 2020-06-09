
public class AlunoFundamental extends Aluno {
	
	private Double nota1,nota2,nota3,nota4;
	
	public AlunoFundamental(String nome, Integer ra,Double nota1,Double nota2, Double nota3, Double nota4 ) {
		super(nome,ra);
		this.nota1 = nota1;
		this.nota2= nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}
	
	@Override
	public Double calculaMedia() {
		return nota1+nota2+nota3+nota4 / 4;
	}
	
	@Override
	public String toString() {
		return "\nAluno Fundamental" + super.toString() + "\nNota1: " + nota1 +
				"\nNota2: " + nota2 + "\nNota3: " + nota3 + "\nNota4: " + nota4;
	}
}

//. Uma classe AlunoFundamental, com as características e comportamentos a seguir:
//Atributos:
//➢ nota1 - Double
//➢ nota2 - Double
//➢ nota3 - Double
//➢ nota4 - Double
//Métodos
//➢ calculaMedia - retorna um Double - média aritmética dos atributos
//listados acima
//➢ toString - retorna uma string contendo as informações do objeto.