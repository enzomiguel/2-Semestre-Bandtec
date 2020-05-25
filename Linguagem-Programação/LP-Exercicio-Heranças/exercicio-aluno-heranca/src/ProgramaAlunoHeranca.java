
public class ProgramaAlunoHeranca {
	public static void main(String[] args) {
		
		Aluno al1 = new Aluno(011,"Anderson Moraes",6.0,7.5);
		Aluno al2 = new Aluno(012,"Miguel Souza",5.0,6.0);
		
		AlunoPos alp = new AlunoPos(023,"Joseane Oliveira", 9.0,8.0,7.5);
		
		System.out.println("\nO Aluno " + al1.nome + " tem média de " + al1.calcularMedia());
		System.out.println(al1.toString());
		
		System.out.println("\nO Aluno " + al2.nome + " tem média de " + al2.calcularMedia());
		System.out.println(al2.toString());
		
		System.out.println("\nO Aluno de pós graduação " + alp.nome + " tem " + alp.calcularMedia());
		System.out.println(alp.toString());
		
	}
}
