package Arrays;

import java.util.Scanner;

public class EjercicioDivisoresDeN {

	public static void main(String[] args) {
		int[]x=pedirArrays(4);
		imprimir(x);
		boolean valor=todosDivisores(x,24);
		System.out.print(valor);
	}

	public static int[] pedirArrays(int n) {
		Scanner scan= new Scanner(System.in);
		int[] a=new int[n];
		for (int i=0;i<a.length;i++) {
			System.out.println("Ingrese el numero en el indice " + i);
			a[i]=scan.nextInt();
		}
		return a;
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
	
	public static boolean todosDivisores(int[] a,int n) {
		for (int i=0;i<a.length;i++) {
			if (a[i]==0) {
				System.out.println("Ingrese un valor distinto de 0 la proxima vez");
				return false;
			}
			if (n%a[i]!=0) {
				return false;
			}
		}
		return true;
	}
}
