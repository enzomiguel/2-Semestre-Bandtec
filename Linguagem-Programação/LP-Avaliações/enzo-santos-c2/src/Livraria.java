import java.util.ArrayList;
import java.util.List;

public class Livraria {
	private String nome;
	private Double caixa;
	private List<Livro> listaDeLivros;
	
	public Livraria(String nome,Double caixa) {
		this.caixa = caixa;
		this.nome = nome;
		this.listaDeLivros = new ArrayList<Livro>();
	}
	
	
	public void comprarRemessa(Livro livro) {
		double totalCompra = livro.getPreco() * livro.getQuantidade();
		if(totalCompra > this.caixa) {
			System.out.println("\nFundos insuficientes para adquirir remessa do livro: " + livro.getNome());
		}else {
			this.listaDeLivros.add(livro);
			this.caixa -= totalCompra;
		}
	}
	
	public void exibirEstoque() {
		if(listaDeLivros.size() <= 0) {
			System.out.println("Voc� n�o possu� livros em seu estoque.");
		}else {
			System.out.println("\n\n----SEUS LIVROS S�O------");
			for (int i = 0; i< listaDeLivros.size(); i++) {
				System.out.println("============================");
				listaDeLivros.get(i).exibeDados();
				System.out.println("============================");
			}
		}
	}
	
	public void exibeCaixa() {
		System.out.println("\nNome da livraria: " + nome);
		System.out.printf("O caixa atual � de: %.2f" , caixa);
		
	}
	
	public Double getCaixa() {
		return caixa;
	}
	public List<Livro> getListaDeLivros() {
		return listaDeLivros;
	}
	public String getNome() {
		return nome;
	}
	

}
