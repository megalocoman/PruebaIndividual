package pruebaindividual;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Main class donde se ejecutan el programa
 * @author Cristian Jofre
 *
 */
public class MainPruebaIndividual {

	/**
	 * metodo static que convierte int a String formato peso chileno
	 * @param precio
	 * @return
	 */
	static String convertirAPesos(int precio) {
		Locale local = new Locale("es", "CL"); 
		NumberFormat formatomoneda  = NumberFormat.getCurrencyInstance(local);
		
		return formatomoneda.format(precio).replace("Ch",""); 
	}
	
	/**
	 * metodo main
	 * @param args
	 */

	public static void main(String[] args) {
		
		Electrodomestico E1 = new Electrodomestico(60, 500000);
		Electrodomestico E2 = new Electrodomestico(50, 400000);
		Electrodomestico E3 = new Electrodomestico(40, 300000);
		Electrodomestico E4 = new Electrodomestico(30, 250000);
	
		Television T1= new Television('A', "negro", 60, 200000, 26, false);
		Television T2= new Television('B', "gris", 10, 150000, 20, true);
		Television T3= new Television('B', "blanco", 30, 300000, 40, true);
		
		Lavadora L1 = new Lavadora('A', "negro", 60, 200000, 2);
		Lavadora L2 = new Lavadora('B', "gris", 100, 300000, 50);
		Lavadora L3 = new Lavadora('B', "blanco", 80, 400000, 45);
		
		
		
		
		Electrodomestico arrayelectrodomesticos[] = {E1, E2, E3, E4, T1, T2, T3, L1, L2, L3};
		System.out.println("*************************************************************************");
		System.out.println("Bienvenido a Cocilamp");
		System.out.println("Lista de productos y precios");
		System.out.println("*************************************************************************");
		int preciototal = 0;
		
		for ( int i = 0; i <arrayelectrodomesticos.length; i++) {
			if (arrayelectrodomesticos[i] instanceof Television ) {
				preciototal+= arrayelectrodomesticos[i].getPrecioFinal();
				System.out.println("Televisor precio individual: "+ convertirAPesos(arrayelectrodomesticos[i].getPrecioFinal())+
						" precio total: "+ convertirAPesos(preciototal));
			}
			else if(arrayelectrodomesticos[i] instanceof Lavadora) {
				preciototal+= arrayelectrodomesticos[i].getPrecioFinal();
				System.out.println("Lavadora precio individual: "+ convertirAPesos(arrayelectrodomesticos[i].getPrecioFinal())+
						" precio total: "+ convertirAPesos(preciototal));
			}
			else {
				preciototal+= arrayelectrodomesticos[i].getPrecioFinal();
				System.out.println("Electrodomestico generico precio individual: "+ convertirAPesos(arrayelectrodomesticos[i].getPrecioFinal())+
						" precio parcial: "+ convertirAPesos(preciototal));
			}
		}
		System.out.println("*************************************************************************");
		System.out.println("valor total: "+convertirAPesos(preciototal));	
		System.out.println("*************************************************************************");
	}
}