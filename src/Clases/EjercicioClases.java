package Clases;

public class EjercicioClases {

	public static void main(String[] args) {
		Persona p1=new Persona("Patricio", 26);
		System.out.println(p1.nombre + " tiene " + p1.edad + " años");
		p1.cumplirAños();
		System.out.println(p1.nombre + " el año que viene va a cumplir " + p1.edad);
		p1.cumplirAños();
		System.out.println(p1.nombre + " nació el año " + p1.añoNacimiento());
	}
}
	
	class Persona {
		String nombre;
		int edad;
		
		public Persona(String nombreInicial, int edadInicial) {
			this.nombre=nombreInicial;
			this.edad=edadInicial;
		}
		public void cumplirAños() {
		this.edad=edad+1;
		}
		public int añoNacimiento() {
			return 2026-this.edad;
		}
		
	}

