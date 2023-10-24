package org.example.factory.apple.HalfSimple.Factory;

import org.example.factory.apple.HalfSimple.model.IPhone;
import org.example.factory.apple.HalfSimple.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }
}
