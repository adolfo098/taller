package com.taller.app.dto;

import java.io.Serializable;

public class TipoMascotaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idTipoMascota;
	private String tipo;
	private String descripcion;
	private String tamanio;
	public int getIdTipoMascota() {
		return idTipoMascota;
	}
	public void setIdTipoMascota(int idTipoMascota) {
		this.idTipoMascota = idTipoMascota;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	
	
}
