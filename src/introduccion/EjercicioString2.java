package introduccion;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	    // 1. Pedimos la palabra
	    String palabraElegida = pedirPalabra();
	    
	    // 2. Ejecutamos la función y guardamos el true/false
	    boolean resultado = soloE(palabraElegida);
	    
	    // 3. Evaluamos con if/else para imprimir la respuesta correcta
	    if (resultado) {
	        System.out.println("La palabra " + palabraElegida + " solo contiene 'e'.");
	    } else {
	        System.out.println("La palabra " + palabraElegida + " NO contiene solamente 'e'.");
	    }
	}
	public static String pedirPalabra() {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Ingrese una palabra: ");
	    return scan.nextLine();
	 }
	public static boolean soloE(String palabra) {
	    for (int i = 0; i < palabra.length(); i++) {
	        // Si encuentra algo distinto de 'e', ya sabemos que no cumple
	        if (palabra.charAt(i) != 'e') {
	            return false; 
	        }
	    }
	    // Si el bucle terminó, es porque eran todas 'e'
	    return true; 
	}
}
