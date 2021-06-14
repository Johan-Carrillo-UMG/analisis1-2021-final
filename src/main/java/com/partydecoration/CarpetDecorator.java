package com.partydecoration;

import java.util.*;

public class CarpetDecorator extends PartyDecorationsDecorate {

    public CarpetDecorator() {
    }

    public void addCarpet(IDecoration decoration) {
        if(decoration instanceof Floor){
            System.out.println("Decorando PISO con ALFOMBRA SINTETICA----Q60");
        }
        return;
    }

}