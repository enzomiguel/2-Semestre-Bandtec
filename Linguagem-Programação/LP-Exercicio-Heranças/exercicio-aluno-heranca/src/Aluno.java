
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
				"\nNota Semestral: " + this.notaSemestral + "\nM�dia: " + calcularMedia();
	}
}

//1. Crie um projeto chamado projeto-aluno-heranca. a. Crie uma classe chamada Aluno
//i. Atributos de Aluno (devem ser encapsulados)
//1- ra (n�mero inteiro)
//2- nome (texto)
//3- notaContinuada (n�mero real) � representa a m�dia das
//avali��es continuadas que o aluno realizou
//4- notaSemestral (n�mero real) � representa a nota da
//avalia��o semestral que o aluno realizou
//ii. Implemente o construtor dessa classe que recebe todos os
//valores dos atributos e os inicializa
//iii. M�todos de Aluno:
//1- calculaMedia - n�o recebe argumentos e retorna a m�dia
//do aluno que � calculada assim: notaContinuada * 0.4 +
//notaSemestral * 0.6
//2- toString � n�o recebe argumentos e retorna uma String
//com os dados dos atributos do aluno, al�m da sua m�dia. Este m�todo deve ser declarado com @Override.
//b. Crie uma classe chamada ProgramaAlunoHeranca, crie um m�todo
//main e dentro dele:
//i. Crie um objeto da classe Aluno.
//ii. Exiba uma mensagem � O aluno Fulano tem m�dia X�, sendo
//Fulano o nome do aluno e X a sua m�dia.
//iii. Exiba o objeto (para que seja chamado o toString()).
//iv. Crie um segundo objeto da classe Aluno. Repita os itens II e III
//para o 2� objeto.

//c. Ainda nesse mesmo projeto, crie uma classe AlunoPos, como herdeira
//da classe Aluno. A classe AlunoPos representa um aluno de p�s
//gradua��o.
//i. Atributo espec�fico de AlunoPos:
//1- notaMonografia (n�mero real) � representa a nota da
//monografia que o aluno deve apresentar no semestre.
//ii. Implemente o construtor dessa classe que recebe todos os
//valores dos atributos e os inicializa. (n�o se esque�a que o
//AlunoPos herda atributos da classe Aluno). No c�digo desse
//Linguagem de Programa��o
//2
//construtor, chame o construtor da superclasse para inicializar os
//atributos definidos na superclasse.


//iii. M�todos de AlunoPos:
//1- calculaMedia � o m�todo da superclasse deve ser
//sobrescrito para que calcule a m�dia do AlunoPos de forma
//correta. Este m�todo n�o recebe argumentos e retorna a
//m�dia do AlunoPos, que � calculada assim:
//(notaContinuada + notaSemestral + notaMonografia) / 3
//2- toString � n�o recebe argumentos e retorna uma String
//com os dados dos atributos do AlunoPos, al�m da sua
//m�dia. Este m�todo tamb�m deve ser declarado com
//@Override e pode chamar o m�todo toString da
//superclasse para obter os dados dos atributos definidos l�. d. Na classe ProgramaAlunoHeranca, no m�todo main:
//i. Crie um objeto da classe AlunoPos, chamando o construtor que
//inicializa todos os atributos.
//ii. Exiba uma mensagem � O aluno de p�s gradua��o Fulano tem
//m�dia X�, sendo Fulano o nome do aluno e X a sua m�dia.
//iii. Exiba o objeto (para que seja chamado o toString())


















