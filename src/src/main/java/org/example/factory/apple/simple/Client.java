package org.example.factory.apple.simple;

import org.example.factory.apple.simple.factory.IPhoneSimpleFactory;
import org.example.factory.apple.simple.model.IPhone;

public class Client {

    public static void main(String[] args) {
        System.out.println("### Ordering an iPhone X");
        IPhone iPhone = IPhoneSimpleFactory.orderIphone("x", "standard");
        System.out.println(iPhone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iPhone1 = IPhoneSimpleFactory.orderIphone("11", "highEnd");
        System.out.println(iPhone1);
    }
}
