package Recursion;

public class EjercicioBuscar {

	public static void main(String[] args) {
		int[] a={0,4,8,7,2,4,6,1,3,9};
		System.out.println(buscarBinarioRecursivo(a,8,0,9));

	}
	
	public static int buscarBinarioRecursivo(int[] a, int elem, int inicio, int fin) {
	    // CASO BASE 1: Si los índices se cruzaron, el elemento no existe
	    if (inicio > fin) {
	        return -1;
	    }

	    // Calculamos la casilla del medio
	    int medio = (inicio + fin) / 2;

	    // CASO BASE 2: Si el elemento justo está en el medio, lo encontramos
	    if (a[medio] == elem) {
	        return medio;
	    }

	    // CASO RECURSIVO: Descartamos la mitad que no sirve
	    if (elem < a[medio]) {
	        // Buscamos solo en la mitad IZQUIERDA (reducimos 'fin')
	        return buscarBinarioRecursivo(a, elem, inicio, medio - 1);
	    } else {
	        // Buscamos solo en la mitad DERECHA (aumentamos 'inicio')
	        return buscarBinarioRecursivo(a, elem, medio + 1, fin);
	    }
	}

}
