package aulaOO2;

public class TestaControleSalarial {
	
	public static void main(String[] args) {
		
		ControleSalarial controle = new ControleSalarial();
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		controle.setTotalSalario(f1);
		System.out.println(controle.getTotalSalarios());
		
		
		DBA dba1 = new DBA();
		dba1.setSalario(1000);
		controle.setTotalSalario(dba1);
		System.out.println(controle.getTotalSalarios());
	}

}
