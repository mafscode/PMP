package com.kcc.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kcc.app.model.Filial;

public interface FilialRepository extends CrudRepository<Filial, Integer>{
	List<Filial> findAll();
	List<Filial> findByEstado(String estado);
}