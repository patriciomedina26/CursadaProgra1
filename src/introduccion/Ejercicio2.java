package introduccion;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numeroElegido=pedirNumero();
		boolean numeroFinal=esPrimo(numeroElegido);
		System.out.println("¿El numero es primo?: " + numeroFinal);		
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
		    System.out.println("Ingrese el numero a para saber si es primo o no:  ");
		    return scan.nextInt();
		    }
}
