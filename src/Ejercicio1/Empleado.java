package Ejercicio1;

public class Empleado {

	private final int id;
	private String nombre;
	private int edad;
	
	private static int cont = 1000;
	
	public Empleado() {
		
		this.id = cont;
	    this.nombre = "Sin nombre";
		this.edad = 99;
		
		cont++;
	}
	
	public Empleado(String nombre, int edad) {
		
		this.id = cont;
	    this.nombre = nombre;
		this.edad = edad;
		
		cont++;
	}
	
	

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	@Override
	public String toString() {
		return "Empleado " + nombre + ", edad: " + edad + ", legajo: " + id;
	}
	
	
	public static int devuelveProximoID() {
		return cont;
	}
	
	
}
