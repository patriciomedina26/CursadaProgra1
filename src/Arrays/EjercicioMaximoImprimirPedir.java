package Arrays;

import java.util.Scanner;

public class EjercicioMaximoImprimirPedir {

	public static void main(String[] args) {
		int[]b= {1,2,3,4,5};
		imprimir(b);
		System.out.println();
		System.out.println("maximo: "+ maximo(b));
		int[] x=pedirArrays(5);
		imprimir(x);
	}

	public static void imprimir(int[]a) {
		System.out.print("[");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			if (i<a.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	
	public static int maximo(int[] a) {
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			if (max<a[i]) {
				max=a[i];
			}
		}
		return max;	
	}
	
	public static int[] pedirArrays(int n) {
		Scanner scan=new Scanner(System.in);
		int[] a=new int[n];
		for (int i=0;i<a.length;i++) {
			System.out.println("Ingrese el numero en el indice "+ i);	
			a[i]=scan.nextInt();
		}
		return a;
	}
}
