package com.herokuapp.odata.grocery;

import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAServiceFactory;
import org.apache.olingo.odata2.jpa.processor.api.exception.ODataJPARuntimeException;

public class MyODataJPAServiceFactory extends ODataJPAServiceFactory {

	@Override
	public ODataJPAContext initializeODataJPAContext() throws ODataJPARuntimeException {
		ODataJPAContext context = getODataJPAContext();
		context.setEntityManagerFactory(HerokuEntityManagerFactory.getInstance());
		context.setPersistenceUnitName("groceryPersistenceUnit");
		return context;
	}

}