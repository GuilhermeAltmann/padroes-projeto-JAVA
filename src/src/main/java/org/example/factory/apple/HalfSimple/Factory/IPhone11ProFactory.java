package org.example.factory.apple.HalfSimple.Factory;

import org.example.factory.apple.HalfSimple.model.IPhone;
import org.example.factory.apple.HalfSimple.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
