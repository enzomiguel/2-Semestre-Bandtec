
public class Paciente {

	private String nome,planoDeSaude;
	private Integer idade;
	
	
	public Paciente(String nome, String planoDeSaude,Integer idade) {
		this.idade = idade;
		this.nome = nome;
		this.planoDeSaude = planoDeSaude;
	}
	
	public void exibeDados() {
		System.out.println("\n------------DADOS DOS PACIENTE------------");
		System.out.println("\nNome do Paciente: "+ getNome()
		                   + "\nIdade: " + getIdade() 
		                   + "\nPlano de Saúde: " + getPlanoDeSaude());
	}
	
	public Integer getIdade() {
		return idade;
	}
	public String getNome() {
		return nome;
	}
	public String getPlanoDeSaude() {
		return planoDeSaude;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n------------DADOS DOS PACIENTE------------\n" +
		"\nNome: "+ getNome()
        + "\nIdade: " + getIdade() 
        + "\nPlano de Saúde: " + getPlanoDeSaude();
	}
}

//Escreva um programa em Java o qual:
//
//a ) Possua três classes: Paciente, Hospital e ProgramaHospital.
//
//b ) A classe Paciente deverá conter os seguintes atributos:
//
//    nome
//    idade
//    planoDeSaude
//
//c ) A classe Paciente deverá conter um método chamado exibeDados(), que imprime de maneira organizada no console os dados do paciente.
//
//d ) A classe Hospital deverá conter os seguintes atributos:
//
//    nome
//    quantidadeLeitos
//    listaDePacientes
//
//e ) A classe Hospital deverá conter um método chamado internarPaciente(Paciente paciente), que verifica se há leitos e caso possua, interna o paciente e diminui o número de leitos em 1, caso contrário, exibe a seguinte mensagem: “não foi possível internar o paciente NOME, será necessário transferi-lo”, onde NOME deverá ser substituido pelo nome do paciente recebido.
//
//f ) A classe Hospitaldeverá ter um método chamado exibeDadosPacientes() que verifica se há pacientes internados, caso possua, exibe de maneira organizada os dados de todos os pacientes, caso contrário, exibe a seguinte mensagem: “Não há pacientes internados.”
//
//g ) A classe Hospital deverá conter um método chamado exibeLeitos() que imprime no console a seguinte mensagem "Quantidade de leitos disponíveis: QUANTIDADE" onde QUANTIDADE é o número atual de leitos disponíveis.
//
//h ) A classe ProgramaHospital deverá criar objetos do tipo Paciente com diferentes valores.
//
//i )A classe ProgramaHospital deverá criar um objeto do tipo Hospital.
//
//j ) Interne alguns pacientes no hospital criado e teste os diferentes cenários
//na f