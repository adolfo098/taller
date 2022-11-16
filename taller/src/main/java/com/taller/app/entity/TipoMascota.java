package com.taller.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_mascota", schema = "public")
public class TipoMascota implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idTipoMascota;
	private String tipo;
	private String descripcion;
	private String tamanio;
	
	public TipoMascota() {
		
	}
	
	public TipoMascota(int idTipoMascota, String tipo, String descripcion, String tamanio) {
		this.idTipoMascota = idTipoMascota;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.tamanio = tamanio;
	}

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_tipo_mascota", unique=true, nullable=true)
	public int getIdTipoMascota() {
		return idTipoMascota;
	}
	
	public void setIdTipoMascota(int idTipoMascota) {
		this.idTipoMascota = idTipoMascota;
	}
	
	@Column(name ="tipo", length=50)
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Column(name ="descripcion", length=50)
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Column(name ="tamanio", length=50)
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "TipoMascota [idTipoMascota=" + idTipoMascota + ", tipo=" + tipo + ", descripcion=" + descripcion
				+ ", tamanio=" + tamanio + "]";
	}
	
	
}
