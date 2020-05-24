import java.util.ArrayList;
import java.util.List;

public class Hospital {
	
	private String nome;
	private Integer quantidadeLeitos;
	private List<Paciente> listaDePacientes ;
	
	public Hospital(String nome, Integer quantidadeLeitos) {
		this.nome = nome;
		this.quantidadeLeitos = quantidadeLeitos;
		listaDePacientes = new ArrayList<Paciente>();
	}
	
	public void internarPaciente(Paciente paciente) {
		if(quantidadeLeitos >0 ) {
			listaDePacientes.add(paciente);
			quantidadeLeitos -= 1;
		}
		else {
			System.out.println("\n\nN�o foi poss�vel internar o paciente: " + paciente.getNome() + ",ser� necess�rio transferi-lo");
		}
	}
	
	public void exibeDadosPacientes() {
		if(listaDePacientes.size() <=0) {
			System.out.println("\nN�o h� pacientes internados.");
		}
		else {
			System.out.println("\nNome do Hospital: " + getNome()
					+ "\nQuantidade de Leitos: " + this.quantidadeLeitos);
			System.out.println(listaDePacientes);
		}
		
	}
	
	public void exibeLeitos() {
		
		System.out.println("\nQuantidade de leitos dispon�veis: " + getQuantidadeLeitos());
	}
	
	
	public List<Paciente> getListaDePacientes() {
		return listaDePacientes;
	}
	public String getNome() {
		return nome;
	}
	public Integer getQuantidadeLeitos() {
		return quantidadeLeitos;
	}
	
	
}
