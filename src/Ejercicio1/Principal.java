package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado x = new Empleado();
		x.setNombre("Jose");
		x.setEdad(30);
		System.out.println(x.toString());
		
		Empleado[] vEmp = new Empleado[5];
		
		vEmp[0] = new Empleado("Bruno", 30);
		vEmp[1] = new Empleado("Tomas", 23);
		vEmp[2] = new Empleado("Fran", 25);
		vEmp[3] = new Empleado();
		vEmp[4] = new Empleado();
		
		for (Empleado empleado : vEmp) {
			System.out.println(empleado.toString());
		}
		

		System.out.println("El proximo ID será el " + Empleado.devuelveProximoID());
		
	}

}
