package com.datos;

public class ReglaDeTres {
	private double cantidadInsertada_1; //es lo que puso el usuario en el primer lugar
	private double cantidadInsertada_2; //es lo que puso el usuario en el segundo lugar
	private double cantidadInsertada_3; //es lo que puso el usuario en el tercer lugar
	private double resultado;	//lo que va a recibir el usuario
	
	//constructor
	public ReglaDeTres(){
		
	}

	//getters y setters
	public void setCantidadInsertada_1(double cantidadInsertada_1) {
		this.cantidadInsertada_1 = cantidadInsertada_1;
	}

	public void setCantidadInsertada_2(double cantidadInsertada_2) {
		this.cantidadInsertada_2 = cantidadInsertada_2;
	}

	public void setCantidadInsertada_3(double cantidadInsertada_3) {
		this.cantidadInsertada_3 = cantidadInsertada_3;
	}
	
	
	//métodos
	public double calculoReglaDeTres() {
		resultado = (cantidadInsertada_2 * cantidadInsertada_3)/cantidadInsertada_1;
		resultado = Math.round(resultado);
		return resultado;
	}
}
