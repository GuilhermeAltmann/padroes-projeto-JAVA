package org.example.abstractfactory.app.service.factory;

import org.example.abstractfactory.app.service.services.CarEJBService;
import org.example.abstractfactory.app.service.services.CarService;
import org.example.abstractfactory.app.service.services.UserEJBService;
import org.example.abstractfactory.app.service.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}

}



