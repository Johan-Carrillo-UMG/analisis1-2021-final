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
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("TOTAL\t\t\t\t\t\t\t\tQ1685.00");
        System.out.println("##########################################################################################");
        
    }

}