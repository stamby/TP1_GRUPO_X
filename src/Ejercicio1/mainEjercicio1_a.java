package Ejercicio1;

import java.util.ArrayList;

public class mainEjercicio1_a {
	public static void main(String[] args) {
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		
		Profesor profesor = new Profesor();
		
		profesor.setNombre("Marcos Mart�nez");
		profesor.setCargo("Titular");
		profesor.setEdad(40);
		profesor.setAntiguedadDocente(15);
		
		profesor.setNombre("Juliana �lvarez");
		profesor.setCargo("Titular");
		profesor.setEdad(38);
		profesor.setAntiguedadDocente(14);
		
		profesor.setNombre("Marcos Mart�nez");
		profesor.setCargo("Jefe de Trabajos Pr�cticos");
		profesor.setEdad(29);
		profesor.setAntiguedadDocente(6);
		
		profesor.setNombre("Jes�s L�pez");
		profesor.setCargo("Jefe de Trabajos Pr�cticos");
		profesor.setEdad(34);
		profesor.setAntiguedadDocente(8);
		
		profesor.setNombre("Mariana Gonz�lez");
		profesor.setCargo("Titular");
		profesor.setEdad(50);
		profesor.setAntiguedadDocente(27);

		profesores.add(profesor);
	}
}
