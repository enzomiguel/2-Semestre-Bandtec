
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
		                   + "\nPlano de Sa�de: " + getPlanoDeSaude());
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
        + "\nPlano de Sa�de: " + getPlanoDeSaude();
	}
}

//Escreva um programa em Java o qual:
//
//a ) Possua tr�s classes: Paciente, Hospital e ProgramaHospital.
//
//b ) A classe Paciente dever� conter os seguintes atributos:
//
//    nome
//    idade
//    planoDeSaude
//
//c ) A classe Paciente dever� conter um m�todo chamado exibeDados(), que imprime de maneira organizada no console os dados do paciente.
//
//d ) A classe Hospital dever� conter os seguintes atributos:
//
//    nome
//    quantidadeLeitos
//    listaDePacientes
//
//e ) A classe Hospital dever� conter um m�todo chamado internarPaciente(Paciente paciente), que verifica se h� leitos e caso possua, interna o paciente e diminui o n�mero de leitos em 1, caso contr�rio, exibe a seguinte mensagem: �n�o foi poss�vel internar o paciente NOME, ser� necess�rio transferi-lo�, onde NOME dever� ser substituido pelo nome do paciente recebido.
//
//f ) A classe Hospitaldever� ter um m�todo chamado exibeDadosPacientes() que verifica se h� pacientes internados, caso possua, exibe de maneira organizada os dados de todos os pacientes, caso contr�rio, exibe a seguinte mensagem: �N�o h� pacientes internados.�
//
//g ) A classe Hospital dever� conter um m�todo chamado exibeLeitos() que imprime no console a seguinte mensagem "Quantidade de leitos dispon�veis: QUANTIDADE" onde QUANTIDADE � o n�mero atual de leitos dispon�veis.
//
//h ) A classe ProgramaHospital dever� criar objetos do tipo Paciente com diferentes valores.
//
//i )A classe ProgramaHospital dever� criar um objeto do tipo Hospital.
//
//j ) Interne alguns pacientes no hospital criado e teste os diferentes cen�rios
//na f