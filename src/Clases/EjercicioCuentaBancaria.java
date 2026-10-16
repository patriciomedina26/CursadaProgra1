package Clases;

public class EjercicioCuentaBancaria {

	public static void main(String[] args) {
		CuentaBancaria usuario1=new CuentaBancaria("Patricio",1000000);
		System.out.println("la cuenta bancaria de " + usuario1.titular + " tiene $" + usuario1.saldo + ".");
	}

	class CuentaBancaria {
		String titular;
		int saldo;
		
		public CuentaBancaria(String a, int b) {
			this.titular=a;
			this.saldo=b;
		}
	}
}
