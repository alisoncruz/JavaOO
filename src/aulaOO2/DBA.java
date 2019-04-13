package aulaOO2;

public class DBA extends Funcionario {

	int senha;

	public boolean verificaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso não autorizado");
			return false;
		}
	}
	
	double getBonus() {
		return this.salario * 0.25;
	}
}
