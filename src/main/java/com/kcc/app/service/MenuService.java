package com.kcc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcc.app.model.Menu;
import com.kcc.app.repository.MenuRepository;

@Service
@Transactional
public class MenuService {
	@Autowired
    private MenuRepository repo;
	
	public List<Menu> listar() {
        return repo.findAll(new Sort(Direction.ASC, "orden"));
    }
	public Menu guardar(Menu menu)
	{
		return repo.save(menu);
	}
}
