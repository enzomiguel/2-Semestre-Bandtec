import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numeros {
	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>();
		Scanner leitor = new Scanner(System.in);
		
		Integer numeros = 1;
		do {
			System.out.println("Digite um número. ou Digite 0 quando cansar: ");
			numeros = leitor.nextInt();
			
			if(numeros !=0) {
				lista.add(numeros);
			}
		}while (numeros !=0);
		
			
		System.out.println("Números pares: ");
		for(Integer numero : lista) {
			if(numero %2 ==0) {
				System.out.println(numero);
			}
			
		}
		
		System.out.println("Números impares: ");
		for(Integer numero : lista) {
			if(numero %2 !=0) {
				System.out.println(numero);
			}
			
		}
		
		Integer soma = 0;
		for(Integer numero : lista) {
			soma+=numero;
		}
		System.out.println(String.format("\nA soma dos numeros da lista é: %d", soma));
		
		Integer maior = Integer.MIN_VALUE;
		for(Integer numero : lista) {
			if(numero> maior) {
				maior = numero;
			}
		}
		System.out.println(String.format("\nMaior numero da lista: %d", maior));
		
		Integer menor = Integer.MAX_VALUE;
		for(Integer numero : lista) {
			if(numero< menor) {
				menor = numero;
			}
		}
		System.out.println(String.format("\nMenor numero da lista: %d", menor));
	}
	
}
