package org.example.factory.apple.halfsimple.factory;

import org.example.factory.apple.halfsimple.model.*;

public class IPhone11Factory extends IPhoneFactory{
    @Override
    protected IPhone createIphone(String level) {
        if(level.equals("standard")){
            return new IPhone11();
        }else if(level.equals("highEnd")){
            return new IPhone11Pro();
        }
        return null;
    }
}
