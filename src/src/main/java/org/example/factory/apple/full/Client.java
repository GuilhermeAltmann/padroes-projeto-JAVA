package org.example.factory.apple.full;

import org.example.factory.apple.full.Factory.IPhone11ProFactory;
import org.example.factory.apple.full.Factory.IPhoneFactory;
import org.example.factory.apple.full.Factory.IPhoneXFactory;
import org.example.factory.apple.full.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
		IPhoneFactory iPhone11ProFactory = new IPhone11ProFactory();

		System.out.println("### Ordering an iPhone X");

		IPhone iPhone = iPhoneXFactory.orderIPhone();
		System.out.println(iPhone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");

		IPhone iPhone2 = iPhone11ProFactory.orderIPhone();
		System.out.println(iPhone2);
	}
}
