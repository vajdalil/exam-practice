public class FavouriteAnimals {
  public static void main(String[] args) {
    // The program's aim is to collect your favourite animals and store them in a text file.
    // There is a given text file called '''favourites.txt''', it will contain the animals
    // If ran from the command line without arguments
    // It should print out the usage:
    // ```java FavouriteAnimals [animal] [animal]```
    // You can add as many command line arguments as many favourite you have.
    // One animal should be stored only at once
    // Each animal should be written in separate lines
    // The program should only save animals, no need to print them

    Functions animal = new Functions();

    if (args.length == 0) {
      System.out.println("java FavouriteAnimals [animal] [animal]");
    }else {
        animal.readFile();
        animal.addAnimalToFile(args);
    }
  }
}
