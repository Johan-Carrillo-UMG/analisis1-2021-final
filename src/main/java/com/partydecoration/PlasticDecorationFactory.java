package com.partydecoration;

import java.util.*;

public class PlasticDecorationFactory implements IDecorationFactory {

    public PlasticDecorationFactory() {
    }


    public IDecoration getDecoration(DecorationType decorationType) {
        switch (decorationType)
        {
            case CHAIR:
                PlasticChair platicChair = new PlasticChair();
                platicChair.order();
                break;

            case TABLE:
                return new PlasticTable();

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