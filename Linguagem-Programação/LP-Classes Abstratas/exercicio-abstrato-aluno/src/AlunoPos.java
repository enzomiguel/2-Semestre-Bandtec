
public class AlunoPos extends Aluno{
	
	private Double nota1,nota2;
	
	public AlunoPos(String nome,Integer ra,Double nota1, Double nota2) {
		super(nome,ra);
		this.nota1=nota1;
		this.nota2=nota2;
	}
	
	@Override
	public Double calculaMedia() {
		return nota1+nota2/2;
	}
	
	@Override
	public String toString() {
		return "\nAluno Pós" + super.toString() + "\nNota1: " + nota1 + "\nNota2: " + nota2;
	}
}

//4. Uma classe AlunoPos, com as características e comportamentos a seguir:
//Atributos:
//➢ nota1 - Double
//➢ nota2 - Double
//➢ notaMonografia - Double
//Métodos:
//➢ calculaMedia - retorna um Double - média aritmética dos atributos
//listados acima. ➢ toString - retorna uma string contendo as informações do objeto.