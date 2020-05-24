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
//O projeto precisa de 3 classes, “ContaCorrente”, “Historico” e
//“ProgramaContaCorrente”.
//1) O usuário deve obter todas as informações do objeto(ContaCorrente e Histórico). 
//2) O usuário deve poder sacar. 3) O usuário deve poder depositar. 
//4) A cada transação(saque ou depósito) o programa deve registrar a ocorrência. 5) A ocorrência(histórico) deve conter:
//A) Valor da transação
//B) Dia da transação
//C) Mês da transação
//D) Ano da Transação
//E) Tipo de operação, saque ou déposito. 6) A data da ocorrência deve ser composta por números inteiros.
//7) A classe “ProgramaContaCorrente” deve conter um método main, e dentro dele
//você deverá instanciar um objeto ContaCorrente e simular saques, depósitos e
//obtenção das informações (valores dos atributos inclusive Histórico)