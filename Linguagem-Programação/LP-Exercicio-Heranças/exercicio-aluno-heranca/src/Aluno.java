
public class Aluno {
	protected Integer ra;
	protected String nome;
	protected Double notaContinuada, notaSemestral;
	
	public Aluno(Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
		this.nome = nome;
		this.ra = ra;
		this.notaContinuada = notaContinuada;
		this.notaSemestral = notaSemestral;
	}
	
	public Double calcularMedia() {
		Double mediaAluno = this.notaContinuada * 0.4 + this.notaSemestral * 0.6;
		return mediaAluno;
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
	public Integer getRa() {
		return ra;
	}
	
	@Override
	public String toString() {
		
		return "\nNome: " + this.nome + "\nRA: " + this.ra + "\nNota Continuada: " + this.notaContinuada + 
				"\nNota Semestral: " + this.notaSemestral + "\nMédia: " + calcularMedia();
	}
}

//1. Crie um projeto chamado projeto-aluno-heranca. a. Crie uma classe chamada Aluno
//i. Atributos de Aluno (devem ser encapsulados)
//1- ra (número inteiro)
//2- nome (texto)
//3- notaContinuada (número real) – representa a média das
//avalições continuadas que o aluno realizou
//4- notaSemestral (número real) – representa a nota da
//avaliação semestral que o aluno realizou
//ii. Implemente o construtor dessa classe que recebe todos os
//valores dos atributos e os inicializa
//iii. Métodos de Aluno:
//1- calculaMedia - não recebe argumentos e retorna a média
//do aluno que é calculada assim: notaContinuada * 0.4 +
//notaSemestral * 0.6
//2- toString – não recebe argumentos e retorna uma String
//com os dados dos atributos do aluno, além da sua média. Este método deve ser declarado com @Override.
//b. Crie uma classe chamada ProgramaAlunoHeranca, crie um método
//main e dentro dele:
//i. Crie um objeto da classe Aluno.
//ii. Exiba uma mensagem “ O aluno Fulano tem média X”, sendo
//Fulano o nome do aluno e X a sua média.
//iii. Exiba o objeto (para que seja chamado o toString()).
//iv. Crie um segundo objeto da classe Aluno. Repita os itens II e III
//para o 2º objeto.

//c. Ainda nesse mesmo projeto, crie uma classe AlunoPos, como herdeira
//da classe Aluno. A classe AlunoPos representa um aluno de pós
//graduação.
//i. Atributo específico de AlunoPos:
//1- notaMonografia (número real) – representa a nota da
//monografia que o aluno deve apresentar no semestre.
//ii. Implemente o construtor dessa classe que recebe todos os
//valores dos atributos e os inicializa. (não se esqueça que o
//AlunoPos herda atributos da classe Aluno). No código desse
//Linguagem de Programação
//2
//construtor, chame o construtor da superclasse para inicializar os
//atributos definidos na superclasse.


//iii. Métodos de AlunoPos:
//1- calculaMedia – o método da superclasse deve ser
//sobrescrito para que calcule a média do AlunoPos de forma
//correta. Este método não recebe argumentos e retorna a
//média do AlunoPos, que é calculada assim:
//(notaContinuada + notaSemestral + notaMonografia) / 3
//2- toString – não recebe argumentos e retorna uma String
//com os dados dos atributos do AlunoPos, além da sua
//média. Este método também deve ser declarado com
//@Override e pode chamar o método toString da
//superclasse para obter os dados dos atributos definidos lá. d. Na classe ProgramaAlunoHeranca, no método main:
//i. Crie um objeto da classe AlunoPos, chamando o construtor que
//inicializa todos os atributos.
//ii. Exiba uma mensagem “ O aluno de pós graduação Fulano tem
//média X”, sendo Fulano o nome do aluno e X a sua média.
//iii. Exiba o objeto (para que seja chamado o toString())


















