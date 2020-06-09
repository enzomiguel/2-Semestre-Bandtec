import java.util.ArrayList;
import java.util.List;
public class Imagem {
	
	private List<Figura> lista;
	
	public Imagem() {
		lista = new ArrayList<Figura>();
	}
	public void adicionaFigura(Figura f) {
		lista.add(f);
	}
	public  void exibeFiguras( ) {
		System.out.println("\n========== Lista dos Figuras ========== ");
		for(Figura f : lista) {
			System.out.println(f);
		}
		
	}
	public  void exibeSomaArea( ) {
		Double total = 0.0;
		for(Figura f : lista) {
			total += f.calcularArea();	
			}
		System.out.println("\nTotal de área calculada: " + total);
	}
		
	
	public  void exibeFiguraAreaMaior20( ) {
		System.out.println("\n========= Figuras com Área calcualda maior que 20 ==========");
		for(Figura f: lista) {
			if(f.calcularArea() >=20) {
				System.out.println(f);
			}
		}
		
	}
	public void exibeQuadrado( ) {
		System.out.println("\n========== Lista de Quadrados ========== ");
		for(Figura f : lista) {
			if(f instanceof  Quadrado) {
				System.out.println(f);
			}
		}
	}
}

//Uma classe Imagem:
//Métodos:
//➢ void adicionaFigura(Figura f) - Recebe um objeto Figura e acrescenta
//esse objeto à lista. ➢ void exibeFiguras( ) - Percorre a lista de Figuras e exibe as informações
//de cada objeto, incluindo a área da figura. ➢ void exibeSomaArea( ) - Este método deve exibir a soma das áreas de
//todas as figuras que compõem a imagem. 
//➢ void exibeFiguraAreaMaior20( ) - Este método deve exibir os dados de
//todas as figuras que compõem a imagem e que possuam área maior do que 20. 
//➢ void exibeQuadrado( ) - Este método deve exibir os dados de todas as
//figuras Quadrado que compõem a imagem.





