import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Card {
  protected String color;
  protected String value;
  protected List<String> cardColors = new ArrayList<>(Arrays.asList("Heart", "Club", "Diamond", "Spade"));
  protected List<String> cardValues = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"));

  public Card(String color, String value) {
    this.color = color;
    this.value = value;
  }

  public Card() {
  color = randomColor();
  value = randomValue();
  }

  @Override
  public String toString() {
    return color + " " + value;
  }

  public String randomColor() {
    Random randomNUmber = new Random();
    int indexOfColor = randomNUmber.nextInt(4);
    return cardColors.get(indexOfColor);
  }

  public String randomValue() {
    Random randomNUmber = new Random();
    int indexOfValue = randomNUmber.nextInt(14);
    return cardValues.get(indexOfValue);
  }
}
