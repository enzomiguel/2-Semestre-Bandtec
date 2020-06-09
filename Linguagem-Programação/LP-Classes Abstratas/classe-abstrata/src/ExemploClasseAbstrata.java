
public class ExemploClasseAbstrata {
	public static void main(String[] args) {
		
		// como pode ver , n e possivel criar um objeto numa classe abstrata
		//Funcionario f = new Funcionario("5000000","Claudio");
		
		//Funcionario f = new Vendedor("4567891234","Jose",2000.0,0.10);
		Vendedor v = new Vendedor("74592359","Claudio",6000.0,0.5);
		Horista h = new Horista("87549254","Fernando",40,100.0);
		
		System.out.println(v);
		System.out.println(h);
		
		Empresa bandtec = new Empresa ("Bandtec");
		bandtec.adicionarFunc(v);
		bandtec.adicionarFunc(h);
		
		bandtec.exibeTodos();
		bandtec.exibeVendedores();
		bandtec.exibeTotalSalario();
	}
	
	
}
