package aplicacion;
/* Existen, tres tipos de productos congelados: congelados por aire, congelados por agua y congelados por nitrogeno. 
   Los productos congelados por aire deben incluir la informacion de la composicion del aire con que fue congelado 
   (% de nitrogeno, % de oxigeno, % de dioxido de carbono y % de vapor de agua). */
public class CongeladoAire extends ProductoCongelado{
	
	private float porcNitrogeno;
	private float porcOxigeno;
	private float porcDioxidoCarbono;
	private float porcVapor;
	
	public CongeladoAire (String fechaCaducidad, int numLote, String fechaEnvasado, float temperatura, String paisOrigen, 
			float porcNitrogeno, float porcOxigeno, float porcDioxidoCarbono, float porcVapor)
	{
		super(fechaCaducidad, numLote, fechaEnvasado, temperatura, paisOrigen);		
		this.porcNitrogeno=porcNitrogeno;
		this.porcOxigeno=porcOxigeno;
		this.porcDioxidoCarbono=porcDioxidoCarbono;
		this.porcVapor=porcVapor;
	}
	//-----------------------------------------------------------------
	// getPorcnitrogeno
	//-----------------------------------------------------------------	
	public float getPorcnitrogeno() {
		return porcNitrogeno;
	}
	//-----------------------------------------------------------------
	// setPorcNitrogeno
	//-----------------------------------------------------------------	
	public void setPorcnitrogeno(float porcNitrogeno) {
		this.porcNitrogeno = porcNitrogeno;
	}
	//-----------------------------------------------------------------
	// getPorcOxigeno
	//-----------------------------------------------------------------	
	public float getPorcOxigeno() {
		return porcOxigeno;
	}
	//-----------------------------------------------------------------
	// setPorcOxigeno
	//-----------------------------------------------------------------	
	public void setPorcOxigeno(float porcOxigeno) {
		this.porcOxigeno = porcOxigeno;
	}
	//-----------------------------------------------------------------
	// getPorcDioxidoCarbono
	//-----------------------------------------------------------------	
	public float getPorcDioxidoCarbono() {
		return porcDioxidoCarbono;
	}
	//-----------------------------------------------------------------
	// setPorcDioxidoCarbono
	//-----------------------------------------------------------------	
	public void setPorcDioxidoCarbono(float porcDioxidoCarbono) {
		this.porcDioxidoCarbono = porcDioxidoCarbono;
	}
	//-----------------------------------------------------------------
	// getPorcVapor
	//-----------------------------------------------------------------	
	public float getPorcVapor() {
		return porcVapor;
	}
	//-----------------------------------------------------------------
	// setPorcVapor
	//-----------------------------------------------------------------	
	public void setPorcVapor(float porcVapor) {
		this.porcVapor = porcVapor;
	}
	//-----------------------------------------------------------------
	// toString
	//-----------------------------------------------------------------	
	@Override
	public String toString() {
		return "Congelado por aire [Fecha de caducidad: "+ this.getFechaCaducidad() + ", Numero de lote: " + this.getNumLote() 
			+ ", Fecha de envasado: " + this.getFechaEnvasado() + ", Temperatura: "+ this.getTemperatura() + ", Pais de origen: "
			+ this.getPaisOrigen() + ", Porcentaje de Nitrogeno: " + porcNitrogeno + ", Porcentaje de Oxigeno: " + porcOxigeno + 
			", Porcentaje de Dioxido de Carbono: " + porcDioxidoCarbono + ", Porcentaje de vapor: " + porcVapor + "] \n";
	}	
}