package com.kcc.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kcc.app.model.Tag;

public interface TagRepository extends CrudRepository<Tag, Integer> {

	List<Tag> findByEstado(String estado);
}
