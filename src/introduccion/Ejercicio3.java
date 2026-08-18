package introduccion;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numeroElegido=pedirNumero();
		int numeroFinal=siguientePrimo(numeroElegido);
		System.out.println("El numero elegido es " + numeroElegido + " y el numero primo siguiente es " + numeroFinal);
	
	}

	public static boolean esPrimo(int numero) {
		boolean resultado = false;
		int contador=0;
		for (int i=1;i<=numero;i++)
		if (numero%i==0)
		contador=contador+1;
		if (contador>=3) {
		resultado = false;
		}
		else {
		resultado = true;
		}
		return resultado;
		}
	 public static int pedirNumero() {
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Ingrese un numero: ");
		    return scan.nextInt();
		    }
	 public static int siguientePrimo(int numero) {
		 int siguiente=numero+1;
		 while (esPrimo(siguiente)==false) {
			 siguiente=siguiente+1;
			}
		 return siguiente;
	 }
}
