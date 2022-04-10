package Ejercicio1;

public class Profesor extends Empleado {
	private String cargo;
	private int antiguedadDocente;
	
	public Profesor() {
		super();
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
	
	public String toString() {
		return String.format(
				"%d, %s, %d, %s, %d",
				this.getId(),
				this.getNombre(),
				this.getEdad(),
				this.cargo,
				this.antiguedadDocente);
	}
}
