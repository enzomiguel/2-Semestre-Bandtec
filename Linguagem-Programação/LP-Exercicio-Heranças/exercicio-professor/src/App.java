
public class App {
	public static void main(String[] args) {
		
		Professor professor = new Professor("Adriano Marques",222,4,10.0);
		Coordenador coordernador = new Coordenador("Jos� Almeida","ADS",223,5,2,30.0,5.0);
		
		System.out.println("\n=========DADOS DO PROFESSOR=========");
		System.out.println(professor);
		System.out.println("\n=========DADOS DO COORDENADOR=========");
		System.out.println(coordernador);
		//professor.calcularSalario();
		//professor.toString();
	}
}

//Criar classe App que tem o m�todo main( ) e que cria objetos da classe Professor e
//Coordenador, atribui valores para seus atributos e invoca seus m�todos, exibindo
//os valores atrav�s do toString( ).