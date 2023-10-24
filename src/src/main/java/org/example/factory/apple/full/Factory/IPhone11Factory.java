package org.example.factory.apple.full.Factory;

import org.example.factory.apple.full.model.IPhone;
import org.example.factory.apple.full.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }
}
