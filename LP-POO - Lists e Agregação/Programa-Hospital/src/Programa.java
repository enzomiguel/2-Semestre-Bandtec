import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		//importando uma biblioteca pra poder fazer a captura dos dados que o usuario digita
		Scanner leitor = new Scanner(System.in);
		
		//declarando tipo de variavel 
		String nome;
		
		//declarando uma variel de numero inteiro 
		int idade;
		
		//mostrando frase na tela
		System.out.println("Ola Amigo!");
		
		//mostrando frase pro usuario poder digitar seu nome
		System.out.print("Digite seu nome:");
		
		nome= leitor.nextLine();
		
		//mostrando nome que o usuario digitou
		System.out.println("Seu nome é: " + nome);
		
		//mostrando frase pro usuario poder digitar sua idade
		System.out.print("Digite sua idade:");
		
		idade= leitor.nextInt();
	
		//mostrar na tela valor da variavel 
		System.out.println("Sua idade é: " + idade);
	}
}
