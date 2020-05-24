
public class Empregado {
	
	//atributos
	private String nome, cargo;
	private Double salario;
	
	
	
	//construtor que pega todos os atributos
	
	public Empregado() {
			System.out.println("\n******************************** ");	
	}
	
	public Empregado(String nome) {
		this();
		this.nome = nome;
	}
	public Empregado(String nome, String cargo,Double salario) {
		this(nome);
		//this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	
	//metodos
	public void reajustarSalario() {
		Double reajuste = salario * 0.15;
		salario -= reajuste;
	}
	
	
	
	public void exibirDados() {
		System.out.println("\nDados do Empregado ");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Cargo: " + this.getCargo());
		System.out.println(String.format("Sal�rio atual �: %.2f", + this.getSalario()));
		
	}
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	//----------------------------------//
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	//----------------------------------//
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	}

//Crie uma classe chamada Empregado
//a) Crie os atributos nome, cargo e salario. b) Crie um m�todo chamado reajustarSalario, que receber� como par�metro a
//porcentagem do reajuste, e atualiza o atributo salario. c) Crie uma classe de teste chamada TesteEmpregado. Dentro do m�todo
//main, instancie um objeto da classe Empregado que tenha como nome �Jo�o�, sal�rio inicial de R$ 5.400,00 e cargo �Analista de Sistemas�. 
//d) Imprima na tela o nome, o cargo e o sal�rio reajustado, sabendo que este
//empregado recebeu um reajuste salarial de 15%. 
//e) Crie outro objeto da classe Empregado e forne�a atributos de sua escolha. Depois imprima seus dados e tamb�m seu sal�rio reajustado.