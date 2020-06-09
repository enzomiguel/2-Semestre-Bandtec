
public class Vendedor extends Funcionario {
	
	private Double vendas;
	private Double taxa;
	
	public Vendedor(String cpf, String nome, Double vendas, Double taxa) {
		super(cpf,nome);
		this.taxa= taxa;
		this.vendas= vendas;
	}
	
	// implementacao metodo abstrato
	@Override
	public Double calcSalario() {
		return vendas * taxa;
	}
	
	// to string 
	@Override
	public String toString() {
		
		return "\nVendedor \n"+ super.toString()
		+ "\nVendas: " + vendas + 
		"\nTaxa: " + taxa + 
		 "\nSalário: " + calcSalario();
	}
	
	public Double getTaxa() {
		return taxa;
	}
	public Double getVendas() {
		return vendas;
	}
}
