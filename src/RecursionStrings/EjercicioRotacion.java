package RecursionStrings;

public class EjercicioRotacion {

	public static void main(String[] args) {
		System.out.println(rotacion("abcdefghi", 1));

	}

	public static String rotacion(String s, int n) {
	    // Caso base: si n llega a 0 o el string está vacío, devolvemos el string
	    if (n == 0 || s.isEmpty()) {
	        return s;
	    }
	    
	    // Rotamos una vez: el resto de la palabra + la primera letra al final
	    String rotadaUnaVez = rotacion(resto(s),n) + s.charAt(0);
	    
	    // Llamada recursiva restando 1 a n
	    return rotacion(rotadaUnaVez, n - 1);
	}

	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}
}
