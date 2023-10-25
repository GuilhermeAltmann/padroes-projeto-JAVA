package org.example.factory.apple.halfsimple.factory;

import org.example.factory.apple.halfsimple.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone(String level){
        IPhone device = null;

        device = createIphone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract  IPhone createIphone(String level);
}