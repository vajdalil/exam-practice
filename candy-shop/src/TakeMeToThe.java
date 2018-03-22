public class TakeMeToThe {
  public static void main(String[] args) {
    CandyShop candyShop = new CandyShop(300);
    candyShop.createSweets(CandyShop.CANDY);
    candyShop.createSweets(CandyShop.CANDY);
    candyShop.createSweets(CandyShop.LOLLIPOP);
    candyShop.createSweets(CandyShop.LOLLIPOP);
    System.out.println(candyShop);
    candyShop.sell(CandyShop.CANDY, 1);
    System.out.println(candyShop);
    candyShop.raise(5);
    candyShop.sell(CandyShop.LOLLIPOP, 1);
    System.out.println(candyShop);
    candyShop.buySugar(300);
    System.out.println(candyShop);
    candyShop.createSweets(CandyShop.CANDY);
    candyShop.createSweets(CandyShop.CANDY);
    candyShop.createSweets(CandyShop.LOLLIPOP);
    candyShop.createSweets(CandyShop.LOLLIPOP);
    System.out.println(candyShop);
    candyShop.raise(5);
    candyShop.sell(CandyShop.LOLLIPOP, 1);
    System.out.println(candyShop);
    candyShop.buySugar(300);
  }
}
