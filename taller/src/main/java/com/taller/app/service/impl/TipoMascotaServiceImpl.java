package com.taller.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taller.app.dto.TipoMascotaDTO;
import com.taller.app.dto.TipoMascotaUpdate;
import com.taller.app.entity.TipoMascota;
import com.taller.app.repository.TipoMascotaRepository;
import com.taller.app.service.TipoMascotaService;

@Service
public class TipoMascotaServiceImpl implements TipoMascotaService {

	@Autowired
	private TipoMascotaRepository tipoMascotaRepository;
	
	@Override
	public List<TipoMascotaDTO> findAll() {

		List<TipoMascotaDTO> listResp = new ArrayList<TipoMascotaDTO>();
		List<TipoMascota> listTipoMascota = (List<TipoMascota>) tipoMascotaRepository.findAll();
		for (TipoMascota item : listTipoMascota) {
			TipoMascotaDTO tipoMascotaDTO = new TipoMascotaDTO();
			tipoMascotaDTO.setIdTipoMascota(item.getIdTipoMascota());
			tipoMascotaDTO.setTipo(item.getTipo());
			tipoMascotaDTO.setDescripcion(item.getDescripcion());
			tipoMascotaDTO.setTamanio(item.getTamanio());
			listResp.add(tipoMascotaDTO);
		}
		return listResp;
	}

	@Override
	public TipoMascotaDTO findByTipo(String tipo) {
		TipoMascota tipoMascota = (TipoMascota) tipoMascotaRepository.findByTipo(tipo);
		TipoMascotaDTO resp= new TipoMascotaDTO();
		resp.setIdTipoMascota(tipoMascota.getIdTipoMascota());
		resp.setTipo(tipoMascota.getTipo());
		resp.setDescripcion(tipoMascota.getDescripcion());
		resp.setTamanio(tipoMascota.getTamanio());
		return resp;
	}

	@Override
	public TipoMascotaDTO findByDescripcion(String descripcion) {
		TipoMascota  tipoMascota = (TipoMascota) tipoMascotaRepository.findByDescripcion(descripcion);
		TipoMascotaDTO resp= new TipoMascotaDTO();
		resp.setIdTipoMascota(tipoMascota.getIdTipoMascota());
		resp.setTipo(tipoMascota.getTipo());
		resp.setDescripcion(tipoMascota.getDescripcion());
		resp.setTamanio(tipoMascota.getTamanio());
		return resp;
	}

	@Override
	public TipoMascota create(TipoMascota tipoMascota) {
		return tipoMascotaRepository.save(tipoMascota);
	}

	@Override
	public TipoMascota update(String descripcion, TipoMascota tipo) {
		TipoMascota  tipoMascota = (TipoMascota) tipoMascotaRepository.findByDescripcion(descripcion);
			tipoMascota.setIdTipoMascota(tipo.getIdTipoMascota());
			tipoMascota.setDescripcion(tipo.getDescripcion());
			tipoMascota.setTamanio(tipo.getTamanio());
			tipoMascota.setTipo(tipo.getTipo());
		
		return tipoMascotaRepository.save(tipoMascota);
	}

	@Override
	public TipoMascotaUpdate updateTamDes(String descripcion, TipoMascotaUpdate tipo) {
		TipoMascota  tipoMascota = (TipoMascota) tipoMascotaRepository.findByDescripcion(descripcion);
		tipoMascota.setTamanio(tipo.getTamanio());
		tipoMascota.setTipo(tipo.getTipo());
		tipoMascotaRepository.save(tipoMascota);
		return tipo;
	}

	@Override
	public void updateTam(String descripcion, String tam) {
		TipoMascota  tipoMascota = (TipoMascota) tipoMascotaRepository.findByDescripcion(descripcion);
		tipoMascota.setTamanio(tam);
		tipoMascotaRepository.save(tipoMascota);
	}
	
	@Override
	public void delete(Integer idTipo) {
		TipoMascota tipoMascota = (TipoMascota) tipoMascotaRepository.findByIdTipoMascota(idTipo);
		tipoMascotaRepository.delete(tipoMascota);
	}

	@Override
	public TipoMascota buscarPorId(Integer idTipo) {
		TipoMascota tipoMascota = (TipoMascota) tipoMascotaRepository.findByIdTipoMascota(idTipo);
		return tipoMascota;
	}

	

}
