package RecursionConAuxiliares;

import java.util.Scanner;

public class EjercicioEstaOrdenado {

	public static void main(String[] args) {
	int[] a=pedirArrays(5);
	System.out.println(estaOrdenado(a));
	}
	
	public static boolean estaOrdenado(int[] a) {
		return estaOrdenadoRango(a,0,a.length-1);
	}
	
	public static boolean estaOrdenadoRango(int[] a,int d, int h) {
		if (d>=h) {
			return true;
		}
		if (a[d]<=a[d+1]) {
			return estaOrdenadoRango(a,d+1,h);
		}
		if (a[d]>a[d+1]) {
		return false;
		}
		return false;
	}

	public static int[] pedirArrays(int n) {
		Scanner scan= new Scanner(System.in);
		int[] a=new int[n];
		for (int i=0;i<a.length;i++) {
			System.out.println("Ingrese el numero en la posicion " + i);
			a[i]= scan.nextInt();
		}
		return a;
	}
}
