package com.taller.app.service;

import java.util.List;

import com.taller.app.dto.TipoMascotaDTO;
import com.taller.app.dto.TipoMascotaUpdate;
import com.taller.app.entity.TipoMascota;

public interface TipoMascotaService {

	List<TipoMascotaDTO> findAll();
	TipoMascotaDTO findByTipo(String tipo);
	TipoMascotaDTO findByDescripcion(String descripcion);
	TipoMascota create(TipoMascota tipoMascota);
	TipoMascota update(String descripcion, TipoMascota tipo);
	TipoMascotaUpdate updateTamDes(String descripcion,TipoMascotaUpdate tipo);
	void updateTam(String descripcion,String tam);
	TipoMascota buscarPorId(Integer idTipo);
	void delete(Integer idTipo);
}
