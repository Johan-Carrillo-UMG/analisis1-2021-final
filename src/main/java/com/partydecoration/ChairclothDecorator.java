package com.partydecoration;

import java.util.*;

public class ChairclothDecorator extends PartyDecorationsDecorate {

    public ChairclothDecorator() {
    }

    public void addChaircloth(IDecoration decoration) {
        if(decoration instanceof IronChair){
            System.out.println("50\t\t\tQ5\t\tQ250\t\t\tMANTEL PARA SILLA METALICA");
        }
        
        if(decoration instanceof WoodChair){
            System.out.println("50\t\t\tQ3\t\tQ150\t\t\tMANTEL PARA SILLA DE MADERA");
        }
        
        if(decoration instanceof PlasticChair){
            System.out.println("50\t\t\tQ3\t\tQ150\t\t\tMANTEL PARA SILLA PLASTICA");
        }
        return;
    }

}