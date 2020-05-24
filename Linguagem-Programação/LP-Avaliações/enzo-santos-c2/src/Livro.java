
public class Livro {
	private String nome,autor;
	private Double preco;
	private Integer quantidade;
	
	public Livro(String nome, String autor, Double preco,Integer quantidade) {
		this.autor = autor;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public void exibeDados() {
		System.out.println("\nNome do livro: " + getNome() + 
				"\nAutor: " + getAutor() +
				"\nPre�o do livro: " + getPreco() +
				"\nQuantidade de livros: " + getQuantidade());
	}
	
	public String getAutor() {
		return autor;
	}
	public String getNome() {
		return nome;
	}
	public Double getPreco() {
		return preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	
	
}



//Escreva um programa em Java o qual:
//
//a ) Possua tr�s classes: Livro, Livraria e ProgramaLivraria.
//
//b ) A classe Livro dever� conter os seguintes atributos:
//
//nome
//autor
//preco
//quantidade
//c ) A classe Livro dever� conter um m�todo chamado exibeDados(), 
//que imprime de maneira organizada no console os dados do livro.
//
//d ) A classe Livraria dever� conter os seguintes atributos:
//
//nome
//caixa
//listaDeLivros
//e ) A classe Livraria devera ter um m�todo chamado comprarRemessa
//(Livro livro), que verifica se o valor total da compra n�o ultrapassa o valor total do caixa, caso n�o ultrapasse,
//adiciona a remessa para seu estoque, caso contr�rio, exibe a seguinte mensagem:
//	"Fundos insuficientes para adquirir remessa do livro: NOME", onde �NOME� � o nome da remessa de livros recebida.
//
//f ) A classe Livraria dever� ter um m�todo chamado exibeEstoque(), que verifica se h� livros em seu estoque e
//caso tenha exibe as informa��es de cada livro de maneira organizada, caso contr�rio, exibe a seguinte
//mensagem: "Voc� n�o possu� livros em seu estoque."
//
//h ) A classe Livraria dever� conter um m�todo chamado exibeCaixa()  que informa ao usu�rio a seguinte mensagem:
//	�O caixa atual � de: CAIXA�, onde CAIXA dever� ser o valor dispon�vel em caixa arrendodado para 2 casas decimais.
//
//i ) Crie um objeto do tipo Livraria na classe programaLivraria.
//
//j ) Crie alguns objetos do tipo Livro na classe programaLivraria.
//
//k ) Use os m�todos criados na classe Livraria para simular os diferentes cen�rios.

