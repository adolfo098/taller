package com.taller.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller.app.dto.TipoMascotaDTO;
import com.taller.app.dto.TipoMascotaUpdate;
import com.taller.app.entity.TipoMascota;
import com.taller.app.service.TipoMascotaService;

@RestController
@RequestMapping("/api")
public class TipoMascotaController {

	@Autowired
	private TipoMascotaService tipoMascotaService;
	
	@GetMapping("/tipoMascota")
	public List<TipoMascotaDTO> obtenerTodo(){
		return tipoMascotaService.findAll();
	}
	
	@GetMapping("/tipoMascota/{tipo}")
	public TipoMascotaDTO obtenerPorTipo(@PathVariable String tipo){
		return tipoMascotaService.findByTipo(tipo);
	}
	
	@GetMapping("/tipoMascota/des/{descripcion}")
	public TipoMascotaDTO obtenerPorDescripcion(@PathVariable String descripcion) {
		return tipoMascotaService.findByDescripcion(descripcion);
	}
	
	@PostMapping("tipoMascota/")
	public TipoMascota guardar(@RequestBody TipoMascota tipoMascota) {
		return tipoMascotaService.create(tipoMascota);
	}
	
	@PutMapping("tipoMascota/{descripcion}")
	public TipoMascota updateAll(@PathVariable String descripcion, @RequestBody TipoMascota tipoMascota) {
		return tipoMascotaService.update(descripcion, tipoMascota);
	}
	
	@PutMapping("tipoMascota/updt/{descripcion}")
	public TipoMascotaUpdate updateTamDes(@PathVariable String descripcion, @RequestBody TipoMascotaUpdate tipoMascota) {
		return tipoMascotaService.updateTamDes(descripcion, tipoMascota);
	}
	
	@PutMapping("tipoMascota/updt/{descripcion}/{tamanio}")
	public void updateTam(@PathVariable String descripcion, @PathVariable String tamanio) {
		tipoMascotaService.updateTam(descripcion, tamanio);
	}
	
	@DeleteMapping("tipoMascota/{idTipo}")
	public void deletePorId1(@PathVariable Integer idTipo) {
		tipoMascotaService.delete(idTipo);
	}
	
	
	@GetMapping("/tipoMascota/id/{id}")
	public TipoMascota obtenerPorId(@PathVariable Integer id){
		return tipoMascotaService.buscarPorId(id);
	}
}
