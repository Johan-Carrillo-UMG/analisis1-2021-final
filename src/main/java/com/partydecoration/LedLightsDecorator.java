package com.partydecoration;

import java.util.*;

public class LedLightsDecorator extends PartyDecorationsDecorate {

    public LedLightsDecorator() {
    }

    public void addLedLigths(IDecoration decoration) {
        if(decoration instanceof Stereo){
            System.out.println("1\t\t\tQ50\t\tQ50\t\t\tLUCES LED MULTICOLOR");
        }
        return;
    }

}