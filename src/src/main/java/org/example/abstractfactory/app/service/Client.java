package org.example.abstractfactory.app.service;

import org.example.abstractfactory.app.service.factory.EJBAbstractFactory;
import org.example.abstractfactory.app.service.factory.ServicesAbstractFactory;
import org.example.abstractfactory.app.service.services.CarService;
import org.example.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory factory = new EJBAbstractFactory();
//		ServicesAbstractFactory factory = new RestAbstractFactory();
		
		UserService userService = factory.getUserService();
		userService.save("Jhon");
		userService.delete(5);
		
		CarService carService = factory.getCarService();
		carService.save("Prius");
		carService.update("Tesla X");
	}
}
