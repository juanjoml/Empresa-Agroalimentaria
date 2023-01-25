package aplicacion;
/* Se pretende desarrollar una aplicacion que gestione una empresa agroalimentaria que trabaja con tres tipos de productos: 
   productos frescos, productos refrigerados y productos congelados. 
   Todos los productos poseen esta informacion comun: fecha de caducidad y numero de lote. 
   A su vez, cada tipo de producto incorpora alguna informacion especifica. */

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
	
	public static ArrayList<Producto> lista = new ArrayList<Producto>(); // Creo un ArrayList vacio para meter todos mis productos.

	public static void main(String[] args) {
		
		int iteracion=1;
		
		Scanner scan = new Scanner (System.in);
		
		while (iteracion==1)	// Creamos un bucle infinito con un menu con opciones, incluida salir del bucle).
		{
			System.out.println();
			System.out.println("Menu de Empresa Agroalimentaria");
			System.out.println("\t1. Introduce un nuevo producto");
			System.out.println("\t2. Lista de productos");
			System.out.println("\t3. Vender un producto por numero de lote");
			System.out.println("\t4. Salir");
			System.out.println();
			System.out.print("Introduce una opcion: ");
			
			int opcion =scan.nextInt();		// Introducimos la opcion.
			
			switch(opcion)
			{
				case 1:
				{
					introducirProducto(); // Llamamos a la funcion introducirProducto.
					break;
				}
			case 2:
				{
					
					listarProductos();	// Llamamos a la funcion listarProductos.
					break;
				}
			case 3:
				{
					venderProducto();	// Llamamos a la funcion venderProducto.
					break;
				}
			case 4:
				{
					iteracion=0;	// Salimos del bucle y del menu.
					break;
				}
			
			}
		}
	}
	//-----------------------------------------------------------------
	// introducirProducto
	//-----------------------------------------------------------------	
	public static void introducirProducto()
	{
		Scanner scan = new Scanner(System.in);		// Metemos los atributos del objeto Producto (comun a todos):	
		System.out.print("");		
		System.out.print("Introduce la fecha de caducidad: ");		
		String fechaCaducidad = scan.next();		
		System.out.print("Introduce el numero de lote: ");		
		int numLote = scan.nextInt();		
		System.out.print("Introduce: 1. Produco fresco 2. Producto refrigerado 3. Producto congelado: ");		
		int tipo = scan.nextInt();					// Elijo uno de los 3 tipos de Producto
		
			switch (tipo)
			{
			case 1:
			{
				System.out.print("");		// Metemos los atributos del objeto ProductoFresco:			
				System.out.print("\n Producto fresco: \n");				
				System.out.print("Introduce la fecha de envasado: ");				
				String fechaEnvasado = scan.next();				
				System.out.print("Introduce el pais de origen: ");				
				String paisOrigen = scan.next();
											// Creo una instancia de ProductoFresco.
				ProductoFresco producto = new ProductoFresco(fechaCaducidad, numLote, fechaEnvasado, paisOrigen);
				
				lista.add(producto);	// Y con el metodo add, lo agregamos a la lista.					
				break;				
			}
			case 2:
			{				
				System.out.print("");		// Metemos los atributos del objeto ProductoRefrigerado:					
				System.out.print("\n Producto refrigerado: \n");				
				System.out.print("Introduce el codigo de supervision: ");				
				int codigoSupervision = scan.nextInt();				
				System.out.print("Introduce la fecha de envasado: ");				
				String fechaEnvasado = scan.next();				
				System.out.print("Introduce la temperatura: ");				
				float temperatura = scan.nextFloat();				
				System.out.print("Introduce el pais de origen: ");				
				String paisOrigen = scan.next();
											// Creo una instancia de ProductoRefrigerado.
				ProductoRefrigerado producto = new ProductoRefrigerado(fechaCaducidad, numLote, codigoSupervision, 
						fechaEnvasado, temperatura, paisOrigen);
				
				lista.add(producto);		// Y con el metodo add, lo agregamos a la lista.					
				break;				
			}
			case 3:
			{
				System.out.print("");	// Metemos los atributos del objeto ProductoCongelado (comun a los 3 tipos congelados):					
				System.out.print("\n Producto congelado: \n");								
				System.out.print("Introduce la fecha de envasado: ");				
				String fechaEnvasado = scan.next();				
				System.out.print("Introduce la temperatura: ");				
				float temperatura = scan.nextFloat();				
				System.out.print("Introduce el pais de origen: ");				
				String paisOrigen = scan.next();				
				System.out.print("Introduce: 1. Congelado por aire 2. Congelado por agua 3. Congelado por nitrogeno: ");				
				int congelacion = scan.nextInt();		// Elijo uno de los 3 tipos de Producto congelado
				
					switch(congelacion)
					{
						case 1: 
						{
							System.out.print("\n 1. Congelado por aire \n");	// Metemos los atributos del objeto CongeladoAire						
							System.out.print("Introduce porcentaje de Nitrogeno: ");						
							float porcNitrogeno = scan.nextFloat();						
							System.out.print("Introduce porcentaje de Oxigeno: ");							
							float porcOxigeno = scan.nextFloat();							
							System.out.print("Introduce porcentaje de Dioxido de Carbono: ");							
							float porcDioxidoCarbono = scan.nextFloat();							
							System.out.print("Introduce porcentaje de vapor de agua: ");							
							float porcVapor = scan.nextFloat();	
														// Creo una instancia de CongeladoAire.
							CongeladoAire producto = new CongeladoAire(fechaCaducidad, numLote, fechaEnvasado, temperatura, 
									paisOrigen, porcNitrogeno, porcOxigeno, porcDioxidoCarbono, porcVapor);
							
							lista.add(producto);	// Y con el metodo add, lo agregamos a la lista.									
							break;
						}
						case 2:
						{							
							System.out.print("\n 1. Congelado por agua \n");	// Metemos los atributos del objeto CongeladoAgua						
							System.out.print("Introduce la salinidad del agua: ");							
							float salinidadAgua = scan.nextFloat();
														// Creo una instancia de CongeladoAgua.
							CongeladoAgua producto = new CongeladoAgua(fechaCaducidad, numLote, fechaEnvasado,
									temperatura, paisOrigen, salinidadAgua);
							
							lista.add(producto);	// Y con el metodo add, lo agregamos a la lista.							
							break;
						}
						case 3:
						{							
							System.out.print("\n 1. Congelado por nitrogeno \n");	// Metemos los atributos del objeto CongeladoNitrogeno						
							System.out.print("Introduce el tiempo de exposicion: ");							
							int tiempoExposicion = scan.nextInt();
															// Creo una instancia de CongeladoNitrogeno.
							CongeladoNitrogeno producto = new CongeladoNitrogeno(fechaCaducidad, numLote, fechaEnvasado,
									temperatura, paisOrigen, tiempoExposicion);
							
							lista.add(producto);	// Y con el metodo add, lo agregamos a la lista.							
							break;
						}
					}				
				break;							
				}
			}
	}
	//-----------------------------------------------------------------
	// listarProductos
	//-----------------------------------------------------------------	
	public static void listarProductos()
		{			
			System.out.println(lista.toString());	// Imprimimos la lista con toString (convierte la lista en una cadena).
		}
	//-----------------------------------------------------------------
	// venderProducto
	//-----------------------------------------------------------------			
	public static void venderProducto()
	{		
		Scanner scan = new Scanner (System.in);		
		System.out.print("Introduce el numero de lote: ");		
		int numLote = scan.nextInt();
			
			for (int i=0; i<lista.size(); i++) { // Recorremos el ArrayList y el objeto que coincida con el numero de lote pasado, lo borramos.
				
				Producto p = lista.get(i); // Tambien hubiera valido no hacer esta instancia, y:
				
				if(p.numLote==numLote) // if(lista.get(i).getNumLote == numLote);
				{
					lista.remove(i);
					System.out.print("\nProducto vendido\n");		

				}
			}
	}
}