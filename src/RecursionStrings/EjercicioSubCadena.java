package RecursionStrings;

public class EjercicioSubCadena {

	public static void main(String[] args) {
		System.out.println(subCadena("licenciado",3,7));
	}

	public static String subCadena(String a,int desde, int hasta) {
		if (a==""||desde>hasta) {
			return "";
		}
		if (desde>0) {
			return subCadena(resto(a),desde-1,hasta-1);
		}
		String vocales="aeiouAEIOU";
		if (vocales.indexOf(a.charAt(0))==-1) {
			return a.charAt(0)+subCadena(resto(a),desde,hasta-1);
		}
		return subCadena(resto(a),desde,hasta-1);
	}
	
	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}
}
