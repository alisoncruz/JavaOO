package aulaOO2;

public class TestaHeranca {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setSalario(1000);
		
		double salFunc = f1.getSalario();
		
		System.out.println("Salario do Funcionario " + salFunc);
		System.out.println("Bonus do Funcionario "+ f1.getBonus());
		
		DBA d1 = new DBA();
		d1.setSalario(1000);
		double salFunc2 = d1.getSalario();
		
		System.out.println();
		System.out.println("Salario do Funcionario " + salFunc);
		System.out.println("Bonus do Funcionario " + d1.getBonus());
		
		
	}
}
