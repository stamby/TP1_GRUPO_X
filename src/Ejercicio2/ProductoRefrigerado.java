package Ejercicio2;

public class ProductoRefrigerado extends Producto{

	private String Codigo_Organismo;

    public ProductoRefrigerado() {
		
		super();
		
		this.Codigo_Organismo = "Sin Codigo";
				
	}
	
	public ProductoRefrigerado(String Fecha_Caducidad, int Lote, String Codigo_Organismo) {
		
		super(Fecha_Caducidad, Lote);
		
		this.Codigo_Organismo = Codigo_Organismo;
				
	}

	public String getCodigo_Organismo() {
		return Codigo_Organismo;
	}

	public void setCodigo_Organismo(String codigo_Organismo) {
		Codigo_Organismo = codigo_Organismo;
	}

	@Override
	public String toString() {
		return super.toString() + "Código del organismo de supervisión alimentaria: " + Codigo_Organismo ;
	}

	 
    
	
	
}
