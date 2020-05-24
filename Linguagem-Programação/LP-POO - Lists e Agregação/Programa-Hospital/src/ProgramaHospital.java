
public class ProgramaHospital {
	public static void main(String[] args) {
		Paciente p1 = new Paciente("Enzo Miguel","AMIL", 20);
		Paciente p2 = new Paciente("Barbara Souza","SULAMERICA", 15);
		Paciente p3 = new Paciente("Andersom Morais","BRADESCO", 30);
		
		Hospital hospital = new Hospital("HOSPITAL DAS CLINICAS",2);
		
		hospital.internarPaciente(p1);
		hospital.internarPaciente(p2);
		hospital.internarPaciente(p3);
		
		hospital.exibeDadosPacientes();
		hospital.exibeLeitos();
		
	}

}
