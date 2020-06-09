
public abstract class Funcionario {
	
	private String cpf;
	private String nome;
	
	public Funcionario(String cpf, String nome) {
	this.cpf= cpf;
	this.nome= nome;
	}
	
	// metodo abstrato(assinatura do metodo)
	public abstract Double calcSalario();
	
	@Override
	public String toString() {
		
		return "Funcionario \n"+ "\nCPF: " + cpf + "\nNome: " + nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
}
