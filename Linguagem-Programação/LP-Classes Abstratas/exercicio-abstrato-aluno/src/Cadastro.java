import java.util.ArrayList;
import java.util.List;
public class Cadastro {
	
	private List<Aluno> lista;
	
	public Cadastro() {
		
		lista = new ArrayList<Aluno>();
	}
	
	public void adicionaAluno(Aluno a) {
		lista.add(a);
	}
	
	public void exibeAlunosFundametal() {
		System.out.println("\n========== Lista Alunos Fundamental ========== ");
		for(Aluno a : lista) {
			if(a instanceof  AlunoFundamental) {
				System.out.println(a);
			}
		}
	}
	
	public void exibeAlunosGraduacao() {
		System.out.println("\n========== Lista Alunos Graduação ========== ");
		for(Aluno a : lista) {
			if(a instanceof  AlunoGraduacao) {
				System.out.println(a);
			}
		}
	}
	
	public void exibeAlunosPos() {
		System.out.println("\n========== Lista Alunos Pós ========== ");
		for(Aluno a : lista) {
			if(a instanceof AlunoPos) {
				System.out.println(a);
			}
		}
	}
}

//5. Uma classe Cadastro:
//Métodos:
//➢ adicionaAluno - recebe e cadastra um objeto aluno.
//➢ exibeAlunosFundametal - exibe somente os dados de alunos de ensino fundamental. 
//➢ exibeAlunosGraduacao- exibe somente os dados de alunos de graduação. 
//➢ exibeAlunosPos- exibe somente os dados de alunos de pós graduação