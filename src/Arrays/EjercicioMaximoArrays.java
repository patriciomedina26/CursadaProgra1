package Arrays;

import java.util.Scanner;

public class EjercicioMaximoArrays {

	public static void main(String[] args) {
		int[] b= {1,5,-2,6,6};
		imprimir(b);
		System.out.println();
		System.out.println("maximo: "+maximo(b));
		int[] x=pedirArrays(3);
		imprimir(x);
		System.out.println();
		System.out.println("El maximo del array x es "+ maximo(x));
		
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
	
	public static void imprimir(int[] a) {
		System.out.print("[");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			if (i<a.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
	
	public static int[] pedirArrays(int n) {
		Scanner scan=new Scanner(System.in);
		int[] a=new int[n];
		for (int i=0;i<a.length;i++) {
			System.out.println("Ingrese el indice "+ i );
			a[i]=scan.nextInt();
		}
		return a;
	}
}
