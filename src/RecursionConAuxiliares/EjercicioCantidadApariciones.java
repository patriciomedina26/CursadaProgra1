package RecursionConAuxiliares;

public class EjercicioCantidadApariciones {

	public static void main(String[] args) {
        int[] datos = {1, 3, 5, 3, 7, 3, 9};
        int numeroBuscado = 5;
        
        // Debería imprimir 3 (el número 3 aparece 3 veces)
        System.out.println(cantidadApariciones(datos, numeroBuscado));
    }

    // 1. Wrapper / Envoltorio
    public static int cantidadApariciones(int[] a, int n) {
        return cantidadAparicionesRango(a, n, 0, a.length - 1);
    }

    // 2. Función Auxiliar con Rangos
    public static int cantidadAparicionesRango(int[] a, int n, int d, int h) {
        // CASO BASE: Si el índice 'd' superó al límite 'h' o está fuera del arreglo
        if (d > h || d >= a.length) {
            return 0;
        }

        // PASO RECURSIVO:
        // Si el elemento actual coincide con 'n', sumamos 1 y seguimos buscando
        if (a[d] == n) {
            return 1 + cantidadAparicionesRango(a, n, d + 1, h);
        } else {
            // Si no coincide, sumamos 0 y seguimos buscando
            return cantidadAparicionesRango(a, n, d + 1, h);
        }
    }
}
