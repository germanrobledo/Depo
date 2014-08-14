package org.robledo.depo.dao;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class ProductDaoImpl implements ProductDao {

	
	private SessionFactory sessionFactory;

	/*public Session getSession() {
		Session sesion = sessionFactory.getCurrentSession();
		if(sesion == null){
			sesion = sessionFactory.openSession();
		}
	    return sesion;
	}*/
	
	@Override
	@Transactional
	 public Collection loadProductsByCategory(String name) throws DataAccessException {
			
	        return sessionFactory.getCurrentSession().createQuery("from Product as product where product.name = '" + name +"'").list();
	        		
	    }

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
}
