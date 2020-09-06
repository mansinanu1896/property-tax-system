package com.property.tax.dao.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.property.tax.dao.PropertyTypeDao;
import com.property.tax.entity.PropertyType;

@Repository
public class PropertyTypeDaoImpl implements PropertyTypeDao {

	@Autowired
	SessionFactory sf;

	@Override
	public List<PropertyType> getAll() {

		Session session = sf.getCurrentSession();
		List<PropertyType> getPropertyList = session.createQuery("from PropertyType").list();

		return getPropertyList;
	}

}
