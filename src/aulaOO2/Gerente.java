package aulaOO2;

public class Gerente extends Funcionario implements ControleInterno2{

	double getBonus() {
		return this.salario * 0.05 + 10000;
	}

	@Override
	public boolean verifica(String senha) {
		return false;
	}
}
