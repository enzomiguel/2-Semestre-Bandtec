import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
	
	private Double saldo = 0.0;
	private String titular;
	private List<Historico> registro;
	
	public ContaCorrente(String titular, Double saldo) {
		this.titular= titular;
		this.saldo = saldo;
		registro = new ArrayList<Historico>();
		
	}
	
	public void sacar(Double valor,Integer dia, Integer mes, Integer ano) {
		Historico historico =new  Historico( "Saque",  dia,  mes,  ano,  valor);
		saldo -=valor;
		
		registro.add(historico);
	
	}
	public void depositar(Double valor,Integer dia, Integer mes, Integer ano) {
		Historico historico =new  Historico("Deposito",  dia,  mes,  ano,  valor);
		saldo += valor;
		
		registro.add(historico);
		
	}
	public void exibirExtrato() {
		System.out.println("Titular: " +getTitular());
		
		System.out.println(getRegistro());
		
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	
	
	public List<Historico> getRegistro() {
		return registro;
	}

}
//O projeto precisa de 3 classes, �ContaCorrente�, �Historico� e
//�ProgramaContaCorrente�.
//1) O usu�rio deve obter todas as informa��es do objeto(ContaCorrente e Hist�rico). 
//2) O usu�rio deve poder sacar. 3) O usu�rio deve poder depositar. 
//4) A cada transa��o(saque ou dep�sito) o programa deve registrar a ocorr�ncia. 5) A ocorr�ncia(hist�rico) deve conter:
//A) Valor da transa��o
//B) Dia da transa��o
//C) M�s da transa��o
//D) Ano da Transa��o
//E) Tipo de opera��o, saque ou d�posito. 6) A data da ocorr�ncia deve ser composta por n�meros inteiros.
//7) A classe �ProgramaContaCorrente� deve conter um m�todo main, e dentro dele
//voc� dever� instanciar um objeto ContaCorrente e simular saques, dep�sitos e
//obten��o das informa��es (valores dos atributos inclusive Hist�rico)