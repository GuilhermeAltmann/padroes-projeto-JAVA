package org.example.factory.apple.HalfSimple.Factory;

import org.example.factory.apple.HalfSimple.model.IPhone;
import org.example.factory.apple.HalfSimple.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }
}
