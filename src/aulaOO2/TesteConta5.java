package aulaOO2;

public class TesteConta5 {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.nome = "Maria";
		
		
		Conta c2 = new Conta();
		//Conta c2 = c1;
		c2.nome = "Maria";
		
		if(c1 == c2) {
			System.out.println("As contas são iguais");
		} else {
			System.out.println("As contas são diferentes");
		}
	}
}
