package atetc;

/**
 * Created by Atetc on 19.11.2015.
 */

import org.junit.Test;
import atetc.chap07.*;

import static org.junit.Assert.assertTrue;

public class TestChap7 {

    @Test
    public void testDeskOfCards_7_1(){
        Q1 card1 = new Q1(1, Q1Cards.Suit.CLUBS);
        Q1 card2 = new Q1(2, Q1Cards.Suit.CLUBS);
        Q1 card3 = new Q1(10, Q1Cards.Suit.CLUBS);
        assertTrue(card1.value() >  card2.value());
        assertTrue(card2.value() <  card3.value());
        assertTrue(card3.value() <  card1.value());
    }

    @Test
    public void testCallCentre_7_2(){
        Q2 callCentre = new Q2(3);

        assertTrue(callCentre.getCallHandler() instanceof Q2.Fresher);
        Q2.Call call1 = callCentre.call();

        assertTrue(callCentre.getCallHandler() instanceof Q2.Fresher);
        Q2.Call call2 = callCentre.call();

        assertTrue(callCentre.getCallHandler() instanceof Q2.Fresher);
        Q2.Call call3 = callCentre.call();

        assertTrue(callCentre.getCallHandler() instanceof Q2.TechLead);
        Q2.Call call4 = callCentre.call();

        assertTrue(callCentre.getCallHandler() instanceof Q2.ProductManager);
        Q2.Call call5 = callCentre.call();
        call5.handled();

        assertTrue(callCentre.getCallHandler() instanceof Q2.ProductManager);
        Q2.Call call6 = callCentre.call();

        assertTrue(callCentre.getCallHandler() == null);
    }
}