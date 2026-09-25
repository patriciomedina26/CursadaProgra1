package RecursionConAuxiliares;

public class EjercicioMaximo {

	public static void main(String[] args) {
		int[] a={3,8,2,10,5};
		System.out.println(maximo(a));
	}

	public static int maximo(int[] a) {
		return maximoRango(a,0,a.length-1);
	}
	
	public static int maximoRango(int[] a,int d,int h) {
		if (d==h) {
			return a[d];
		}
		int maxResto=maximoRango(a,d+1,h);
		if (a[d]>maxResto) {
			return a[d];
		} else {
			return maxResto;
		}
	}
}
