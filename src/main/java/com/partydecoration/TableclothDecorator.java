package com.partydecoration;

import java.util.*;

public class TableclothDecorator extends PartyDecorationsDecorate {

    public TableclothDecorator() {
    }

    public void addTablecloth(IDecoration decoration) {
        if(decoration instanceof IronTable){
            System.out.println("10\t\t\tQ20\t\tQ200\t\t\tMANTEL PARA MESA METALICA");
        }
        
        if(decoration instanceof WoodTable){
            System.out.println("10\t\t\tQ15\t\tQ150\t\t\tMANTEL PARA MESA DE MADERA");
        }
        
        if(decoration instanceof PlasticTable){
            System.out.println("10\t\t\tQ10\t\tQ100\t\t\tMANTEL PARA MESA PLASTICA");
        }
        return;
    }

}