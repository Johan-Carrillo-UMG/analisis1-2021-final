package com.partydecoration;

import java.util.*;

public class WoodDecorationFactory implements IDecorationFactory {

    public WoodDecorationFactory() {
    }


    public IDecoration getDecoration(DecorationType decorationType) {
        switch (decorationType)
        {
            case CHAIR:
                return new WoodChair();

            case TABLE:
                return new WoodTable();

            case  CAKE:
                Cake cake = new Cake();
                cake.order();
                break;

            case FLOOR:
                Floor floor = new Floor();
                floor.order();
                break;

            case STEREO:
                Stereo stereo = new Stereo();
                stereo.order();
                break;

        }
        return null;
    }

}