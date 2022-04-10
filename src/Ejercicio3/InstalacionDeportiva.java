package Ejercicio3;

public class InstalacionDeportiva extends Edificio{

	private String nombre;
	
	public InstalacionDeportiva(double SuperficieEdificio, String nombre) {
		
		super(SuperficieEdificio);
		this.nombre = nombre;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return  "Superficie" + getSuperficieEdificio() + " Nombre=" + nombre ;
	}
	
	
	
}
