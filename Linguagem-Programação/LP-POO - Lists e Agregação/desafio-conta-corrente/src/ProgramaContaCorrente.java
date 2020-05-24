import java.util.Scanner;

public class ProgramaContaCorrente {
	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente("Enzo Miguel",1000.00);
		ContaCorrente contaCorrente2 = new ContaCorrente("Diego Brito",2000.00);
		
		
		
		
		contaCorrente.sacar(20.00, 05, 02, 2020);
		contaCorrente.exibirExtrato();
		
		
		contaCorrente2.depositar(30.00, 05, 02, 2020);
		contaCorrente2.exibirExtrato();
	}
}


