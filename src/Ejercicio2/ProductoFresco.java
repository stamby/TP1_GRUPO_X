package Ejercicio2;

public class ProductoFresco extends Producto{
	
	private String Fecha_Envasado;
	private String Pais_Origen;

	public ProductoFresco() {
		
		super();
		
		this.Fecha_Envasado = "Sin Fecha";
		this.Pais_Origen = "Sin Pais registrado";
				
	}
	
	public ProductoFresco(String Fecha_Caducidad, int Lote, String Fecha_Envasado, String Pais_Origen) {
		
		super(Fecha_Caducidad, Lote);
		
		this.Fecha_Envasado = Fecha_Envasado;
		this.Pais_Origen = Pais_Origen;
				
	}

	public String getFecha_Envasado() {
		return Fecha_Envasado;
	}

	public void setFecha_Envasado(String fecha_Envasado) {
		Fecha_Envasado = fecha_Envasado;
	}

	public String getPais_Origen() {
		return Pais_Origen;
	}

	public void setPais_Origen(String pais_Origen) {
		Pais_Origen = pais_Origen;
	}

	@Override
	public String toString() {
		return   super.toString() + "Fecha de envasado: " + Fecha_Envasado + ", Pais de origen: " + Pais_Origen;
	}
	
	
	
	
}
