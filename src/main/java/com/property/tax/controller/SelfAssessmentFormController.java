package com.property.tax.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.property.tax.constant.Status;
import com.property.tax.entity.PropertyType;
import com.property.tax.entity.TaxValue;
import com.property.tax.entity.Zone;
import com.property.tax.service.PropertyTypeService;

@Controller
public class SelfAssessmentFormController {

	@Autowired
	SessionFactory sf;

	@Autowired
	private PropertyTypeService propertyTypeService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String accessHomePage(Model model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "index";

	}

	@RequestMapping(value = "/api/v1/redirect/{pageName}", method = RequestMethod.GET)

	public String redirect(@PathVariable String pageName, Model model) {
		if (pageName.equals("selfAssessment")) {
			List<PropertyType> getallPropertyTypes = propertyTypeService.getAllProperty();

			model.addAttribute("properties", getallPropertyTypes);
		}

		return pageName;
	}

	@RequestMapping(value = "/api/v1/properties", method = RequestMethod.GET)
	@ResponseBody
	public List<PropertyType> getPropertiesINJSON() {
		List<PropertyType> getallPropertyTypes = propertyTypeService.getAllProperty();

		return getallPropertyTypes;
	}

//	@RequestMapping(value="/getAllPropertyType",method=RequestMethod.GET)
//	public List<PropertyType> getAllPropertyType(){
//		
//		List<PropertyType> getallPropertyTypes=propertyTypeService.getAllProperty();
//		return getallPropertyTypes;
//	}

//	@RequestMapping(value="/postData",method=RequestMethod.GET)
//	public String data() {
//		
//		TaxValue t1=new TaxValue(null,Status.TENANTED,3.00);
//		TaxValue t2=new TaxValue(null,Status.TENANTED,2.50);
//		TaxValue t3=new TaxValue(null,Status.TENANTED,2.00);
//		
//		TaxValue t4=new TaxValue(null,Status.OWNER,1.25);
//		TaxValue t5=new TaxValue(null,Status.OWNER,1.00);
//		TaxValue t6=new TaxValue(null,Status.OWNER,0.75);
//		List<TaxValue> l1=new ArrayList<TaxValue>();
//		List<TaxValue> l2=new ArrayList<TaxValue>();
//		List<TaxValue> l3=new ArrayList<TaxValue>();
//		l1.add(t1);l1.add(t4);
//		l2.add(t2);l2.add(t5);
//		l3.add(t3);l3.add(t6);
//		List<Zone> zonelist1=new ArrayList<Zone>();
//		
//		
//		Zone z1=new Zone(null,"Zone A",l1);
//		Zone z2=new Zone(null,"Zone B",l2);
//		Zone z3=new Zone(null,"Zone C",l3);
//		zonelist1.add(z1);zonelist1.add(z2);zonelist1.add(z3);
//		
//		PropertyType p=new PropertyType(null,"Tiled/Sheet of all kinds",zonelist1);
//		Session session=sf.getCurrentSession();
//		session.beginTransaction();
//		session.save(t1);session.save(t2);session.save(t3);session.save(t4);session.save(t5);session.save(t6);
//		session.save(z1);session.save(z2);session.save(z3);
//		session.persist(p);
//		session.getTransaction().commit();
//		return "index";
//	}
}
