package org.example.abstractfactory.app.service.factory;

import org.example.abstractfactory.app.service.services.CarService;
import org.example.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
