package aplicacion;
/* /Existen, tres tipos de productos congelados: congelados por aire, congelados por agua y congelados por nitrogeno. 
   Los productos congelados por agua deben llevar la informacion de la salinidad del agua con que se realiza la congelacion 
   en gramos de sal por litro de agua. */
public class CongeladoAgua extends ProductoCongelado{
	
	private float salinidadAgua;
	
	public CongeladoAgua (String fechaCaducidad, int numLote, String fechaEnvasado,
			float temperatura, String paisOrigen, float salinidadAgua)			
	{	 
		super(fechaCaducidad, numLote, fechaEnvasado, temperatura, paisOrigen);			
		this.salinidadAgua=salinidadAgua;		
	}
	//-----------------------------------------------------------------
	// getSalinidadAgua
	//-----------------------------------------------------------------	
	public float getSalinidadAgua() {
		return salinidadAgua;
	}
	//-----------------------------------------------------------------
	// setSalinidadAgua
	//-----------------------------------------------------------------	
	public void setSalinidadAgua(float salinidadAgua) {
		this.salinidadAgua = salinidadAgua;
	}
	//-----------------------------------------------------------------
	// toString
	//-----------------------------------------------------------------	
	@Override
	public String toString() {
		return "Congelado por agua [Fecha de caducidad: "+ this.getFechaCaducidad() + ", Numero de lote: " + this.getNumLote()  
				+ ", Fecha de envasado: " + this.getFechaEnvasado() + ", Temperatura: "+ this.getTemperatura() + 
				", Pais de origen: " +  this.getPaisOrigen() + ", Salinidad del agua: " + salinidadAgua + "] \n";
	}	
}