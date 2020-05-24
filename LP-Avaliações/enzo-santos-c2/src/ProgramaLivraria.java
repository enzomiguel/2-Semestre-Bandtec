
public class ProgramaLivraria {
 public static void main(String[] args) {
	 
	Livro l1 = new Livro("Casa de ossos","Marcos Gabs",2.0,0);
	Livro l2 = new Livro("Malevola","Jesson",4.0,0);
	Livro l3 = new Livro("Guerra Fria","Amanda Kibi",200.0,0);
	
	Livraria livraria = new  Livraria("Biblioteca", 200.00);
	
	livraria.comprarRemessa(l1);
	livraria.comprarRemessa(l2);
	livraria.comprarRemessa(l3);
	livraria.exibeCaixa();
	livraria.exibirEstoque();
	
	
	
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
//c ) A classe Paciente dever� conter um m�todo chamado exibeDados(), 
//que imprime de maneira organizada no console os dados do paciente.
//
//d ) A classe Hospital dever� conter os seguintes atributos:
//
//    nome
//    quantidadeLeitos
//    listaDePacientes
//
//e ) A classe Hospital dever� conter um m�todo chamado internarPaciente
//(Paciente paciente), que verifica se h� leitos e caso possua, interna 
//o paciente e diminui o n�mero de leitos em 1, caso contr�rio, exibe a 
//seguinte mensagem: �n�o foi poss�vel internar o paciente NOME, 
//ser� necess�rio transferi-lo�, onde NOME dever� ser substituido pelo nome do paciente recebido.
//
//f ) A classe Hospitaldever� ter um m�todo chamado exibeDadosPacientes() 
//que verifica se h� pacientes internados, caso possua, exibe de maneira organizada
//os dados de todos os pacientes, caso contr�rio, exibe a seguinte mensagem: 
//�N�o h� pacientes internados.�
//
//g ) A classe Hospital dever� conter um m�todo chamado exibeLeitos() 
//que imprime no console a seguinte mensagem "Quantidade de leitos dispon�veis: QUANTIDADE" 
//onde QUANTIDADE � o n�mero atual de leitos dispon�veis.
//
//h ) A classe ProgramaHospital dever� criar objetos do tipo Paciente com diferentes valores.
//
//i )A classe ProgramaHospital dever� criar um objeto do tipo Hospital.
//
//j ) Interne alguns pacientes no hospital criado e teste os diferentes cen�rios
//na f