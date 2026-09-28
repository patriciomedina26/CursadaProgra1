package RecursionConAuxiliares;

import java.util.Scanner;

public class EjercicioCantidadPares {

	public static void main(String[] args) {
		int[] a=pedirArrays(5);
		System.out.println(cantidadPares(a));
	}
	
	public static int cantidadPares(int [] a) {
		return cantidadParesRango(a,0,a.length-1);
	}
	
	public static int cantidadParesRango(int[] a,int d, int h) {
		if (d>h) {
			return 0;
		}
		if (a[d]%2==0) {
			return 1 + cantidadParesRango(a,d+1,h); 
		} else {
		return cantidadParesRango(a,d+1,h);
		}
		}

	public static int[] pedirArrays(int n) {
		Scanner scan=new Scanner(System.in);
		int[] a= new int[n];
		for (int i=0;i<a.length;i++) {
			System.out.println("Ingrese el numero en la posicion " + i);
			 a[i] = scan.nextInt();
			}
		return a;
		}
	}

