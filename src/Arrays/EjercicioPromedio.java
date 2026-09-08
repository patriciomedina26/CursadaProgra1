package Arrays;

public class EjercicioPromedio {

	public static void main(String[] args) {
		int[] a= {1,5,9,7,1};
		imprimir(a);
		System.out.println("promedio: " + promedio(a));
		
	}
	
	public static double promedio(int[] a) {
		double suma=0.0;
		for (int i=0;i<a.length;i++) {
			suma+=a[i];
		}
		double prom=suma/a.length;
		return prom;
	}
	
	public static void imprimir(int[] a) {
		System.out.print("[");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println("]");
	}

}
