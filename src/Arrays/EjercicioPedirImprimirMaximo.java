package Arrays;

import java.util.Scanner;

public class EjercicioPedirImprimirMaximo {

	public static void main(String[] args) {
		int[] b= {2,5,9,1,4,4};
		imprimir(b);
		System.out.print(maximo(b));
		System.out.println();
		int[] x=pedirArrays(4);
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
	
	public static int maximo(int[]a) {
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
		int[]a=new int[n];
		for (int i=0;i<a.length;i++) {
			System.out.println("Ingrese el indice "+ i);
			a[i]=scan.nextInt();
		}
		return a;
	}
	
	public static int[] pedirArrays2(int n) {
		Scanner scan=new Scanner(System.in);
		int[] a=new int[n];
		for (int i=0;i<a.length;i++) {
			System.put.println("Ingrese el indice "+ i);
			a[i]=scan.nextInt();
		}
		return a;
	}
}
