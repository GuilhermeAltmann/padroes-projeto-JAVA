package org.example.factory.apple.HalfSimple.Factory;

import org.example.factory.apple.HalfSimple.model.IPhone;

public abstract class IPhoneFactory {
    public IPhone orderIPhone() {
        IPhone device = null;

        device = createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected  abstract IPhone createIPhone();
}
