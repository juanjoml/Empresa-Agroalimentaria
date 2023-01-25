package aplicacion;
/* Todos los productos poseen esta informacion comun: fecha de caducidad y numero de lote. */
public abstract class Producto {
	
	protected String fechaCaducidad;	
	protected int numLote;
	
	public Producto (String fechaCaducidad, int numLote)
	{
		this.fechaCaducidad=fechaCaducidad;
		this.numLote=numLote;
	}
	//-----------------------------------------------------------------
	// getFechaCaducidad
	//-----------------------------------------------------------------	
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	//-----------------------------------------------------------------
	// setFechaCaducidad
	//-----------------------------------------------------------------	
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	//-----------------------------------------------------------------
	// getNumLote
	//-----------------------------------------------------------------	
	public int getNumLote() {
		return numLote;
	}
	//-----------------------------------------------------------------
	// setNumLote
	//-----------------------------------------------------------------	
	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}	
}