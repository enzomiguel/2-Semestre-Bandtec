
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
				"\nPreço do livro: " + getPreco() +
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
//a ) Possua três classes: Livro, Livraria e ProgramaLivraria.
//
//b ) A classe Livro deverá conter os seguintes atributos:
//
//nome
//autor
//preco
//quantidade
//c ) A classe Livro deverá conter um método chamado exibeDados(), 
//que imprime de maneira organizada no console os dados do livro.
//
//d ) A classe Livraria deverá conter os seguintes atributos:
//
//nome
//caixa
//listaDeLivros
//e ) A classe Livraria devera ter um método chamado comprarRemessa
//(Livro livro), que verifica se o valor total da compra não ultrapassa o valor total do caixa, caso não ultrapasse,
//adiciona a remessa para seu estoque, caso contrário, exibe a seguinte mensagem:
//	"Fundos insuficientes para adquirir remessa do livro: NOME", onde “NOME” é o nome da remessa de livros recebida.
//
//f ) A classe Livraria deverá ter um método chamado exibeEstoque(), que verifica se há livros em seu estoque e
//caso tenha exibe as informações de cada livro de maneira organizada, caso contrário, exibe a seguinte
//mensagem: "Você não possuí livros em seu estoque."
//
//h ) A classe Livraria deverá conter um método chamado exibeCaixa()  que informa ao usuário a seguinte mensagem:
//	“O caixa atual é de: CAIXA”, onde CAIXA deverá ser o valor disponível em caixa arrendodado para 2 casas decimais.
//
//i ) Crie um objeto do tipo Livraria na classe programaLivraria.
//
//j ) Crie alguns objetos do tipo Livro na classe programaLivraria.
//
//k ) Use os métodos criados na classe Livraria para simular os diferentes cenários.

