import java.util.ArrayList;
import java.util.List;

public class CandyShop {

  private static final double SUGAR_PRICE_1GR = 0.1;

  private int sugarAmount;
  private double income;
  private int candysAmount;
  private int lollipopAmount;
  protected List <Sweets> inventory = new ArrayList<>();
  protected static final Candy CANDY = new Candy();
  protected static final Lollipop LOLLIPOP = new Lollipop();


  public CandyShop(int sugarAmount) {
    this.sugarAmount = sugarAmount;
  }

  public void createSweets(Sweets sweets) {
    inventory.add(sweets);
    if (sweets == CANDY) {
      candysAmount++;
    } else {
      lollipopAmount++;
    }
    sugarAmount -= sweets.sugarGramm;
  }

  public void sell(Sweets sweets, int amount) {
    if (inventory.size() != 0) {
      income += amount * sweets.priceDollar;
      for (int i = 0; i < amount ; i++) {
        inventory.remove(sweets);
      }

      /* for (Sweet actualSweet : inventory) {
      if (actualSweet instanceof Lollipop) {
      lolAmount--;
      inventory.remove(actualSweet)
      }
      }
       */
    }
    if (sweets == CANDY && candysAmount != 0) {
      candysAmount = candysAmount - amount;
    } else if (sweets == LOLLIPOP && lollipopAmount != 0) {
      lollipopAmount = lollipopAmount - amount;
    }
  }

  public void buySugar(int sugarAmount) {
    this.sugarAmount += sugarAmount;
    income = income - sugarAmount * SUGAR_PRICE_1GR;
  }

  public void raise(int percentage) {
      CANDY.priceDollar += CANDY.priceDollar * percentage / 100;
      LOLLIPOP.priceDollar += LOLLIPOP.priceDollar * percentage / 100;
  }

  @Override
  public String toString() {
    return "Inventory: " + candysAmount + " candies, " + lollipopAmount + " lollipops, Income: " + income + "$, Sugar: " + sugarAmount + "gr";
  }
}
