package forEach;

public class Comision {
	String materia;
	int numero;
	Docente[] docentes;
	Estudiante[] inscriptos;
	int[] calificaciones;
	
	public boolean estaDocente(Docente d) {
		for (Docente doc : docentes) {
			if (doc.equals(d)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean estaEstudiante(Estudiante e) {
		for (Estudiante insc: inscriptos) {
			if (insc.equals(e)) {
				return true;
			}
		}
		return false;
	}
	
	public int contarEstudiantes() {
		int cantidad=0;
		for (int i=0;i<inscriptos.length;i++) {
			if (inscriptos[i]!=null) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	public double promedioComision() {
		double suma=0.0;
		int contador=0;
			for (int i=0;i<calificaciones.length;i++) {
				if (inscriptos[i]!=null) {
				suma=suma+calificaciones[i];
				contador++;
			}
		}
		return suma/contador;
	}
	
	public boolean aprobo(Estudiante e) {
		for (int i=0;i<inscriptos.length;i++) {
			if (inscriptos[i]!=null && inscriptos.equals(e) && calificaciones[i]>=4) {
				return true;
		}
	}
		return false;
	}
	
	
}
