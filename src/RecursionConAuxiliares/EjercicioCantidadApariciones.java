package RecursionConAuxiliares;

public class EjercicioCantidadApariciones {

	public static void main(String[] args) {
        int[] datos = {1, 3, 5, 3, 7, 3, 9};
        int numeroBuscado = 5;
        System.out.println(cantidadApariciones(datos, numeroBuscado));
    }

    public static int cantidadApariciones(int[] a, int n) {
        return cantidadAparicionesRango(a, n, 0, a.length - 1);
    }
    public static int cantidadAparicionesRango(int[] a, int n, int d, int h) {
        if (d > h || d >= a.length) {
            return 0;
        }
        if (a[d] == n) {
            return 1 + cantidadAparicionesRango(a, n, d + 1, h);
        } else {
            return cantidadAparicionesRango	(a, n, d + 1, h);
        }
    }
}
