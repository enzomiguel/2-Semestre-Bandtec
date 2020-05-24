
public class Professor {
	protected String nome;
	protected Integer codigo ;
	protected Integer horas;
	protected Double valorHora;
	
	public Professor(String nome,Integer codigo,Integer horas,Double valorHora) {
		this.codigo = codigo;
		this.horas = horas;
		this.nome = nome;
		this.valorHora = valorHora;
	}
	
	public  Double calcularSalario() {
		Double salarioProfessor = horas * valorHora;
		return  salarioProfessor = salarioProfessor *4.5;
	}
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public Integer getHoras() {
		return horas;
	}
	public String getNome() {
		return nome;
	}
	public Double getValorHora() {
		return valorHora;
	}
	
	@Override
    public String toString() {
        return "\nNome: " + this.nome + "\nC�digo: " + this.codigo + "\nHoras: " + this.horas + "\nValor Hora: " + this.valorHora + "\nS�lario: " + calcularSalario() ;
    }
	
}

//1. Crie a classe Professor, que ter� os atributos:
//a. nome � String � representa o nome do professor
//b. codigo � Integer� representa o c�digo do professor na Faculdade
//c. horas � Integer � representa a quantidade de horas aula que o professor
//ministra por semana
//d. valorHora � Double � representa o valor ganho por hora aula ministrada. E ter� o m�todo:
//calculaSalario( ) � retorna um valor double � esse m�todo calcula o valor do
//sal�rio do professor, que � calculado multiplicando-se a
//quantidade de horas aula pelo valorHora, e depois
//multiplicando por 4,5 (4,5 semanas de aula). toString( ) � retorna uma 
//String contendo os valores dos atributos de um
//professor e quanto ele ganha. Os atributos dessa classe dever�o estar 
//encapsulados. Implementar tamb�m o construtor que inicializa os atributos do professor, os
//getters e setters.