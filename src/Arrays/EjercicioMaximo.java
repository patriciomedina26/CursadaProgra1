package Arrays;

import java.util.Scanner;

public class EjercicioMaximo {

	public static void main(String[] args) {
		int[]x= {1,8,9,3};
		System.out.println("El maximo es " + maximo(x));
		System.out.println();
		int[]w=pedirArrays(4);
		System.out.println("el maximo es " + maximo(w));
	}
	
	public static int maximo(int[] a) {
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	
	public static int[] pedirArrays(int n) {
		Scanner scan=new Scanner(System.in);
		int[] a=new int[n];
			for (int i=0;i<a.length;i++) {
				System.out.println("Ingrese el numero en la posicion "+i);
				a[i]=scan.nextInt();
			}
			return a;
	}

}
