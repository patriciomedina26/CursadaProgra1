package practicaList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Practica {

	public static void main(String[] args) {
	
		String[] turnos= {"mañana","tarde","noche","virtual"};
		LinkedList<String> nombres=new LinkedList<>();
		ArrayList<String> lista = new ArrayList<>();
		
		nombres.add("ana");
		nombres.add("betty");
		nombres.add("charly");
		lista.add("lilo");
		lista.add("betty");
		
		for (String s : nombres) {
			System.out.print(s + " ");
			if (!lista.contains(s)) {
			lista.add(s);
		}
		}
		System.out.println(nombres.size());
		
		for (String s : lista) {
			System.out.print(s + "//");
		}
		System.out.println(lista.size());
		
		for (int i=0;i<lista.size();i++) {
			System.out.print(lista.get(i) + " ## ");
		}
	}
	
}

