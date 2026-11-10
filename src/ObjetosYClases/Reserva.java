package ObjetosYClases;

public class Reserva {

	String patente;
	String zona;
	int duracion;
	
	public Reserva(String patente, String zona, int duracion) {
		this.patente=patente;
		this.zona=zona;
		this.duracion=duracion;
	}
	
	public int getDuracion() {
		return this.duracion;
	}
}
