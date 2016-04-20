package com.kcc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcc.app.model.SubMenu;
import com.kcc.app.repository.SubMenuRepository;

@Service
@Transactional
public class SubMenuService {
	@Autowired
	private SubMenuRepository repo;
	
	public SubMenu guardar(SubMenu submenu)
	{
		return repo.save(submenu);
	}
}
