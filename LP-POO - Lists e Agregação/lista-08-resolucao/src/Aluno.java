import java.util.ArrayList;
import java.util.List;

public class Aluno {


	private Integer ra;
	private String nome;
	private List<Disciplina> registro;

	public Aluno(String nome,Integer ra) {
		this.nome = nome;
		this.ra = ra;
		this.registro = new ArrayList<Disciplina>();
	}
	

	public void exibirBoletim() {
		System.out.println("\n-------SITUAÇÃO DO ALUNO------");
		System.out.println("\nNome do Aluno: "+ getNome()+
		"\nRA: " + getRa());
		System.out.println(getRegistro());
		
	}
	
	public void adiciona(Disciplina disciplina) {
		this.registro.add(disciplina);
	}

	public String getNome() {
		return nome;
	}
	public Integer getRa() {
		return ra;
	}
	public List<Disciplina> getRegistro() {
		return registro;
	}
}
