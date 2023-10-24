package org.example.factory.apple.full.Factory;

import org.example.factory.apple.full.model.IPhone;
import org.example.factory.apple.full.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
