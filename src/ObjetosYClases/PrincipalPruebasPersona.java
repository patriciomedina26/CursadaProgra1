package ObjetosYClases;

public class PrincipalPruebasPersona {

	public static void main(String[] args) {
		Persona pato=new Persona("pato",26);
		Persona meli=new Persona("meli",25);
		Persona mathi=new Persona("mathi",27);
		Persona termo=new Persona("termo",15);
		
		Persona[] grupo={mathi,meli,pato,termo};
		System.out.println(pato.esMenorQue(meli));
		Persona joven=Persona.masJoven(grupo);
		System.out.println("La persona mas jovens es " + joven.nombre);
		
		Persona esta=Persona.buscar(grupo,"mathi");
		if (esta != null) {
		    System.out.println("Encontrado: " + esta.nombre);
		} else {
		    System.out.println("La persona buscada no existe en el grupo.");
		}
	}

}
