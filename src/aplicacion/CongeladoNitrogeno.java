package aplicacion;
/* Existen, tres tipos de productos congelados: congelados por aire, congelados por agua y congelados por nitrogeno. 
   Los productos congelados por nitrogeno deben llevar la informacion del tiempo de exposicion al nitrogeno expresada en segundos.*/
public class CongeladoNitrogeno extends ProductoCongelado{
	
	private int tiempoExposicion;
	
	public CongeladoNitrogeno (String fechaCaducidad, int numLote, String fechaEnvasado,
			float temperatura, String paisOrigen, int tiempoExposicion)			
	{	 
		super(fechaCaducidad, numLote, fechaEnvasado, temperatura, paisOrigen);			
		this.tiempoExposicion=tiempoExposicion;		
	}
	//-----------------------------------------------------------------
	// getTiempoExposicion
	//-----------------------------------------------------------------	
	public int getTiempoExposicion() {
		return tiempoExposicion;
	}
	//-----------------------------------------------------------------
	// setTiempoExposicion
	//-----------------------------------------------------------------	
	public void setTiempoExposicion(int tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}
	//-----------------------------------------------------------------
	// toString
	//-----------------------------------------------------------------	
	@Override
	public String toString() {
		return "Congelado por Nitrogeno [Fecha de caducidad: "+ this.getFechaCaducidad() + ", Numero de lote: " + this.getNumLote() + 
				", Fecha de envasado: " + this.getFechaEnvasado() + ", Temperatura: "+ this.getTemperatura() + ", Pais de origen: "  
				+ this.getPaisOrigen() + ", Tiempo de exposicion: " + tiempoExposicion + "] \n";
	}
}