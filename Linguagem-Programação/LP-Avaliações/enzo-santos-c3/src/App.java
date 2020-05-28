
public class App {
	public static void main(String[] args) {
		
		MedicoClinico m1 = new MedicoClinico(001,"Anderson Santos",5,100.0);
		MedicoClinico m2 = new MedicoClinico(002,"Gerson Moura",2,60.0);
		
		MedicoCirurgiao mc1 = new MedicoCirurgiao(022,"Jessica Fernandez",4,50.0,2,200.0);
		MedicoCirurgiao mc2 = new MedicoCirurgiao(023,"Brenda Guimaraes",5,150.0,4,6000.0);
		
		System.out.println("\n\n========== MÉDICOS CLINICOS =========");
		m1.calcularSalario();
		System.out.println(m1.toString());
		
		m2.calcularSalario();
		System.out.println(m2.toString());
		
		System.out.println("\n\n========== MÉDICOS CIRURGIÃO =========");
		mc1.calcularSalario();
		System.out.println(mc1.toString());
		
		mc2.calcularSalario();
		System.out.println(mc2.toString());
	}
}

//c) Uma classe chamada "App", ela deve ser executável e deverá:
//
//  I. Ter no minímo dois objetos do tipo "MedicoClinico".
//
//  II. Ter no minímo dois objetos do tipo "MedicoCirurgiao".
//
//  III. Invocar e apresentar os dados e salário de cada um deles.