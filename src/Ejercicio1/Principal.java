package Ejercicio1;

public class Principal {
	public static void main(String[] args) {
		Profesor profesor1 = new Profesor();
		
		profesor1.setNombre("Marcos Mart�nez");
		profesor1.setCargo("Titular");
		profesor1.setEdad(40);
		profesor1.setAntiguedadDocente(15);
		
		Profesor profesor2 = new Profesor();
		
		profesor2.setNombre("Marcos Mart�nez");
		profesor2.setCargo("Titular");
		profesor2.setEdad(40);
		profesor2.setAntiguedadDocente(15);
		
		if (profesor1.esIgualA(profesor2)) {
			System.out.print("Es el mismo profesor.");
		}
	}
}
