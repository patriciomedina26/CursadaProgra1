package Arrays;

import java.util.Scanner;

public class EjercicioDarVueltaElArray {

	public static void main(String[] args) {
	int[]x= {1,2,3,4,};
	imprimir(x);
	System.out.println();
	imprimir(invertir(x));
	int[]w=pedirArrays(4);
	imprimir(w);
	imprimir(invertir(w));
	}
	
	public static int[] invertir(int[]a) {
		int[]rev= new int[a.length];
			for (int i=0;i<a.length;i++) {
				rev[i]=a[a.length-1-i];
			}
			return rev;
	}
	
	public static void imprimir(int[] a) {
		System.out.print("[");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			if (i<a.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	
	public static int[] pedirArrays(int n) {
		Scanner scan=new Scanner(System.in);
		int[]a=new int[n];
		for (int i=0;i<a.length;i++) {
			System.out.println("Ingrese el numero en la posicion " + i);
			a[i]=scan.nextInt();
		}
		return a;
	}

}
