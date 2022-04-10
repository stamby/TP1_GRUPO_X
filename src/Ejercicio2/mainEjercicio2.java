package Ejercicio2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ProductoFresco fresco = new ProductoFresco("10-05-2022", 20, "08-03-2020", "Argentina");
		ProductoRefrigerado refrisgerado = new ProductoRefrigerado("24-05-2022", 30, "A21");
		ProductoCongelado congelado = new ProductoCongelado("10-05-2022", 40,-20);
		
		System.out.println(fresco.toString());
		System.out.println(refrisgerado.toString());
		System.out.println(congelado.toString());
		
	}

}
