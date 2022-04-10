package Ejercicio2;

public class ProductoCongelado extends Producto {
	
	private int temperatura;
	 
	public ProductoCongelado() {
		
		super();
		
		this.temperatura = 0;
				
	}
	
	public ProductoCongelado(String Fecha_Caducidad, int Lote, int temperatura) {
		
		super(Fecha_Caducidad, Lote);
		
		this.temperatura = temperatura;
				
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return super.toString() + "Temperatura de congelación recomendada: " + temperatura + "ºC";
	}
	
	
	
}
