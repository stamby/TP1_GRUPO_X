package Ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Edificio e1 = new InstalacionDeportiva(10.2, "polideportivo");
		Edificio e2 = new InstalacionDeportiva(10.2, "polideportivo");
		Edificio e3 = new InstalacionDeportiva(10.2, "polideportivo");
		Edificio e4 = new Edificio(10);
		Edificio e5 = new Edificio(30);
		
		ArrayList<Edificio> ListaEdificios = new ArrayList<Edificio>();
		
		ListaEdificios.add(e1);
		ListaEdificios.add(e1);
		ListaEdificios.add(e2);
		ListaEdificios.add(e3);
		ListaEdificios.add(e4);
		ListaEdificios.add(e5);
	
	     ListIterator<Edificio> it = ListaEdificios.listIterator();

		while (it.hasNext()) {
			Edificio edificio = it.next();
			it.remove();
			System.out.println(edificio.toString());
		}
	}

}
