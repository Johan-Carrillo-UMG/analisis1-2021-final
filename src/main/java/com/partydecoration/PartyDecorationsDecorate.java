package com.partydecoration;

import java.util.*;

public abstract class PartyDecorationsDecorate{

    protected IDecoration Decoration;
    
    public PartyDecorationsDecorate() {
        this.Decoration = Decoration;
    }

    public void decorate() {
        this.Decoration.order();
    }

}