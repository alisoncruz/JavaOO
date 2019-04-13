package aulaOO2;

public class ControleSalarial {
	
	private double totalSalarios = 0;
	
	public void setTotalSalario(Funcionario funcionario) {
		this.totalSalarios += funcionario.getSalario();
	}
	
	public double getTotalSalarios() {
		return this.totalSalarios;
	}

}
