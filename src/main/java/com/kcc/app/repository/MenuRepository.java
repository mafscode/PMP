package com.kcc.app.repository;

import java.util.*;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.kcc.app.model.Menu;


public interface MenuRepository extends PagingAndSortingRepository <Menu, Integer> {
    List<Menu> findAll(Sort sort);
}
