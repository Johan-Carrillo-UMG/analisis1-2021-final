package com.partydecoration;

import java.util.*;

public class DecorationsFactoryProducer {

    public DecorationsFactoryProducer() {
    }


    public IDecorationFactory getFactory(FactoryType factoryType) {
        switch (factoryType)
        {
            case IRON:
                IronDecorationFactory ironDecorationFactory = new IronDecorationFactory();
                
                ironDecorationFactory.getDecoration(DecorationType.TABLE);
                break;

            case PLASTIC:
                PlasticDecorationFactory plasticDecorationFactory = new PlasticDecorationFactory();
                
                plasticDecorationFactory.getDecoration(DecorationType.CHAIR);
                break;

            case  WOOD:
                return new WoodDecorationFactory();
                
            case CHOCOLATE:
                WoodDecorationFactory chocolateDecorationFactory = new WoodDecorationFactory();
                
                chocolateDecorationFactory.getDecoration(DecorationType.CAKE);
                break;
                
            case SINTETIC:
                WoodDecorationFactory sinteticDecorationFactory = new WoodDecorationFactory();
                
                sinteticDecorationFactory.getDecoration(DecorationType.FLOOR);
                break;
                
            case SORROUND:
                WoodDecorationFactory sorroundDecorationFactory = new WoodDecorationFactory();
                
                sorroundDecorationFactory.getDecoration(DecorationType.STEREO);
                break;

        }
        
        return null;
    }

}