package com.kcc.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kcc.app.model.Proceso;
import com.kcc.app.model.SubProceso;

public interface SubProcesoRepository extends CrudRepository <SubProceso, Integer> {
	List<SubProceso> findAllByProcesoAndEstado(Proceso proceso,String Estado);
	List<SubProceso> findAllByEstado(String Estado);
}
