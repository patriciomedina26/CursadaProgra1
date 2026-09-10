package Arrays;

import java.util.Scanner;

public class EjercicioPromedio {

	public static void main(String[] args) {
		int[]x= {1,8,3,9};
		System.out.println(promedio(x));
		int[]w=pedirArrays(4);
		System.out.println();
		System.out.println(promedio(w));

	}
	
	public static double promedio(int[] a) {
		double suma=0.0;
		for (int i=0;i<a.length;i++) {
			suma+=a[i];
		}
		double promedio=suma/a.length;
		return promedio;
	}
	
	public static int[] pedirArrays(int n) {
		Scanner scan=new Scanner(System.in);
		int[] a=new int[n];
		for (int i=0;i<a.length;i++) {
			System.out.println("Ingrese el numero en el indice " + i);
			a[i]=scan.nextInt();
		}
		return a;
	}

}
