package com.partydecoration;

import java.util.*;

public class PartyApp {

    public PartyApp() {
    }

    public static void main(String[] args) {
        
        PartyFacade partyFacade = new PartyFacade();
        
        partyFacade.orderCake();
        partyFacade.orderChair();
        partyFacade.orderFloor();
        partyFacade.orderStereo();
        partyFacade.orderTable();
        
    }

}