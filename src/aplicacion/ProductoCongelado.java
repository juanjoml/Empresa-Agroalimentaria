package aplicacion;
/* Todos los productos poseen esta informacion comun: fecha de caducidad y numero de lote. 
   A su vez, cada tipo de producto incorpora alguna informacion especifica. 
   Los productos congelados, por su parte, poseen la fecha de envasado, el pais de origen y la temperatura de mantenimiento recomendada.*/
public class ProductoCongelado extends Producto{
	
	protected String fechaEnvasado;	
	protected float temperatura;	
	protected String paisOrigen;
	
	public ProductoCongelado (String fechaCaducidad, int numLote, 
			String fechaEnvasado, float temperatura, String paisOrigen)
	{
		super(fechaCaducidad, numLote);		
		this.fechaEnvasado=fechaEnvasado;		
		this.temperatura=temperatura;		
		this.paisOrigen=paisOrigen;		
	}
	//-----------------------------------------------------------------
	// getFechaEnvasado
	//-----------------------------------------------------------------	
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	//-----------------------------------------------------------------
	// setFechaEnvasado
	//-----------------------------------------------------------------	
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	//-----------------------------------------------------------------
	// getTemperatura
	//-----------------------------------------------------------------	
	public float getTemperatura() {
		return temperatura;
	}
	//-----------------------------------------------------------------
	// setTemperatura
	//-----------------------------------------------------------------	
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	//-----------------------------------------------------------------
	// getPaisOrigen
	//-----------------------------------------------------------------	
	public String getPaisOrigen() {
		return paisOrigen;
	}
	//-----------------------------------------------------------------
	// setPaisOrigen
	//-----------------------------------------------------------------	
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	//-----------------------------------------------------------------
	// toString
	//-----------------------------------------------------------------	
	@Override
	public String toString() {
		return "Producto Congelado [Fecha de caducidad: "+ this.getFechaCaducidad() + ", Numero de lote: " + this.getNumLote() 
			+ ", Fecha de envasado: " + fechaEnvasado + ", Temperatura: " + temperatura + ", Pais de origen: "
				+ paisOrigen + "] \n";
	} 
}