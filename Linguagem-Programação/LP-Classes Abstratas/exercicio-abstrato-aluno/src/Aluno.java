
public abstract class Aluno {
	
	private String nome;
	private Integer ra;
	
	public Aluno(String nome, Integer ra) {
		this.nome= nome;
		this.ra = ra;
	}
	
	public abstract Double calculaMedia();
	
	@Override
	public String toString() {
		return "\nNome: " + nome + "\nRA: " + ra + "\nMédia: " + calculaMedia();
	}
}

//1. Uma classe abstrata Aluno, com as características e comportamentos a seguir:
//Atributos:
//➢ nome - String
//➢ ra - Integer
//Métodos:
//➢ calculaMedia - abstrato e retorna um Double
//➢ toString - retorna uma string contendo as informações do objeto
//inclusive a média.