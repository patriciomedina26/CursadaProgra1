package RecursionConAuxiliares;

import java.util.Scanner;

public class EjercicioPertenece {

	public static void main(String[] args) {
		int [] a=pedirArrays(5);
		int i=pedirInt();
		System.out.println(pertenece(a,i));
    }
	
	public static boolean pertenece(int[]a,int i) {
		return perteneceRango(a,i,0,a.length-1);
	}
	
	public static boolean perteneceRango(int[]a,int i,int d,int h) {
		if (d>h || h>a.length) {
			return false;
		}
		if (a[d]!=i) {
		return perteneceRango(a,i,d+1,h);
		}
		if (a[d]==i) {
			return true;
		}
		return false;
	}
	
	public static int pedirInt() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		return scan.nextInt();
		
	}
	
	public static int[]	pedirArrays(int n) {
		Scanner scan=new Scanner(System.in);
		int[] a=new int[n];
		for (int i=0;i<a.length;i++) {
		System.out.println("Ingrese el numero en la posicion " + i);
		a[i]=scan.nextInt();
		}
		return a;
	}
}
