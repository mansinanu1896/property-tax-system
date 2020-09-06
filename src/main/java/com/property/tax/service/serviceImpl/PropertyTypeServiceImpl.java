package com.property.tax.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.tax.dao.PropertyTypeDao;
import com.property.tax.entity.PropertyType;
import com.property.tax.service.PropertyTypeService;

@Service
public class PropertyTypeServiceImpl implements PropertyTypeService{
	
	@Autowired
	private PropertyTypeDao propertyTypeDao;

	@Override
	public List<PropertyType> getAllProperty() {
		List<PropertyType> getList=propertyTypeDao.getAll();
		return getList;
	}

}
