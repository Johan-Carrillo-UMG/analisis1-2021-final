package com.partydecoration;

import java.util.*;

public class LedLightsDecorator extends PartyDecorationsDecorate {

    public LedLightsDecorator() {
    }

    public void addLedLigths(IDecoration decoration) {
        if(decoration instanceof Stereo){
            System.out.println("Decorando SONIDO con LUCES LED MULTICOLOR----Q50");
        }
        return;
    }

}