
public class App {
	public static void main(String[] args) {
		
		AlunoFundamental af = new AlunoFundamental("Henrique Carlos",119223,5.0,4.5,6.0,7.0);
		AlunoGraduacao ag = new AlunoGraduacao("Amanda Santos",119234,8.0,7.5);
		AlunoPos ap = new AlunoPos("José Pedro",119245,9.5,8.5);
		AlunoPos ap2 = new AlunoPos("Debora Gomes",119287,8.6,7.0);
		
		System.out.println(af);
		System.out.println(ag);
		System.out.println(ap);
		
		Cadastro cad = new Cadastro();
		cad.adicionaAluno(ap);
		cad.adicionaAluno(ag);
		cad.adicionaAluno(af);
		cad.adicionaAluno(ap2);
		
		cad.exibeAlunosFundametal();
		cad.exibeAlunosGraduacao();
		cad.exibeAlunosPos();
	}
}

//Crie uma classe App, dentro do método main, crie objetos das classes
//AlunoFundamental, AlunoGraduacao, AlunoPos e atribua valores para os seus
//atributos e exiba os dados dos objetos, inclusive a média, usando o toString implícito.
//Logo após crie um objeto do tipo cadastro e adicione os objetos criados acima, em
//seguida, invoque os métodos de exibição criados no item 5.