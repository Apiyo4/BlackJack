package models;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
//import java.util.*;
public class Deck {

    private Map<String, Integer> cards = new HashMap<>();
//    cards={
//            Ac : 1;
//            2d : 2
//    }

    private String[] val1;
    private String[] val2;
    private String[] val3;
    private String[] val4;
    private String[] val5;
    private String[] val6;
    private String[] val7;
    private String[] val8;
    private String[] val9;
    private String[] val10;
//    private String[] val11;
    private String[] types ;
    private ArrayList<String> titles = new ArrayList<>();
    private ArrayList<Integer> repeatIndx = new ArrayList<>();
    public static Integer totalValue = 0;



    public Deck( ){
        this.val1 = new String[] {"a"};
        this.val2 = new String[] {"2"};
        this.val3 = new String[] {"3"};
        this.val4 = new String[] {"4"};
        this.val5 = new String[] {"5"};
        this.val6 = new String[] {"6"};
        this.val7 = new String[] {"7"};
        this.val8 = new String[] {"8"};
        this.val9 = new String[] {"9"};
        this.val10 = new String[] {"10", "j", "k", "q"};
        this.types = new String[] {"c", "d", "h", "s"};


}

    public Map<String, Integer> getCards() {
        return cards;
    }

    public void setCards() {
        addValueCard(this.cards, val1, 1);
        addValueCard(cards, val2, 2);
        addValueCard(cards,val3, 3);
        addValueCard(cards,val4, 4);
        addValueCard(cards,val5, 5);
        addValueCard(cards,val6, 6);
        addValueCard(cards,val7, 7);
        addValueCard(cards,val8, 8);
        addValueCard(cards,val9, 9);
        addValueCard(cards,val10, 10);

        this.cards = cards;
    }

    public int contains52Cards(){

       return getCards().size();
    }
    public void addValueCard(Map<String, Integer> card, String[] strs, Integer num){
        for(String str: strs){
            for(String type : types){
                cards.put(str.concat(type), num);
            }
        }
    }
    public String getCardFromDeck(){
//        {2h: 2, jc: 10, qd: 10 ......} [2h=2, jc=10 ....]
//        [2h, jc, ......]
        for(Map.Entry card:cards.entrySet()){
            this.titles.add(card.getKey().toString());
        }
        Random rand =  new Random();
        Integer indx =  rand.nextInt(51);

       while(repeatIndx.contains(indx)){
           indx =  rand.nextInt(51);
       }
        return titles.get(indx);
    }

    public Integer getValueOfCardPicked(String str){
        String ans =  new String();
        for(HashMap.Entry card: cards.entrySet()){
            if(card.getKey().toString().equalsIgnoreCase(str) ){
                ans = card.getValue().toString();
            }
        }
        Integer num =  Integer.parseInt(ans);

        return num;
    }
    public  Integer getSumOfTwoCardsPicked(Integer a, Integer b){
//        totalValue += 0;
        return a + b;
    }
    public Integer addValueTotal(Integer a){
        return  totalValue += a;
    }


}
//default constructor
//public Deck(){
//
//}