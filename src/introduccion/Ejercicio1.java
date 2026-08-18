package introduccion;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numeroElegido=pedirNumero();
		int divisoresTotales=cantDivisores(numeroElegido);
		System.out.println("Ese numero tiene " + divisoresTotales + " divisores");
				
	}

	public static int cantDivisores(int numero) {
		int contador=0;
		for (int i=1;i<=numero;i++)
		if (numero%i==0)
		contador=contador+1;
		return contador;
	}
	 public static int pedirNumero() {
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Ingrese el numero a averiguar divisores:  ");
		    return scan.nextInt();
		    }
}
