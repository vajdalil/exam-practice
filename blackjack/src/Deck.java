import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

  protected List<Card> deck = new ArrayList<>();
  protected int countHearts;
  protected int countClubs;
  protected int countSpades;
  protected int countDiamonds;




  public Deck(int numberOfCards) {
    for (int i = 0; i < numberOfCards; i++) {
      Card card = new Card();
      if (!(deck.contains(card))) {
        deck.add(card);
        if (card.color == "Heart") {
          countHearts++;
        } else if (card.color == "Club") {
          countClubs++;
        } else if (card.color == "Spade") {
          countSpades++;
        } else if (card.color == "Diamond") {
          countDiamonds++;
        }
      }
    }
  }

    /*for (int i = 0; i < numberOfCards; i++) {
      Random rand = new Random();
      int  cardColor = rand.nextInt(4) + 1;
      int  cardNumber = rand.nextInt(14) + 1;
      if (cardColor == 1 ) {
        currentCard.color = "Heart";
        countHearts++;
      } else if ( cardColor == 2) {
        currentCard.color = "Club";
        countClubs++;
      } else if ( cardColor == 3) {
        currentCard.color = "Spade";
        countSpades++;
      } else if ( cardColor == 4) {
        currentCard.color = "Diamond";
        countDiamonds++;
      }
      if (cardNumber == 14 ) {
        currentCard.value = "Ace";
      } else if (cardNumber == 13 ) {
        currentCard.value = "King";
      } else if (cardNumber == 12 ) {
        currentCard.value = "Queen";
      } else if (cardNumber == 11 ) {
        currentCard.value = "King";
      } else {
        currentCard.value = String.valueOf(cardNumber);
      }
      if (!(deck.contains(card))){
        deck.add(currentCard);
        }
    }*/

  public Card draw(){
    Card drawn = deck.get(0);
    deck.remove(0);
    if (drawn.color == "Heart") {
      countHearts--;
    } else if (drawn.color == "Club") {
      countClubs--;
    }if (drawn.color == "Spade") {
      countSpades--;
    }if (drawn.color == "Diamond") {
      countDiamonds--;
    }
    return drawn;
  }

  public void shuffle(){
    Collections.shuffle(deck);
  }

  @Override
  public String toString() {
    return deck.size() + " cards - " + countClubs + " Clubs, " + countDiamonds + " Diamonds, "
            + countHearts + " Hearts, " + countSpades + " Spades";
  }
}
