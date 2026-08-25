package introduccion;

import java.util.Scanner;

public class EjercicioString4 {

    public static void main(String[] args) {
        String palabra1=pedirPalabra();
        String palabra2=pedirPalabra();
    boolean resultado=esPrefijo(palabra1,palabra2);
    if (resultado) {
    	System.out.println("Si es prefijo");
    } else {
    	System.out.println("No es prefijo");
    }
}

    public static String pedirPalabra() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        return scan.nextLine();
    }

    public static boolean esPrefijo(String prefijo, String s) {
    	for (int i=0;i<prefijo.length();i++) {
    		if (prefijo.charAt(i)!= s.charAt(i)) {
    			return false;
    			
    		}
    	}
    	return true;
    }
   }
