package Arrays;

import java.util.Scanner;

public class EjercicioPedirArrays {

	public static void main(String[] args) {
		imprimir(pedirArray(5));
		

	}
	
	public static int[] pedirArray(int n) {
		Scanner scan=new Scanner(System.in);
		int[] a=new int[n];
		for (int i=0;i<a.length;i++) {
			System.out.println("Inregse el indice en la posicion  "+i);
			a[i]=scan.nextInt();
		}
		return a;
	}
	
	public static void imprimir(int[] a) {
		System.out.print("[");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			System.out.print(",");
		}
		System.out.println("]");
	}

}
