package com.datos;

public class Metodos implements Datos {
	private double cantidadInsertada; //es lo que puso el usuario para convertir
	private int seleccionUsuario; //lo que seleccionó en el index de divisas
	private double resultado; //lo que va a recibir el usuario
	
	//constructor
	public Metodos(){
		
	}
	
	//getters y setters
	public void setCantidadInsertada(double cantidadInsertada) {
		this.cantidadInsertada = cantidadInsertada;
	}
	
	public void setSeleccionUsuario(int seleccionUsuario) {
		this.seleccionUsuario = seleccionUsuario;
	}
	
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	//métodos
		//método monedas
	public double convertirMonedas() {
		if (seleccionUsuario == 1) {
			resultado = cantidadInsertada / USD;
		} else if (seleccionUsuario == 2) {
			resultado = cantidadInsertada / EUR;
		} else if (seleccionUsuario == 3) {
			resultado = cantidadInsertada / GBP;
		} else if (seleccionUsuario == 4) {
			resultado = cantidadInsertada / JPY;
		} else if (seleccionUsuario == 5) {
			resultado = cantidadInsertada / KRW;
		}
		resultado = Math.round(resultado);
		return resultado;
		
	}
	
		//método temperatura
	public double convertirTemperatura() {
		if (seleccionUsuario == 1) {
			resultado = (cantidadInsertada * 9/5) + 32;
		} else if (seleccionUsuario == 2) {
			resultado = cantidadInsertada + 273.15;
		} else if (seleccionUsuario == 3) {
			resultado = (cantidadInsertada - 32) * 5/9;
		} else if (seleccionUsuario == 4) {
			resultado = ((cantidadInsertada - 32) * 5/9)+ 273.15;
		} else if (seleccionUsuario == 5) {
			resultado = cantidadInsertada - 273.15;
		} else if (seleccionUsuario == 6) {
			resultado = ((cantidadInsertada - 273.15) * 9/5) + 32;
		}
		resultado = Math.round(resultado);
		return resultado;
		
	}
}
