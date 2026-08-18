package introduccion;

import java.util.Scanner;

public class Hola {

	    public static void main(String[] args) {
	    System.out.println(saludar() + " " + pedirNombre());
	    }
	    public static String saludar() {
	    String saludo="hola";
	    return saludo;
	    }
	    public static String pedirNombre() {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Ingrese su nombre: ");
	    return scan.nextLine();
	    }
}				