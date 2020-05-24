
public class TesteEmpregado {

	public static void main(String[] args) {
		//criação do objeto empregado1 da classe Empregado ,usando construtor vazio 
		Empregado empregado1 = new Empregado();
		//atribuindo valores aos atributos de empregado1
		empregado1.setNome("Enzo Santos");
		empregado1.setCargo("Analista de Sistemas");
		empregado1.setSalario(5400.00);
		
		//reajuste salarial
		empregado1.reajustarSalario();
		
		//exibe dados do empregado1
		empregado1.exibirDados();
		
		
		//criando outro objeto empregado2, usando construtor que inicializa todos os atributos
		Empregado empregado2 = new Empregado("Miguel Oliveira","Desenvolvedor",6000.00);
		
		empregado2.reajustarSalario();
		empregado2.exibirDados();
		
		Empregado empregado3 = new Empregado("José Moura", "Engenheiro", 10000.00);
		empregado3.reajustarSalario();
		empregado3.exibirDados();
	}
}
