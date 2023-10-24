package org.example.factory.apple.full.Factory;

import org.example.factory.apple.full.model.IPhone;
import org.example.factory.apple.full.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory{
    @Override
    protected IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
