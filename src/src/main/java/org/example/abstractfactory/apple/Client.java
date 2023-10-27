package org.example.abstractfactory.apple;

import org.example.abstractfactory.apple.factory.IPhone11Factory;
import org.example.abstractfactory.apple.factory.IPhoneFactory;
import org.example.abstractfactory.apple.factory.IPhoneXFactory;
import org.example.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import org.example.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import org.example.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new USRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);

		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);

		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
