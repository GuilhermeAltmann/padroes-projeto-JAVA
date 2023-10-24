package org.example.factory.apple.full.Factory;

import org.example.factory.apple.full.model.IPhone;
import org.example.factory.apple.full.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }
}
