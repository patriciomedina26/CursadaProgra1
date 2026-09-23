package RecursionConAuxiliares;

import java.util.Scanner;

public class EjercicioSuma {

	public static void main(String[] args) {
		int[] a=pedirArrays(5);
		System.out.println(suma(a));
	}

	public static int suma(int[] a) {
		return sumaRango(a,0,a.length-1);
	}
	
	public static int sumaRango(int[] a, int b, int c) {
		if (b>c || b>a.length) {
			return 0;
		}
		return a[b] + sumaRango(a,b+1,c);
	}
	
	public static int[] pedirArrays(int n) {
		Scanner scan= new Scanner(System.in);
		int[] a=new int[n];
		for (int i=0;i<a.length;i++) {
		System.out.println("Ingresde el numero en el indice " +  i);
			a[i]=scan.nextInt();
		}
		return a;
		}
	}
