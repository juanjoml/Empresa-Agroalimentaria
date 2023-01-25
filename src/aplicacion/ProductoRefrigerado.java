package aplicacion;
/* Todos los productos poseen esta informacion comun: fecha de caducidad y numero de lote. 
   A su vez, cada tipo de producto incorpora alguna informacion especifica. 
   Los productos refrigerados incorporan el codigo del organismo de supervision alimentaria, la fecha de envasado, la temperatura 
   de mantenimiento recomendada y el pais de origen. */
public class ProductoRefrigerado extends Producto{
	
	protected int codigoSupervision;	
	protected String fechaEnvasado;	
	protected float temperatura;	
	protected String paisOrigen;

	public ProductoRefrigerado (String fechaCaducidad, int numLote, int codigoSupervision, 
			String fechaEnvasado, float temperatura, String paisOrigen)
	{
		super(fechaCaducidad, numLote);		
		this.codigoSupervision=codigoSupervision;	
		this.fechaEnvasado=fechaEnvasado;		
		this.temperatura=temperatura;		
		this.paisOrigen=paisOrigen;
	}
	//-----------------------------------------------------------------
	// getCodigoSupervision
	//-----------------------------------------------------------------	
	public int getCodigoSupervision() {
		return codigoSupervision;
	}
	//-----------------------------------------------------------------
	// setCodigoSupervision
	//-----------------------------------------------------------------	
	public void setCodigoSupervision(int codigoSupervision) {
		this.codigoSupervision = codigoSupervision;
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
		return "Producto Refrigerado [Fecha de caducidad: "+ this.getFechaCaducidad() + ", Numero de lote: " + this.getNumLote()  + 
				", Codigo de supervision: " + codigoSupervision + ", Fecha de envasado: " + fechaEnvasado + ", Temperatura: " + 
				temperatura + ", Pais de origen: " + paisOrigen + "] \n";			
	}	
}