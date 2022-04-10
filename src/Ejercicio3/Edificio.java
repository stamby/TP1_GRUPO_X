package Ejercicio3;

public class Edificio {
   
	private double SuperficieEdificio;
	private int numero_oficinas;
	
	public Edificio (int numero_oficinas) {
		this.numero_oficinas = numero_oficinas;
	}
	
	public Edificio (double SuperficieEdificio) {
		this.SuperficieEdificio = SuperficieEdificio;
	}

	public double getSuperficieEdificio() {
		return SuperficieEdificio;
	}

	public void setSuperficieEdificio(double superficieEdificio) {
		SuperficieEdificio = superficieEdificio;
	}

	public int getNumero_oficinas() {
		return numero_oficinas;
	}

	public void setNumero_oficinas(int numero_oficinas) {
		this.numero_oficinas = numero_oficinas;
	}

	@Override
	public String toString() {
		return "Numero de Oficinas=" + numero_oficinas ;
	}
	
	
	
}
