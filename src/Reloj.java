
public class Reloj {
	private int segundo;
	private int minuto;
	private int hora;
	private boolean PMAM;
	
		public Reloj(int hora, int minuto, int segundo, boolean PMAM) {
			if (minuto<0 || minuto>59) {
				throw new IllegalArgumentException("Los minutos deben estar entre 0 y 59");
			}
			if (segundo<0 || segundo>59) {
				throw new IllegalArgumentException("Los Segundos deben estar entre 0 y 59");
			}
			if (PMAM=true) {
				if (hora<0 || hora>23) {
					throw new IllegalArgumentException("Las horas en formato de 24 horas tienen que estar entre 0 y 23");
				}
			}
			if (PMAM=false) {
				if (hora<1 || hora>12) {
					throw new IllegalArgumentException("Las horas en formato AM/PM deben estar entre 1 y 12");
				}
			}
			this.hora=hora;
			this.minuto=minuto;
			this.segundo=segundo;
			this.PMAM=PMAM;
		}
	
	
}
