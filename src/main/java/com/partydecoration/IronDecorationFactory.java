package com.partydecoration;

import java.util.*;

public class IronDecorationFactory implements IDecorationFactory{
    
    public IronDecorationFactory() {
    }

    public IDecoration getDecoration(DecorationType decorationType) {
        switch (decorationType)
        {
            case CHAIR:
                return new IronChair();

            case TABLE:
                IronTable ironTable = new IronTable();
                ironTable.order();
                break;

            case  CAKE:
                return new Cake();

            case FLOOR:
                return new Floor();

            case STEREO:
                return new Stereo();

        }
        return null;
    }
}