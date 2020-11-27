package models;

import org.junit.*;
import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void Deck_instantiatesCorrectly_boolean() {
        Deck newDeck = new Deck();
        assertEquals(true, newDeck instanceof Deck);
    }
    @Test
    public void contains52Cards_checkIfDeckIkoNa52Cards_int() {
        Deck newDeck = new Deck();
        int num = 52;
        newDeck.setCards();
        assertEquals(52, newDeck.contains52Cards());
    }
    @Test
    public void getCardFromDeck_randomlyGets1cardFromDeck_String(){
        Deck newDeck = new Deck();
        newDeck.setCards();
        String str = newDeck.getCardFromDeck();


        assertEquals(true, newDeck.getCards().containsKey(str));
    }
    @Test
    public void getCardFromDeck_get2CardsFromDeck_Strings(){
        Deck newDeck = new Deck();
        newDeck.setCards();
        String str = newDeck.getCardFromDeck();
        String str1  = newDeck.getCardFromDeck();
        assertEquals(true, newDeck.getCards().containsKey(str));
        assertEquals(true, newDeck.getCards().containsKey(str1));
    }
    @Test
    public void getCardFromDeck_card1IsNotSameAsCard2_String() {
        Deck newDeck = new Deck();
        newDeck.setCards();
        String str = newDeck.getCardFromDeck();
        String str1  = newDeck.getCardFromDeck();
        Boolean ans = str.equalsIgnoreCase(str1);
        assertNotEquals( true, ans );

    }

    @Test
    public void getValueOfCardPicked_returnsValueOfTheCard() {
        Deck newDeck =  new Deck();
        newDeck.setCards();
        String str = newDeck.getCardFromDeck();

        assertEquals(true, newDeck.getCards().containsValue(newDeck.getValueOfCardPicked(str)) );
    }
    @Test
    public void getValueOfCardPicked_returnsValueOf2Cards() {
        Deck newDeck =  new Deck();
        newDeck.setCards();
        String str = newDeck.getCardFromDeck();
        String str1 = newDeck.getCardFromDeck();

        assertEquals(true, newDeck.getCards().containsValue(newDeck.getValueOfCardPicked(str)) );
        assertEquals(true, newDeck.getCards().containsValue(newDeck.getValueOfCardPicked(str1)) );
    }
    @Test
    public void getSumOfTwoCardsPicked_returnsValue1PlusValue2(){
        Deck newDeck =  new Deck();
        newDeck.setCards();
        String str = newDeck.getCardFromDeck();
        String str1 = newDeck.getCardFromDeck();
        Integer val1 = newDeck.getValueOfCardPicked(str);
        Integer val2 = newDeck.getValueOfCardPicked(str1);
        assertEquals(true,newDeck.getSumOfTwoCardsPicked(val1, val2) > val1 );
    }

    @Test
    public void addValueTotal_addsCardValueToTotal() {
        Deck testDeck =  new Deck();
        Integer num = 2;
        assertEquals(num, testDeck.addValueTotal(num));
    }
}