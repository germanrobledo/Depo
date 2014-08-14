package org.robledo.depo.dao;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductDao {
	
	public Collection loadProductsByCategory(String name) throws DataAccessException;

}
