package org.example.factory.apple.HalfSimple.Factory;

import org.example.factory.apple.HalfSimple.model.IPhone;
import org.example.factory.apple.HalfSimple.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
