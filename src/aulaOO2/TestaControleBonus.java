package aulaOO2;

public class TestaControleBonus {

public static void main(String[] args) {
		
		ControleBonus controle = new ControleBonus();
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		controle.setTotalBonus(f1);
		System.out.println(controle.getTotalBonus());
		
		
		DBA dba1 = new DBA();
		dba1.setSalario(1000);
		controle.setTotalBonus(dba1);
		System.out.println(controle.getTotalBonus());
		
	}
}
