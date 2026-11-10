package ObjetosYClases;

public class Persona {
	String nombre;
	int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public boolean esMenorQue(Persona otra) {
		return this.edad<otra.edad;
	}
	
	public boolean mismaPersona(Persona otra) {
		return this.nombre.equals(otra.nombre) && this.edad == otra.edad;
	}
	
	public static Persona masJoven(Persona[] grupo) {
		Persona menor=grupo[0];
		for (int i=1;i<grupo.length;i++) {
			if (grupo[i].esMenorQue(menor)) {
				menor=grupo[i];
			}
		}
		return menor;
	}
	
	public static Persona buscar(Persona[] grupo, String nombre) {
		for (int i=0;i<grupo.length;i++) {
			if (grupo[i].nombre.equals(nombre)) {
				return grupo[i];
			}
		}
		return null;
	}
}
