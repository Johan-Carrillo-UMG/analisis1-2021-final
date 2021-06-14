package com.partydecoration;

import java.util.*;

public class PartyFacade {

    public PartyFacade() {
        System.out.println("##########################################################################################");
        System.out.println("CANTIDAD\t\tP/U\t\tSUBTOTAL\t\tDESCRIPCIOIN");
    }

    public void orderChair() {
        DecorationsFactoryProducer factoryProducer = new DecorationsFactoryProducer();
        
        factoryProducer.getFactory(FactoryType.PLASTIC);
        
        ChairclothDecorator chairclothDecorator = new ChairclothDecorator();
        
        chairclothDecorator.addChaircloth(new PlasticChair());
    }

    public void orderTable() {
        DecorationsFactoryProducer factoryProducer = new DecorationsFactoryProducer();
        
        factoryProducer.getFactory(FactoryType.IRON);
        
        TableclothDecorator tableclothDecorator = new TableclothDecorator();
        
        tableclothDecorator.addTablecloth(new IronTable());
    }

    public void orderCake() {
        DecorationsFactoryProducer factoryProducer = new DecorationsFactoryProducer();
        
        factoryProducer.getFactory(FactoryType.CHOCOLATE);
        
        KissesDecorator kissesDecorator = new KissesDecorator();
        
        kissesDecorator.addKisses(new Cake());
    }

    public void orderFloor() {
        DecorationsFactoryProducer factoryProducer = new DecorationsFactoryProducer();
        
        factoryProducer.getFactory(FactoryType.SINTETIC);
        
        CarpetDecorator carpetDecorator = new CarpetDecorator();
        
        carpetDecorator.addCarpet(new Floor());
    }

    public void orderStereo() {
        DecorationsFactoryProducer factoryProducer = new DecorationsFactoryProducer();
        
        factoryProducer.getFactory(FactoryType.SORROUND);
        
        LedLightsDecorator ledLightsDecorator = new LedLightsDecorator();
        
        ledLightsDecorator.addLedLigths(new Stereo());
    }

}