package com.accenture.v1;

public class Principal {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("Patrobas");
		
		Inyector.inyectaTransporte(e1);
		
		e1.conducir();
	}

}
