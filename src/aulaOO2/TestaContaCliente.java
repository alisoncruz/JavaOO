package aulaOO2;

public class TestaContaCliente {

	public static void main(String[] args) {
		
		ContaTransf2 c2 = new ContaTransf2("Joao","123.456.789-00");
		//Cliente cliente1 = new Cliente();
		//cliente1.nome = "Joao";
		
//		c2.cliente.nome = "Joao";
		
		System.out.println(c2.cliente.nome);
		System.out.println(ContaTransf2.getContadorDeContas());
		
	}
}
