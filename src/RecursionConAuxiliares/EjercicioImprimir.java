package RecursionConAuxiliares;

import java.util.Scanner;

public class EjercicioImprimir {

	public static void main(String[] args) {
		int[] x=pedirArray(5);
		imprimir(x);
	}
	
	public static void imprimir(int[] z) {
		imprimirRango(z,0);
	}
	
	public static void imprimirRango(int[] a,int b) {
		if (b==a.length) {
			return;
		}
		if (b==0) {
			System.out.print("[");
		}
		System.out.print(a[b]);
		if (b<a.length-1) {
			System.out.print(",");
		}
		
		if (b==a.length-1) {
			System.out.print("]");
		}
		imprimirRango(a,b+1);
	}
	
	public static int[] pedirArray(int n) {
		Scanner scan=new Scanner(System.in);
		int[] a= new int[n];
		for (int i=0;i<a.length;i++) {
		System.out.println("Ingrese el numero en la posicion " + i);
		a[i]=scan.nextInt();
		}
		return a;
	}

}
