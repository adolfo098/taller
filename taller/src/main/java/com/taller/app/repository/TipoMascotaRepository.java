package com.taller.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.taller.app.entity.TipoMascota;

@Repository
public interface TipoMascotaRepository  extends JpaRepository<TipoMascota, Integer>, JpaSpecificationExecutor<TipoMascota>{

	List<TipoMascota> findAll();
	
	@Query("select t from TipoMascota t where t.tipo = :tipo")
	TipoMascota findByTipo(@Param ("tipo")String tipo);
	
	TipoMascota findByDescripcion(@Param("descripcion") String descripcion);
	
	TipoMascota findByIdTipoMascota(@Param("idTipoMascota") Integer idTipo);
	
}
