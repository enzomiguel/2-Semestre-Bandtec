import java.util.Scanner;

public class Programa2 {
	public static void main(String[] args) {
		
		String nome;
		Double valor = 0.00;
		Double total = 0.00;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual seu primeiro nome: ");
		nome = leitor.nextLine();
		
		Integer mes = 1;
		Double soma = 0.00;
		
		for(Integer i = 1; i <=12; i++) {
			
			System.out.println("Qual o valor do deposito realizado no "+ mes+"º mes:");
			valor = leitor.nextDouble();
			mes++;
			
			if(valor == 2.00 ) {
				total = total + valor;
				System.out.println(valor);
			}
			else if(valor == 5.00) {
				total = total + valor;
			}  
			else if(valor == 10.00) {
				total = total + valor;
			}  
			else if(valor== 20.00) {
				total = total + valor;
			} 
			else if(valor== 50.00 ) {
				total = total + valor;
			}
			else if(valor== 100.00) {
				total = total + valor;
			}
			else {
				
				System.out.println("Valor de deposito invalido!");
				
			}
			
		
		}
		
		
      System.out.println(String.format("Ao final de 12 meses, %s Guardou R$%.2f", nome, total));
	}

}
