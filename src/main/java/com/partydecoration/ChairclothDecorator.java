package com.partydecoration;

import java.util.*;

public class ChairclothDecorator extends PartyDecorationsDecorate {

    public ChairclothDecorator() {
    }

    public void addChaircloth(IDecoration decoration) {
        if(decoration instanceof IronChair){
            System.out.println("Decorando SILLA METALICA con MANTEL----Q5");
        }
        
        if(decoration instanceof WoodChair){
            System.out.println("Decorando SILLA DE MADERA con MANTEL----Q3");
        }
        
        if(decoration instanceof PlasticChair){
            System.out.println("Decorando SILLA DE PLASTICO con MANTEL----Q3");
        }
        return;
    }

}