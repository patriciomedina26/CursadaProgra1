package Arrays;

public class EjercicioArraysPrint {

	public static void main(String[] args) {
	int[] a={2,5,11,2};
	imprimir(a);
	int[] b= {1,2,3,4,5,6,7,8,9};
	imprimir(b);

	}
		
	public static void imprimir(int[] a) {
		System.out.print("[");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
	}

}
