public class Fecha {
	int dia;
	int mes;
	int año;
	
	public Fecha(int a,int b, int c) {
		this.dia=a;
		this.mes=b;
		this.año=c;
	}
	
	public Fecha() {
		this.dia=1;
		this.mes=1;
		this.año=2000;
	}	
	
	public void imprimir() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.año);
	}
	
	public Fecha(int undia, int unmes, int unaño) {
		if (unmes<1 || unmes>12) {
			throw new IllegalArgumentException("Error: La fecha ingresada viola el Invariante de representacion");
		}
		this.dia=undia;
		this.mes=unmes;
		this.año=unaño;
	}
	
	public static int diaDelMes(int mes, int año) {
		if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			return 31;
		}
		if (mes==4 || mes==6 || mes==9 || mes==11) {
			return 30;
		}
		if (mes==2) {
			if (año%4==0) {
				return 29;
			} else { 
				return 28;
			}
		} 
		return 0;
	}
	
	public boolean esValida() {
		if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			if (dia<=0 || dia>=32) {
				return false;
			}
		}
		if (mes==4 || mes==6 || mes==9 || mes==11) {
			if (dia<=0 || dia>=31) {
				return false;
			}
		}
		if (mes==2) {
			if (año%4==0) {
				if (dia<=0 || dia>=30) {
					return false;
				}
			}
		}
		if (mes==2) {
			if (año%4!=0) {
				if (dia<=0 || dia>=29) {
					return false;
				}
			}
		}
		if (mes<=0 || mes>=13) {
			return false;
		}
		if (año<=0) {
			return false;
		}
		return true;
	}
	
	public void avanzarDia() {
		if (!this.esValida()) {
			System.out.println("La fecha ingresada no es valida, pruebe con otra.");
			return;
		}
		int maxDias=diaDelMes(this.mes,this.año);
		if (this.dia<maxDias) {
		this.dia++;
		} else {
			this.dia=1;
			this.mes++;
		}
		if (mes>=13) {
			this.mes=1;
			this.año++;
		}
	}
	
	public boolean antesQue(Fecha otraFecha) {
		if (this.año<otraFecha.año) {
			return true;
		}
		if (this.año==otraFecha.año) {
			if (this.mes<otraFecha.mes) {
				return true;
			}
		}
		if (this.año==otraFecha.año) {
			if (this.mes==otraFecha.mes) {
				if (this.dia<otraFecha.dia) {
					return true;
				}
			}
		}
		return false;
	}
	
	public int diaDelAño() {
		int diasTotales=0;
		for (int i=1;i<this.mes;i++) {
			diasTotales=diasTotales+diaDelMes(i,this.año);
		}
		diasTotales=diasTotales+this.dia;
		return diasTotales;
	}
	
	public int diasDeDiferenciaCon(Fecha otra) {
		Fecha primera;
		Fecha segunda;
		if (this.antesQue(otra)) {
			primera=this;
			segunda=otra;
		} else { 
			primera=otra;
			segunda=this;
		}
		int Diferencia=0;
		while (primera.antesQue(segunda)) {
			primera.avanzarDia();
			Diferencia++;
		}
		return Diferencia;
	}
	
	public void agregarDias(int a) {
		int diasRestantes=a;
		while (diasRestantes>0) {
			this.avanzarDia();
			diasRestantes--;
		}
	}
}

