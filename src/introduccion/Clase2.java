package introduccion;

public class Clase2 {

	public static void main(String[] args) {
		int a = suma(2,3);
		System.out.println("La suma de a y b es: " + a);
		int n=3;
		if (a%2==0) {
		System.out.println("A es par");
	}
		else {
		System.out.println("A es impar");
	}
		if (a%2==0 && n%3==0) {
			System.out.println(saludar("Messi"));
	} 
		else {
			System.out.println(saludar("ungs"));
	}
		int i=5; 
			while (i>0) { 
				System.out.print(i);
				i=i-1;
			}
			System.out.println();
		for (int j=0;j<5;j++) {
			System.out.println(j);
		}
				
	}	
	public static int suma(int a, int b) {
		return a + b;
	}	
	public static String saludar(String textoRecibido) {
		return textoRecibido;
	}
}
