package ObjetosYClases;

public class Agenda {
	Persona[] contactos;
	String[] telefonos;

	public Agenda(int tamaño) {
		this.contactos= new Persona[tamaño];
		this.telefonos= new String[tamaño];
	}
	
	public void guardar(Persona contacto, String telefono) {
		for (int i=0;i<contactos.length;i++) {
			if (contactos[i]==null) {
				contactos[i]=contacto;
				telefonos[i]=telefono;
			}
		}
	}
	
	public void eliminar(Persona contactoBuscado) {
		for (int i=0;i<contactos.length;i++) {
			if (contactos[i]!=null) {
				if (contactos[i].mismaPersona(contactoBuscado)) {
					contactos[i]=null;
					telefonos[i]=null;
					return;
				}
			}
		}
	}
	
	public boolean pertenece(Persona contactoBuscadoo) {
		for (int i=0;i<contactos.length;i++) {
			if (contactos[i]!=null) {
				if (contactos[i].mismaPersona(contactoBuscadoo)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public String dameTelefono(Persona contactoBuscado) {
		for (int i=0;i<contactos.length;i++) {
			if (contactos[i]!=null) {
				if (contactos[i].mismaPersona(contactoBuscado)) {
					return telefonos[i];
				}
			}
		}
		return null;
	}
	
	public Agenda backUp() {
		Agenda copia=new Agenda(this.contactos.length);
		for (int i=0;i<this.contactos.length;i++) {
			if (contactos[i]!=null) {
				Persona personaCopia=new Persona(this.contactos[i].nombre,this.contactos[i].edad);
				copia.contactos[i]=personaCopia;
				copia.telefonos[i]=this.telefonos[i];
			}
		}
		return copia;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
