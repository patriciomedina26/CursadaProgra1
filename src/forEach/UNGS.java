package forEach;

public class UNGS {
	Comision[] comisiones;
	
	boolean cursaCon(Estudiante e, Docente d) {
		for (int i=0;i<comisiones.length;i++) {
			if (comisiones[i].estaEstudiante(e)&& comisiones[i].estaDocente(d)) {
				return true;
			}
		}
		return false;
	}
	
	boolean suficientesDocentes() {
		for (int i=0;i<comisiones.length;i++) {
			if (comisiones[i].docentes.length*20<comisiones[i].contarEstudiantes()) {
				return false;
			}
		}
		return true;
	}
	
	public Comision laMejorComision() {
		if (comisiones==null || comisiones.length==0) {
			return null;
		}
		Comision mejorComision=comisiones[0];
		double mejorPromedio=comisiones[0].promedioComision();
		
		for (int i=0;i<comisiones.length;i++) {
			double promedioActual=comisiones[i].promedioComision();
			if (promedioActual>mejorPromedio) {
				mejorPromedio=promedioActual;
				mejorComision=comisiones[i];
			}
		}
		return mejorComision;
	}
	
	public int alumnosDe(Docente d) {
		int total=0;
		for (int i=0;i<comisiones.length;i++) {
			if (comisiones[i].estaDocente(d)) {
				total=total+comisiones[i].contarEstudiantes();
			}
		}
		return total;
	}
	
	public Estudiante elMasEstudioso() {
	    if (comisiones == null || comisiones.length == 0) {
	        return null;
	    }
	    

	    Estudiante mayorEstudiante = null;
	    int MayorAprobadas = -1;
	    
	    for (int i = 0; i < comisiones.length; i++) {
	        if (comisiones[i] != null) {
	            
	            for (int j = 0; j < comisiones[i].inscriptos.length; j++) {

	                Estudiante estudianteActual = comisiones[i].inscriptos[j];
	                
	                if (estudianteActual != null) {
	                    int cantidadAprobadas = 0;
	                    

	                    for (int c = 0; c < comisiones.length; c++) {
	                        if (comisiones[c] != null && comisiones[c].aprobo(estudianteActual)) {
	                            cantidadAprobadas++;
	                        }
	                    }
	                    
	                    if (cantidadAprobadas > MayorAprobadas) {
	                        MayorAprobadas = cantidadAprobadas;
	                        mayorEstudiante = estudianteActual;
	                    }
	                }
	            }
	        }
	    }
	    
	    return mayorEstudiante; 
	}
	
	public Estudiante elConMasComisiones() {
		if (comisiones==null || comisiones.length==0) {
			return null;
		}
		Estudiante elMasComisiones=null;
		int mayorCantidadComisiones=-1;
		
		for (int i=0;i<comisiones.length;i++) {
			if (comisiones[i]!=null) {
				for (int j=0;j<comisiones[i].inscriptos.length;j++) {
					Estudiante estudianteActual=comisiones[i].inscriptos[j];
					if (estudianteActual!=null) {
						int cantidadComisiones=0;
							for (int c=0;c<comisiones.length;c++) {
								if (comisiones[c].estaEstudiante(estudianteActual)) {
									cantidadComisiones++;
								}
							}
						if (cantidadComisiones>mayorCantidadComisiones) {
							mayorCantidadComisiones=cantidadComisiones;
							elMasComisiones=estudianteActual;
						}
					}
				}
			}
		}
		return elMasComisiones;
	}
}
