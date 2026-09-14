package Recursion;

import java.util.Scanner;

public class EjercicioCuentaRegresiva {

	public static void main(String[] args) {
		cuentaRegresiva(50);

	}

	public static void cuentaRegresiva(int n) {
		if (n==0) {
			System.out.println("Despegue!");
			return;
		}
		System.out.println(n);
		cuentaRegresiva(n-1);
		
	}
}
	