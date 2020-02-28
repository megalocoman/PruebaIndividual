package pruebaindividual;

import java.util.Arrays;

/**
 * superclase electrodomesticos
 * @author Cristian Jofre
 *
 */
public class Electrodomestico {

	private int PRECIOBASE = 100000;
	private  int PESOBASE = 5;
	private  char consumoenergetico ;
	private  String color ;
	private String[] colorArray = { "blanco", "negro", "rojo", "azul",  "gris" };
	public  int peso; // cambio nombre a peso en vez de tamano, unidad variables es en kilos
	public  int precio;
	

	/**
	 * Constructor por defecto
	 */
	public Electrodomestico() {
		this.setConsumoenergetico('F');
		this.setColor("blanco");
		this.setPeso(5);
		
	}
	
	/**
	 * constructor con parametros
	 * @param peso tamaño propio del objeto
	 * @param precio precio final
	 */
	public Electrodomestico(int peso, int precio) {
		
		
		this.precio = precio;
		this.setConsumoenergetico('F');
		this.setColor("blanco");
		this.setPeso(peso);
	}

	/**
	 * constructor con parametros
	 * @param consumoenergetico desde letra A a F
	 * @param color son blanco, negro, rojo, azul y gris son los colores disponibles
	 * @param peso tamaño propio del objeto
	 * @param precio precio final
	 */
	public Electrodomestico(char consumoenergetico, String color, int peso, int precio) {
		
		this.consumoenergetico = comprobarConsumoEnergetico( consumoenergetico);
		this.color = comprobarColor(color);
		this.peso = peso; // cambio nombre a peso en vez de tamano, unidad variables es en kilos
		this.precio = getPrecioFinal();
	
	}


	/**
	 * @return retorna consumoenergetico
	 */
	public char getConsumoenergetico() {
		return consumoenergetico;
	}

	/**
	 * @param consumoenergetico setea consumoenergetico 
	 */
	public void setConsumoenergetico(char consumoenergetico) {
		this.consumoenergetico = consumoenergetico;
	}

	/**
	 * @return retorna pESOBASE
	 */
	public  int getPESOBASE() {
		return PESOBASE;
	}

	/**
	 * @param pESOBASE setea pESOBASE 
	 */
	public  void setPESOBASE(int pESOBASE) {
		PESOBASE = pESOBASE;
	}

	/**
	 * @return retorna color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color setea color 
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return retorna peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @param peso setea peso 
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * @return retorna precio
	 */
	public  int getPrecio() {
		return precio;
	}

	/**
	 * metodo comprueba que  consumo energetico es valido, si no lo setea como F
	 * @param consumoenergetico
	 * @return
	 */
	public   char comprobarConsumoEnergetico(char consumoenergetico) {
		if (consumoenergetico<'A' || consumoenergetico>'F') {
			consumoenergetico = 'F';
		}
		return consumoenergetico;
	}

	/**
	 * metodo comprueba que color es valido, si no lo setea como blanco
	 * @param color
	 * @return
	 */
	public  String comprobarColor(String color) {
		if (!(Arrays.asList(colorArray).contains(color))) {
			color= "blanco";
		}

		return color;
	}

	/**
	 * retorna precio final dependiendop del peso y consumo energetico del producto.
	 * @param consumoenergetico
	 * @param peso
	 * @return
	 */
	public  int getPrecioFinal( ) {
		int precioadicional = 0;
		

		switch(consumoenergetico) {
		case 'A':
			precioadicional +=100000;
			break;
		case 'B':
			precioadicional += 80000;
			break;
		case 'C':
			precioadicional += 60000;
			break;
		case 'D':
			precioadicional += 50000;
			break;
		case 'E':
			precioadicional += 30000;
			break;
		case 'F':
			precioadicional += 10000;
			break;
		default:
		
		}


		if (peso+PESOBASE >0 && peso+PESOBASE <20) {
			precioadicional+= 10000;
		}
		else if(peso+PESOBASE>=20 && peso+PESOBASE <50) {
			precioadicional+= 50000;
		}
		else if(peso+PESOBASE>= 50 &&peso+PESOBASE <80) {
			precioadicional+= 80000;
		}
		else if(peso+PESOBASE >=80) {
			precioadicional+= 100000;
		}

		return precioadicional +precio + PRECIOBASE;	
	}			
}
