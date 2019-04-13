package aulaOO2;

public class ContaCorrente extends Conta2 {

	void correcao() {
		this.setSaldo(this.getSaldo() * 1.3);
	}

}
