package com.partydecoration;

import java.util.*;

public class KissesDecorator extends PartyDecorationsDecorate {

    public KissesDecorator() {
    }

    public void addKisses(IDecoration decoration) {
        if(decoration instanceof Cake){
            System.out.println("Decorando PASTEL con MINI HERSHEY'S KISSES----Q25");
        }
        return;
    }

}