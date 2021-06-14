package com.partydecoration;

import java.util.*;

public class TableclothDecorator extends PartyDecorationsDecorate {

    public TableclothDecorator() {
    }

    public void addTablecloth(IDecoration decoration) {
        if(decoration instanceof IronTable){
            System.out.println("Decorando MESA METALICA con MANTEL----Q20");
        }
        
        if(decoration instanceof WoodTable){
            System.out.println("Decorando MESA DE MADERA con MANTEL----Q15");
        }
        
        if(decoration instanceof PlasticTable){
            System.out.println("Decorando MESA DE PLASTICO con MANTEL----Q10");
        }
        return;
    }

}