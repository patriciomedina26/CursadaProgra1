package Arrays;

import java.util.Scanner;

public class EjercicioPedirArraysConWhile {

	public static void main(String[] args) {
		
		int[] x=pedirArraysP(4);
		imprimir(x);
		imprimir(invertir(x));
	}
	
	public static int[] pedirArraysP(int n) {
		Scanner scan= new Scanner(System.in);
		int[] a=new int[n];
		for (int i=0;i<a.length;i++) {
			System.out.println("Ingrese el numero en la posicion " + i);
			int num= scan.nextInt();
			while (num <= 0) { 
	            System.out.println("Error: Ingrese un numero positivo para el indice " + i);
	            num = scan.nextInt();
	        }
			a[i] = num;
			}
		return a;
		}
	
		public static void imprimir(int[] a) {
			System.out.print("[");
			for (int i=0;i<a.length;i++){
				System.out.print(a[i]);
				if (i<a.length-1) {
					System.out.print(",");
				}
			}
			System.out.println("]");
			
		}
		
		public static int[] invertir(int[] a) {
			int[] rev= new int[a.length];
			for (int i=0;i<a.length;i++) {
				rev[i]=a[a.length-1-i];
			}
			return rev;
		}
	}

