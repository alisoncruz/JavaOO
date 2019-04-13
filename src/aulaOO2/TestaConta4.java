package aulaOO2;

public class TestaConta4 {

	public static void main(String[] args) {
		Conta c1;
		c1 = new Conta();
		c1.limite = 100;
		
		System.out.println("Limite c1: "+c1.limite);
		
		Conta c2;
		c2 = c1;
		
		System.out.println("Limite c2: "+c2.limite);
		
		c2.limite = 200;
		
		System.out.println();
		System.out.println("Limite c1: "+c1.limite);
		System.out.println("Limite c2: "+ c2.limite);
	}
}
