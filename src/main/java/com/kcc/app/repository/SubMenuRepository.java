package com.kcc.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kcc.app.model.Menu;
import com.kcc.app.model.SubMenu;

public interface SubMenuRepository extends CrudRepository<SubMenu, Integer> {
	
    List<SubMenu> findByMenu(Menu oMenu);
}
