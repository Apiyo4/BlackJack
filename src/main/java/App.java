import models.Deck;
import models.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Player dealer = new Player("dealer");
        Player player1 = new Player("player1");
        Deck newDeck = new Deck();
        newDeck.setCards();
        String card1P = newDeck.getCardFromDeck();
        String card2P = newDeck.getCardFromDeck();
        Integer val1P = newDeck.getValueOfCardPicked(card1P);
        Integer val2P = newDeck.getValueOfCardPicked(card2P);
        Integer totalP = newDeck.getSumOfTwoCardsPicked(val1P, val2P);
        player1.setTotalvalue(totalP);

        String card1D = newDeck.getCardFromDeck();
        String card2D = newDeck.getCardFromDeck();
        Integer val1D = newDeck.getValueOfCardPicked(card1D);
        Integer val2D = newDeck.getValueOfCardPicked(card2D);
        Integer totalD = newDeck.getSumOfTwoCardsPicked(val1D, val2D);
        dealer.setTotalvalue(totalD);

        if (player1.getTotalvalue() == 21) {
            System.out.println("Player 1 wins");
        }
        else if (player1.getTotalvalue() > 21) {
            System.out.println("Dealer wins");
        }
        else if (dealer.getTotalvalue() == 21) {
            System.out.println("Dealer 1 wins");
        }
        else if (dealer.getTotalvalue() > 21) {
            System.out.println("Player1 wins");
        }
        else {
            String card3P = newDeck.getCardFromDeck();
            Integer numP = newDeck.getValueOfCardPicked(card3P);
            Integer ans = newDeck.addValueTotal(numP);
            player1.setTotalvalue(ans);

            if (player1.getTotalvalue() == 21) {
                System.out.println("Player 1 wins");
            } else if (player1.getTotalvalue() > 21) {
                System.out.println("Dealer wins");
            } else {
                String card3D = newDeck.getCardFromDeck();
                Integer numD = newDeck.getValueOfCardPicked(card3D);
                Integer ans1 = newDeck.addValueTotal(numD);
                dealer.setTotalvalue(ans1);
                if (dealer.getTotalvalue() == 21) {
                    System.out.println("Player 1 wins");
                } else if (dealer.getTotalvalue() > 21) {
                    System.out.println("Dealer wins");
                }
            }
        }

    }
}