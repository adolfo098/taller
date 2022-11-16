package com.taller.app.dto;

import java.io.Serializable;

public class TipoMascotaUpdate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String tamanio;
	private String tipo;
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
