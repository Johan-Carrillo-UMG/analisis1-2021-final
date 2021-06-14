package com.partydecoration;

import java.util.*;

public class CarpetDecorator extends PartyDecorationsDecorate {

    public CarpetDecorator() {
    }

    public void addCarpet(IDecoration decoration) {
        if(decoration instanceof Floor){
            System.out.println("1\t\t\tQ60\t\tQ60\t\t\tALFOMBRA SINTETICA");
        }
        return;
    }

}