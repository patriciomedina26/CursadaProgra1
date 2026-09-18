package RecursionStrings;

public class EjercicioSinRepetidosContiguos {

	public static void main(String[] args) {
		System.out.println(sinRepetidosContiguos("pollo"));

	}

	public static String sinRepetidosContiguos(String a) {
	    // Caso base: si tiene 0 o 1 letra, no hay duplicados contiguos posibles
	    if (a.length() <= 1) {
	        return a;
	    }
	    
	    // Si la primera letra es IGUAL a la segunda
	    if (a.charAt(0) == a.charAt(1)) {
	        // Ignoramos la primera letra (a.charAt(0)) y seguimos procesando el resto
	        return sinRepetidosContiguos(resto(a));
	    } else {
	        // Si son DISTINTAS, conservamos la primera letra y la pegamos al resultado del resto
	        return a.charAt(0) + sinRepetidosContiguos(resto(a));
	    }
	}
	
	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}
}
