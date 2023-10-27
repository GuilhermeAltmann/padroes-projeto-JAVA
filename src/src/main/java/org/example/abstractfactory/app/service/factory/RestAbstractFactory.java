package org.example.abstractfactory.app.service.factory;

import org.example.abstractfactory.app.service.services.CarRestApiService;
import org.example.abstractfactory.app.service.services.CarService;
import org.example.abstractfactory.app.service.services.UserRestApiService;
import org.example.abstractfactory.app.service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

}
