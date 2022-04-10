package Ejercicio2;


public class Producto { 
	
	private String Fecha_Caducidad;
    private int Lote; 
    
    public Producto() {
    	this.Fecha_Caducidad = "Sin Fecha";
    	this.Lote = 0;
    }
    
    
    public Producto(String Fecha_Caducidad, int Lote) {
    	this.Fecha_Caducidad = Fecha_Caducidad;
    	this.Lote =  Lote;
    }


	public String getFecha_Caducidad() {
		return Fecha_Caducidad;
	}


	public void setFecha_Caducidad(String fecha_Caducidad) {
		Fecha_Caducidad = fecha_Caducidad;
	}


	public int getLote() {
		return Lote;
	}


	public void setLote(int lote) {
		Lote = lote;
	}


	@Override
	public String toString() {
		return "Fecha de Caducidad: " + Fecha_Caducidad + ", Lote: " + Lote + " | " ;
	}
	
	
    
	

}
