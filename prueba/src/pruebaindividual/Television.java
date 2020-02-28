package pruebaindividual;

/**
 * subclase televisor, modifica precio dependiendo del tamaño de la pantalla 
 * y sintonizador TDT 
 * 
 * @author Alumno
 *
 */
public class Television extends Electrodomestico {

	public  int resolucion = 20;
	public  boolean sintonizadorTDT = false;
	public  char consumoenergetico = 'F';
	public  String color = "blanco";

	/**
	 * constructor por defecto
	 */
	public Television() {
		super();
		
	}
	
	/**
	 * constructor  con peso y precio
	 * @param peso
	 * @param precio
	 */
	public Television(int peso, int precio) {
		super(peso, precio);
	}
	
	/**
	 * constructor completo
	 * @param consumoenergetico
	 * @param color
	 * @param peso
	 * @param precio
	 */
	public Television(char consumoenergetico, String color, int peso, int precio, int resolucion, boolean sintonizadorTDT ) {
		super(consumoenergetico, color, peso, precio);
		this.precio = precio;
	}
	
	/**
	 * @return retorna variable resolucion
	 */
	public  int getResolucion() {
		return resolucion;
	}

	/**
	 * @return retorna variable  sintonizadorTDT
	 */
	public  boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	/**
	 * retorna precio final dependiendo valor de la resolucion y presencia de sintonizador.
	 * @param resolucion
	 * @param sintonizadorTDT
	 * @return
	 */
	public  int getPrecioFinal(int resolucion, boolean sintonizadorTDT) {
		double adicional= super.getPrecioFinal();
		
		if (resolucion>40) {
			adicional *= 1.3;
		}
		
		if (sintonizadorTDT) {
			adicional +=50000;
		}
	
		return (int)  adicional;
	}

}
