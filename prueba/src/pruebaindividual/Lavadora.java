package pruebaindividual;
public class Lavadora extends Electrodomestico {
	public  int carga = 5;
	public  char consumoenergetico = 'F';
	public  String color = "blanco";
	
	/**
	 * 
	 */
	public Lavadora() {
		super();
		
	}

	/**
	 * @param peso
	 * @param precio
	 */
	public Lavadora(int peso, int precio) {
		super(peso, precio);

	}
	
	/**
	 * @param consumoenergetico
	 * @param color
	 * @param peso
	 * @param precio
	 * @param  
	 */
	public Lavadora(char consumoenergetico, String color, int peso, int precio, int carga  ) {
		super(consumoenergetico, color, peso, precio);
		this.precio= precio;
		this.carga = carga;
	}

	/**
	 * @return retorna variable carga
	 */
	public  int getCarga() {
		return carga;
	}
	
	/**
	 * retorna valor final dependiendo valor de carga 
	 * @param carga
	 * @return
	 */
	public  int getPrecioFinal(int carga) {
		int preciosobrecarga =super.getPrecioFinal();
		if (carga >= 30) {
			preciosobrecarga +=50000;
		}
		
		return  preciosobrecarga; 
		
	}

}
