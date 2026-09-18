package RecursionStrings;

public class EjercicioImprimirEspaciado {

	public static void main(String[] args) {
		System.out.println(resto("heladera"));
		imprimirEspaciado("heladera");
	}
	
	public static void imprimirEspaciado(String a) {
		if (a.length()==0) {
			return;
		}
		System.out.print(a.charAt(0)+" ");
		imprimirEspaciado(resto(a));
		return;
	}

	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}
}
