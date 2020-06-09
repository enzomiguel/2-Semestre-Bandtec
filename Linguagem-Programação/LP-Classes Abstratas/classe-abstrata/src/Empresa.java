import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private  String nome;
	private List<Funcionario> lista;
	
	public Empresa(String nome) {
		this.nome = nome;
		lista = new ArrayList<Funcionario>();
	}
	
	public void adicionarFunc(Funcionario f) {
		lista.add(f);
	}
	
	public void exibeTodos() {
		System.out.println("\nLista dos Funcionarios: ");
		for(Funcionario f : lista) {
			System.out.println(f);
		}
	}
	
	public void exibeVendedores() {
		System.out.println("\nLista de Vendedores: ");
		for(Funcionario f : lista) {
			if(f instanceof  Vendedor) {
				System.out.println(f);
			}
		}
	}
	
	public void exibeTotalSalario() {
		Double total = 0.0;
		for(Funcionario f : lista) {
			total += f.calcSalario();	
			}
		System.out.println("\nTotal de salário gastos: " + total);
	}
}
