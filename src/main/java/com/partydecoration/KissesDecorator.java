package com.partydecoration;

import java.util.*;

public class KissesDecorator extends PartyDecorationsDecorate {

    public KissesDecorator() {
    }

    public void addKisses(IDecoration decoration) {
        if(decoration instanceof Cake){
            System.out.println("1\t\t\tQ25\t\tQ25\t\t\tMINI HERSHEY'S KISSES");
        }
        return;
    }

}