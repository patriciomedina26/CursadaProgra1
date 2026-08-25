package introduccion;

import java.util.Scanner;

public class EjercicioString5 {

    public static void main(String[] args) {
        String palabra1=pedirPalabra();
        String palabra2=pedirPalabra();
    boolean resultado=esPrefijoDesde(palabra1,palabra2,3);
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

    public static boolean esPrefijoDesde(String prefijo, String s, int pos) {
    	for (int i=0;i<prefijo.length();i++) {
    		if (prefijo.charAt(i)!= s.charAt(pos + i)) {
    			return false;
    			
    		}
    	}
    	return true;
    }
   }