package aplicacion;
/* Todos los productos poseen esta informacion comun: fecha de caducidad y numero de lote. 
   A su vez, cada tipo de producto incorpora alguna informacion especifica. 
   Los productos frescos contienen la fecha de envasado y el pais de origen. */
public class ProductoFresco extends Producto{
	
	protected String fechaEnvasado;	
	protected String paisOrigen;
	
	public ProductoFresco (String fechaCaducidad, int numLote, String fechaEnvasado, String paisOrigen)
	{
		super(fechaCaducidad, numLote);		
		this.fechaEnvasado=fechaEnvasado;
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
		return "Producto Fresco [Fecha de caducidad: "+ this.getFechaCaducidad() + ", Numero de lote: " + this.getNumLote() 
		+ ", Fecha de envasado: " + fechaEnvasado + ", Pais de origen: " + paisOrigen + "] \n";
	}	
}