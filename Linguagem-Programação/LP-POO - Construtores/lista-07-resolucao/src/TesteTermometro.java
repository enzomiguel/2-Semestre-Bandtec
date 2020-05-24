
public class TesteTermometro {
	public static void main(String[] args) {
		Termometro termometro = new Termometro(15.0,31.0,13.0);
		
		termometro.exibirTemperaturas();
	    termometro.aumentarTemperatura();
		termometro.diminuiTemperatura();
		termometro.exibeFahreinheit();
		
	}
}
