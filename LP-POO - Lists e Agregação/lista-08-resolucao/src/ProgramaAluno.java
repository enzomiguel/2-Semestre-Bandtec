public class ProgramaAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Enzo",100);
		Aluno a2 = new Aluno("Miguel", 101);
		
		Disciplina disciplina = new Disciplina("Linguagem de Programação", 8.0, 7.0, 16);
		Disciplina disciplina2 = new Disciplina("Estrutura de dados", 5.0, 7.0, 5);
		
		a1.adiciona(disciplina);
		a2.adiciona(disciplina2);
		
		a1.exibirBoletim();
		a2.exibirBoletim();
	}
}
