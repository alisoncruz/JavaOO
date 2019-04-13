package aulaOO2;

public class ContaTransf2 {

	private static int contadorDeContas;
	int numero;
	Cliente cliente;
	double saldo;
	double limite;
	
	public ContaTransf2() {
		
	}

	public ContaTransf2(String nome, String cpf) {
		cliente = new Cliente();
		cliente.nome = nome;
		cliente.cpf = cpf;
		
		ContaTransf2.contadorDeContas++;
	}

	public static int getContadorDeContas() {
		return contadorDeContas;
	}

}
